package spicicluster;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

import cytoscape.plugin.CytoscapePlugin;
import cytoscape.util.CytoscapeAction;
import cytoscape.Cytoscape;
import cytoscape.plugin.CytoscapePlugin;
import cytoscape.util.CytoscapeAction;

/**
 * This plugin clusters a Cytoscape network by creating a new attribute
 * and assigning values to each of the modules based on which cluster they
 * belong to. 
 *
 * The underlying clustering algorithm is SPICi.
 */
public class SpiciClusterPlugin extends CytoscapePlugin {

    /**
     * This constructor creates an acction and adds it to Plugins menu.
     */
    public SpiciClusterPlugin() {
	// Create a new action

	MyPluginMenuAction menuAction = new MyPluginMenuAction(this);
	Cytoscape.getDesktop().getCyMenus().addCytoscapeAction((CytoscapeAction) menuAction);
    }

    public class MyPluginMenuAction extends CytoscapeAction {
	public MyPluginMenuAction(SpiciClusterPlugin myPlugin) {
	    super("SPICI");
	    setPreferredMenu("Plugins");
	}

	public void actionPerformed(ActionEvent e) {
	    JOptionPane.showMessageDialog(Cytoscape.getDesktop(), "Spici was selected");
	}
    }

}