/**
 * Project Computer Networking Introduce
 * copyright PeTrA (c) 2018 All rights reserved.
 * Republic Of Korea, Seoul :: https://github.com/purmirl
 */

package Function;

import java.net.ServerSocket;

/**
 * TCPServer Class
 * @author PeTrA
 *
 *
 */
public class TCPServer {
	private int serverPortNumber;
	private ServerSocket serverSocket;
	
	public TCPServer(int _serverPortNumber, ServerSocket _serverSocket) {
		this.serverPortNumber = _serverPortNumber;
		this.serverSocket = _serverSocket;
	}
	
	
	
}
