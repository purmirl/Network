/**
 * Project Computer Networking Introduce
 * copyright PeTrA (c) 2019 All rights reserved.
 * Republic Of Korea, Seoul :: https://github.com/purmirl
 */
package Function;

/**
 * Permutation Class
 * @author PeTrA
 *
 * Permutation Function
 * n P r = n! / (n-r)!
 * n! = n * (n-1) * (n-2) * ... * (n-r+1)
 */
public class Permutation {
	public Permutation() {}
	
	/**
	 * permutation function.
	 * @param _n
	 * @param _r
	 * @return
	 */
	public static int permutation(int _n, int _r) {
		if((_n <= 0) || (_r <= 0)) {
			/**
			 * Error area.
			 */
			return -1;
		}
		
		int result = factorial(_n) / factorial((_n - _r));
		return result;
	}
	
	/**
	 * factorial function.
	 * @param _n
	 * @return
	 */
	private static int factorial(int _n) {
		if(_n <= 0) {
			/**
			 * Error area.
			 */
			return -1;
		}
		
		int result = 1;
		for(int i = _n; i > 0; i--) {
			result = result * i;
		}
		
		return result;
	}
}
