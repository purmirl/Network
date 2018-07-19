/**
 * Project Computer Networking Introduce
 * copyright PeTrA (c) 2018 All rights reserved.
 * Republic Of Korea, Seoul :: https://github.com/purmirl
 */

package Function;

/**
 * Manchester Class
 * @author PeTrA
 * 
 * The Manchester code, developed in the University of Manchester.
 */
public class Manchester {
	private int previousData;
	private int currentData;
	private String upwardTransition;
	private String downwardTransition;
	private String errorTransition;
	
	public Manchester() {
		init();
	}
	
	private void init() {
		this.previousData = -1;
		this.currentData = -1;
		this.upwardTransition = "UP";
		this.downwardTransition = "DOWN";
		this.errorTransition = "ERROR";
	}
	
	/**
	 * Manchester Encoding Logic.
	 * Digital data -> Digital signal.
	 * If digital data is 0 : digital signal is downward transition. ก้
	 * If digital data is 1 : digital signal is upward transition. ก่
	 * ------
	 * @param digitalData
	 * @return
	 */
	public String manchesterEncoding(int digitalData) {
		if(digitalData == 0) {
			return this.downwardTransition;
		}else if(digitalData == 1) {
			return this.upwardTransition;
		}else {
			return this.errorTransition;
		}	
	}
}
