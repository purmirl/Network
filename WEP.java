/**
 * Project Computer Networking Introduce
 * Copyright PeTrA (c) 2020 All rights reserved.
 * Repulbic of Korea (South Korea)
 * 
 * Network Pseudo Code Project 2.0
 */
package Function;

/**
 * WEP Class.
 * ------
 * WEP : Wired Equivalent Privacy
 *  -->> The basic encryption modul of wireless network computing.
 *  . IEEE 802.11
 *  . Using RC4 encryption module. 
 *  . Using IV (Initial Vector) with shared WEP key. -->> RC4 Algorithm -->> Key stream.
 *  . Using ICV (Integrity Check Value) for integrity verification.
 *  . (Key Stream ) XOR (plaintext + ICV) -->> cryptogram.
 *  . Data : IV + cryptogram.
 *  
 *  . Static & Dynamic WEP
 * @author PeTrA
 *
 * WEP is dangerous module becasue of vulnerability.
 */
public class WEP {
	/**
	 * value
	 */
	private byte[] IV;
	private byte[] ICV;
	private byte[] WEP_KEY;
	private byte[] PLAINTEXT;
	/**
	 * result data
	 */
	private byte[] DATA;
	
	/**
	 * init function
	 */
	public WEP() {}
	
	public void setIV(byte[] _iv) {
		this.IV = _iv;
		return;
	}
	
	public byte[] getIV() {
		return this.IV;
	}
	
	public void setICV(byte[] _icv) {
		this.ICV = _icv;
		return;
	}
	
	public byte[] getICV() {
		return this.ICV;
	}
	
	public void setWepKey(byte[] _wepKey) {
		this.WEP_KEY = _wepKey;
		return;
	}
	
	public byte[] getWepKey() {
		return this.WEP_KEY;
	}
	
	public void setPlaintText(byte[] _plaintText) {
		this.PLAINTEXT = _plaintText;
		return;
	}
	
	public byte[] getPlaintText() {
		return this.PLAINTEXT;
	}
}
