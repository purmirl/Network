/**
 * Project Computer Networking Introduce
 * copyright PeTrA (c) 2018 All rights reserved.
 * Republic Of Korea, Seoul :: https://github.com/purmirl
 */

package Function;

/**
 * Shannon Class.
 * @author PeTrA
 *
 * For Claude Elwood Shannon(1916-2001)
 */
public class Shannon {
	public Shannon() {}

	/**
	 * Shannon Theorem :: Information Capacity Theorem
	 * " C = B * log2(1 + S/N) "
	 * C = Channel Capacity
	 * B = Available Bandwidth
	 * S = Received Signal Power
	 * N = Noise Power
	 * 
	 * The Shannon Theorem
	 * Shannon First Theorem : Source Coding Theorem
	 * Shannon Second Theorem : Channel Coding Theorem
	 * Shannon Third Theorem : Information Capacity Theorem
	 * 
	 * @param bandwidth
	 * @param receivedSignalPower
	 * @param noisePower
	 * @return channelCapacity
	 */
	public static long shannonTheorem(long bandwidth, long receivedSignalPower, long noisePower) {
		long channelCapacity = -1;
		channelCapacity = bandwidth * log2(1 + (receivedSignalPower / noisePower));
		
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
