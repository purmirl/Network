/**
 * Project Computer Networking Introduce
 * copyright PeTrA (c) 2018 All rights reserved.
 * Republic Of Korea, Seoul :: https://github.com/purmirl
 */

package Function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * TCP Client class.
 * @author PeTrA
 * 
 * TCP Client Pseudo code.
 * In consist connection, try to thread function.
 */
public class TCPClient {
	private String ip;
	private int port;
	private Socket socket;
	private BufferedReader input;
	private OutputStream output;
	
	
	public TCPClient(String _ip, int _port) {
		this.ip = _ip;
		this.port = _port;
	}
	
	/**
	 * Set connection ip address.
	 * @param _ip
	 */
	public void setConnectionIpAddress(String _ip) {
		this.ip = _ip;
	}
	
	/**
	 * Set connection port number.
	 * @param _port
	 */
	public void setConnectionPortNumber(int _port) {
		this.port = _port;
	}
	
	/**
	 * Connect to tcp server.
	 * @throws UnknownHostException
	 * @throws IOException
	 */
	public void connectTCP() throws UnknownHostException, IOException {
		this.socket = new Socket(this.ip, this.port);
		this.input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		this.output = socket.getOutputStream();
	}
	
	/**
	 * Disconnect tcp connection.
	 * @throws IOException
	 */
	public void disconnectTCP() throws IOException {
		this.input.close();
		this.output.close();
		this.socket.close();
	}
}
