/**
 * Project Computer Networking Introduce
 * copyright PeTrA (c) 2018 All rights reserved.
 * Republic Of Korea, Seoul :: https://github.com/purmirl
 */

package Protocol;

/**
 * HDLC Class
 * @author PeTrA
 *
 * HDLC : High-Level Data Link Control
 * 
 * Synchronous data link layer protocol
 * 
 * ISO 3309-1979 : Frame Structure
 * ISO 4335-1979 : Elements of Procedure
 * ISO 6159-1980 : Unbalanced Classes of Procedure
 * ISO 6256-1981 : Balanced Classes of Procedure
 * 
 * Current standard :: ISO/IEC 13239:2002
 * ------
 * Reference
 *  https://en.wikipedia.org/wiki/High-Level_Data_Link_Control
 *  http://www.ktword.co.kr/abbr_view.php/abbr_view.php?m_temp1=89&m_search=%ED%95%98
 */
public class Hdlc {
	/**
	 * Stream value
	 */
	private byte[] byteStream;
	private byte[] firstFlagStream;
	private byte[] addressStream;
	private byte[] controlFieldStream;
	private byte[] informationDataStream;
	private byte[] manageInformationDataStream;
	private byte[] crcStream;
	private byte[] lastFlagStream;
	
	/**
	 * Data value
	 */
	private String addressData;
	private String frameData;
	
	
	public Hdlc(byte[] _byteStream) {
		init();
		this.byteStream = _byteStream;
	}
	
	public void init() {
		this.byteStream = null;
		this.firstFlagStream = null;
		this.addressStream = null;
		this.controlFieldStream = null;
		this.informationDataStream = null;
		this.manageInformationDataStream = null;
		this.crcStream = null;
		this.lastFlagStream = null;
		this.addressData = "NO DATA";
		this.frameData = "NO DATA";
	}
	
	
	
	
	
}
