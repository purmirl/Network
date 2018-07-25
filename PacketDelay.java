/**
 * Project Computer Networking Introduce
 * copyright PeTrA (c) 2018 All rights reserved.
 * Republic Of Korea, Seoul :: https://github.com/purmirl
 */

package Function;

/**
 * Packet transfer delay logic.
 * @author PeTrA
 *
 * Packet delay type:
 *  1) Nodal processing delay
 *  2) Queuing delay
 *  3) Transmission delay
 *  4) Propagation delay
 *  
 * Total nodal delay = Nodal processing delay + Queuing delay + Transmission delay + Propagation delay
 * 
 * 1) Nodal processing delay
 * 	Calculate time of the packet trans where, in the route port.
 * 
 * 2) Queuing delay
 *  Waiting time of the packet in the queue stack.
 *  
 * 3) Transmission delay
 * 	The time it takes to push it to the link.
 * 
 * 4) Propagation delay
 *  Moving time in the link.
 */
public class PacketDelay {
	public PacketDelay() {}
	
	public double nodalProcessingDelay() {
		double result = -1;
		/**
		 * Very small figures (msec)
		 * Sending the packet to the queue after processing the node.
		 */
		return result;
	}
	
	public double queuingDelay() {
		double result = -1;
		/**
		 * msec, or Mu sec.
		 * Very different from situation to situation.
		 */
		return result;
	}
	
	/**
	 * Transmission delay function.
	 * @param _packetLength
	 * @param _bitRate
	 * @return
	 */
	public double transmissionDelay(double _packetLength, double _bitRate) {
		double result = -1;
		/**
		 * Mu sec ~ msec
		 */
		result = _packetLength / _bitRate;
		return result;
	}
	
	public double propagationDelay() {
		double result = -1;
		/**
		 * It depends on the physical medium.
		 * 2 * 100000000 m/s ~ 3 * 100000000 m/s
		 */
		return result;
	}
}
