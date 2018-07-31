/**
 * Project Computer Networking Introduce
 * copyright PeTrA (c) 2018 All rights reserved.
 * Republic Of Korea, Seoul :: https://github.com/purmirl
 */

package Function;

public class TCPClient {
	private String ip;
	private int port;
	
	public TCPClient(String _ip, int _port) {
		this.ip = _ip;
		this.port = _port;
	}
	
	public void setConnectionIpAddress(String _ip) {
		this.ip = _ip;
	}
	
	public void setConnectionPortNumber(int _port) {
		this.port = _port;
	}
}
