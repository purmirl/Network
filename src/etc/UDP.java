/**
 * Project Computer Networking Introduce
 * copyright PeTrA (c) 2019 All rights reserved.
 * Republic Of Korea, Seoul :: https://github.com/purmirl
 */
package Protocol;

/**
 * UDP Class
 * @author PeTrA
 *
 * UDP : User Datagram Protocol
 * 
 * Transport layer protocol
 * 
 * Standard : RFC 768, 1122
 * Protocol ID : 17
 * ------
 * Reference
 *  https://en.wikipedia.org/wiki/User_Datagram_Protocol
 *  http://www.ktword.co.kr/abbr_view.php?m_temp1=323
 */
public class UDP {
	/**
	 * Header value.
	 */
	private byte[] sourceIpAddress;
	private byte[] destinationIpAddress;
	private byte[] sourcePort;
	private byte[] destinationPort;
	private byte[] length;
	
	
}
