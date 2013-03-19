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
	String message = "Hello World!";
	System.out.println(message);
	JOptionPane.showMessageDialog(Cytoscape.getDesktop(), message);
    }
}