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
	private String previousSignal;
	private String upwardTransition;
	private String downwardTransition;
	private String errorTransition;
	
	public Manchester() {
		init();
	}
	
	private void init() {
		this.previousSignal = "";
		this.upwardTransition = "DOWN_TO_UP";
		this.downwardTransition = "UP_TO_DOWN";
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
	
	/**
	 * Differencial Manchester Encoding Logic.
	 * Digital data -> Digital signal.
	 * Start is UP.
	 * 0 : ! before start.
	 * 1 : no ! before start.
	 * Every middle side of one data has ! motion.
	 * ------
	 * @param digitalData
	 * @return
	 */
	public String differentialManchesterEncoding(int digitalData) {
		if(this.previousSignal.equals("")) {
			// first data.
			if(digitalData == 0) {
				this.previousSignal = "DOWN_TO_UP";
				return this.upwardTransition;
			}else if(digitalData == 1) {
				this.previousSignal = "UP_TO_DOWN";
				return this.downwardTransition;
			}else {
				this.previousSignal = "ERROR";
				return this.errorTransition;
			}
		}
		
		if(digitalData == 0) {
			if(this.previousSignal.equals("DOWN_TO_UP")) {
				this.previousSignal = "DOWN_TO_UP";
				return this.upwardTransition;
			}else if(this.previousSignal.equals("UP_TO_DOWN")) {
				this.previousSignal = "UP_TO_DOWN";
				return this.downwardTransition;
			}
		}else if(digitalData == 1) {
			if(this.previousSignal.equals("DOWN_TO_UP")) {
				this.previousSignal = "DOWN_TO_UP";
				return this.upwardTransition;
			}else if(this.previousSignal.equals("UP_TO_DOWN")) {
				this.previousSignal = "UP_TO_DOWN";
				return this.downwardTransition;
			}
		}else {
			this.previousSignal = "ERROR";
			return this.errorTransition;
		}
		
		this.previousSignal = "ERROR";
		return this.errorTransition;
	}
}
