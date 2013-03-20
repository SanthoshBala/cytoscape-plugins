import org.cytoscape.app.swing.AbstractCySwingApp;
import org.cytoscape.app.swing.CySwingAppAdapter;

public class HideSingletonNodesApp extends AbstractCySwingApp {

    public HideSingletonNodesApp(CySwingAppAdapter adapter) {
	super(adapter);
	
	// Add app customization here
	adapter.getCySwingApplication().addAction(new MenuAction(adapter));
    }
}

