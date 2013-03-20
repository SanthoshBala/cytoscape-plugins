// Generic Imports
import java.awt.event.ActionEvent;
import org.cytoscape.app.CyAppAdapter;
import org.cytoscape.application.CyApplicationManager;
import org.cytoscape.application.swing.AbstractCyAction;

// App-specific imports



public class SpiciMenuAction extends AbstractCyAction {
    private final CyAppAdapter adapter;
    private String networkFilePath = "./cytoscape.input.network"

    public SpiciMenuAction(CyAppAdapter adapter) {
	super("SPICi", adapter.getCyApplicationManager(),
	      "network", adapter.getCyNetworkViewManager());
	this.adapter = adapter;
	setPreferredMenu("Apps");
    }

    public void actionPerformed(ActionEvent e) {

	SpiciClient spici = new SpiciClient(networkFilePath)
    }
}