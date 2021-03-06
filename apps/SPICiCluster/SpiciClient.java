/**
 * A Java client to the SPICi C++ binary.
 * Author: Santhosh Balasubramanian
 */

import java.io.IOException;

public class SpiciClient {
    
    // Instance variables
    private String PATH_TO_CONFIGURE_SCRIPT = "./SPICi/./configure";
    private String PATH_TO_MAKEFILE = "./SPICi/make";
    private String PATH_TO_SPICI_BINARY = "./SPICi/src/./spici";
    private String MODULE_OUTPUT_FILENAME = "./cytoscape.network.modules";
    private String networkFilePath;

    // [0] Constructor
    public SpiciClient(String pathToNetworkFile) {
	this.networkFilePath = pathToNetworkFile;
	return;
    }

    // [1] Run SPICi configure script, which checks for system libraries
    public int configureSource() {

	System.setProperty("user.dir", "./SPICi");
	// Construct command
	String[] command = { this.PATH_TO_CONFIGURE_SCRIPT };
	
	// Execute command
	int retVal = this.executeCommand(command);
	System.setProperty("user.dir", "..");

	return retVal;
    }

    // [2] Make SPICi binary
    public int makeBinary() {
	// Construct command
	String[] command = { this.PATH_TO_MAKEFILE };

	// Execute command
	int retVal = this.executeCommand(command);
	return retVal;
    }

    // [3] Run SPICi binary
    public int runBinary() {
	// Construct command
	String inFilePath = this.networkFilePath;
	String[] command = { this.PATH_TO_SPICI_BINARY, "-i", 
			     inFilePath, "-o", this.MODULE_OUTPUT_FILENAME,
			     "-s", "3", "-m", "2" };

	// Execute command
	int retVal = this.executeCommand(command);
	return retVal;
    }
    
    // Execute any command
    private int executeCommand(String[] command) {
	// Handle possible I/O exceptions
	try {
	    Process process = Runtime.getRuntime().exec(command);
	} catch (IOException e) {
	    return -1;
	}
	
	return 1;
    }

    // Testing script
    public static void main(String[] args) {
	String pathToNetworkFile = "./global.intersection.network";
	SpiciClient spici = new SpiciClient(pathToNetworkFile);
	//       	spici.configureSource();
	//	System.out.println("CONFIGURE");
	//	spici.makeBinary();
	//	System.out.println("MAKE");
	spici.runBinary();
	System.out.println("RUN");
	return;
    }
}