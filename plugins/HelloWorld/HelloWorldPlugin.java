import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import cytoscape.Cytoscape;
import cytoscape.plugin.CytoscapePlugin;
import cytoscape.util.CytoscapeAction;

/**
 * A menu item "Hello World" will appear at Plugins menu. Click on the menu
 * item, a message dialog will show up.
 */
public class HelloWorldPlugin extends CytoscapePlugin {

    public HelloWorldPlugin() {
	String message = "LOADED AND HELLO WORLD!";
	System.out.println(message);
	JOptionPane.showMessageDialog(Cytoscape.getDesktop(), message);
	//	PluginMenuAction menuAction = new PluginMenuAction(this);
    }

    //    public class PluginMenuAction extends CytoscapeAction {
	
    //	public PluginMenuAction(HelloWorldPlugin hwPlugin) {
    //	    super("Hello World");
    //	    setPreferredMenu("Plugins");
    //	}

    //	public void actionPerformed(ActionEvent e) {
    //	    JOptionPane.showMessageDialog(Cytoscape.getDesktop(), "HELLO");
    //	}
    //  }
}