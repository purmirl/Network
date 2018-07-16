/**
 * Project Computer Networking Introduce
 * copyright PeTrA (c) 2018 All rights reserved.
 * Republic Of Korea, Seoul :: https://github.com/purmirl
 */

package Function;

/**
 * Nyquist Class
 * @author PeTrA
 * 
 * For Harry Nyquist(1889-1976)
 */
public class Nyquist {
	public Nyquist() {}
	
	/**
	 * Nyquist Channel Capacity Logic.
	 * " C = 2B * log2 (M) "
	 * C : Channel Capacity
	 * B = Bandwidth
	 * M = signalCountNumber
	 * 
	 * The Nyquist Channel Capacity Logic (NCL) don't care about any noise.
	 * The formula for considering noise is Shannon's logic.
	 * ------
	 * @param bandwidth
	 * @param signalCountNumber
	 * @return channelCpacity
	 */
	public static long nyquistChannelCapacity(long bandwidth, long signalCountNumber) {
		long channelCapacity = -1;
		channelCapacity = 2 * bandwidth * (log2(signalCountNumber));
		
		return channelCapacity;
	}
	
	/**
	 * log2 function.
	 * @param number
	 * @return
	 */
	private static long log2(long number) {
		long result = -1;
		result = (long) (Math.log(number) / Math.log(2));
		
		return result;
	}
}
