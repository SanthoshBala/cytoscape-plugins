import org.cytoscape.app.swing.AbstractCySwingApp;
import org.cytoscape.app.swing.CySwingAppAdapter;

public class SpiciClusterApp extends AbstractCySwingApp {
    
    public SpiciClusterApp(CySwingAppAdapter adapter) {
	super(adapter);

	// Add app customization here
	adapter.getCySwingApplication().addAction(new SpiciMenuAction(adapter));
    }
}