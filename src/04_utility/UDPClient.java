/**
 * Project Computer Networking Introduce
 * copyright PeTrA (c) 2018 All rights reserved.
 * Republic Of Korea, Seoul :: https://github.com/purmirl
 */

package Function;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * UDP Client class.
 * @author PeTrA
 *
 * UDP Client Pseudo code.
 * Non persistant connection.
 * 
 * Reference : https://en.wikipedia.org/wiki/User_Datagram_Protocol
 */
public class UDPClient {
	private String ip;
	private int port;

	public UDPClient(String _ip, int _port) {
		this.ip = _ip;
		this.port = _port;
	}
	
	public void setServerIpAddress(String _ip) {
		this.ip = _ip;
	}
	
	public void setServerPortNumber(int _port) {
		this.port = _port;
	}
	
	public void receive() throws SocketException {
		while(true) {
			DatagramSocket socket = new DatagramSocket(1234);
		}
	}
	
	/**
	 * Send String data into the udp datagram socket function.
	 * @param _data
	 * @throws IOException
	 */
	public void send(String _data) throws IOException {
		DatagramSocket socket = new DatagramSocket();
		InetAddress address = InetAddress.getByName(this.ip);
		DatagramPacket sendData = new DatagramPacket(_data.getBytes(), _data.getBytes().length, address, this.port);
		
		socket.send(sendData);
		socket.close();
	}
}
