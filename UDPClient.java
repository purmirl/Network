/**
 * Project Computer Networking Introduce
 * copyright PeTrA (c) 2018 All rights reserved.
 * Republic Of Korea, Seoul :: https://github.com/purmirl
 */

package Function;

import java.net.DatagramSocket;

/**
 * UDP Client class.
 * @author PeTrA
 *
 * UDP Client Pseudo code.
 * Non persistant connection.
 */
public class UDPClient {
	private String ip;
	private int port;
	private DatagramSocket socket;

	public UDPClient(String _ip, int _port, DatagramSocket _socket) {
		this.ip = _ip;
		this.port = _port;
		this.socket = _socket;
	}
	
	public void setServerIpAddress(String _ip) {
		this.ip = _ip;
	}
	
	public void setServerPortNumber(int _port) {
		this.port = _port;
	}
	
	public void setSocket(DatagramSocket _socket) {
		this.socket = _socket;
	}
}
