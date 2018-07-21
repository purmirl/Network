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
	 * Stream value.
	 */
	private byte[] byteStream;
	private byte[] firstFlagStream;	//	preamble, 8bits.
	private byte[] addressStream;	//	address, 8bits or 16bits(extended).
	private byte[] controlFieldStream;	//	frame type, 8bits.
	private byte[] informationDataStream;	//	I, S frame, variable.
	private byte[] manageInformationDataStream;	//	U frame, variable.
	private byte[] crcStream;	//	16 bits or 32 bits(extended).
	private byte[] lastFlagStream;	//	8 bits
	
	/**
	 * Data value.
	 */
	private String addressData;
	private String frameData;
	
	
	public Hdlc(byte[] _byteStream) {
		init();
		parsingByteStream(_byteStream);
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
	
	private void parsingByteStream(byte[] _byteStream) {
		this.byteStream = _byteStream;
		this.firstFlagStream = hexStringToByteArray("1E");	// flag : 01111110
		this.lastFlagStream = hexStringToByteArray("1E");	// flag : 01111110
		
	}
	
	/**
	 * Get specific data of byte array.
	 * @param _byteStream
	 * @param firstIndex
	 * @param lastIndex
	 * @return
	 */
	private byte[] getSpecificByteArray(byte[] _byteStream, int firstIndex, int lastIndex) {
		int length = lastIndex - firstIndex + 1;
		byte[] result = new byte[length];
		
		for(int i = 0; i < length; i++) {
			result[i] = _byteStream[firstIndex + i];
		}
		
		return result;
	}
	
	/**
	 * Transfer byte array to hex String.
	 * @param _byteStream
	 * @return
	 */
	private String byteArrayToHexString(byte[] _byteStream) {
		StringBuilder stringBuilder = new StringBuilder();
		String result = "";
		for(byte _byte : _byteStream) {
			stringBuilder.append(String.format("%02X", _byte&0xff));
		}
		result = stringBuilder.toString();
		
		return result;
	}
	
	/**
	 * Transfer String to byte array.
	 * @param _hexString
	 * @return
	 */
	private byte[] hexStringToByteArray(String _hexString) {
		byte[] result = new byte[(_hexString.length() / 2)];
		for(int i = 0; i < _hexString.length(); i+=2) {
			result[i / 2] = (byte)((Character.digit(_hexString.charAt(i), 16) << 4) + Character.digit(_hexString.charAt(i + 1), 16));
		}
		
		return result;
	}
}
