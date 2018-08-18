/**
 * Project Computer Networking Introduce
 * copyright PeTrA (c) 2018 All rights reserved.
 * Republic Of Korea, Seoul :: https://github.com/purmirl
 */

package Function;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCPServer Class
 * @author PeTrA
 *
 * In input area, need to use thread function.
 */
public class TCPServer {
	private int serverPortNumber;
	private ServerSocket serverSocket;
	
	public TCPServer(int _serverPortNumber) throws IOException {
		this.serverPortNumber = _serverPortNumber;
		this.serverSocket = new ServerSocket(this.serverPortNumber);
	}
	
	/**
	 * Tcp server open method.
	 * @throws IOException
	 */
	public void tcpServerOpen() throws IOException {
		Socket socket = this.serverSocket.accept();
		InetAddress inetAddress = socket.getInetAddress();	//	inetAddress : The other side's ip address
		
		OutputStream out = socket.getOutputStream();
		InputStream in = socket.getInputStream();
		/**
		 * out : push
		 * in : get
		 */
	}
}
