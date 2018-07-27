/**
 * Project Computer Networking Introduce
 * copyright PeTrA (c) 2018 All rights reserved.
 * Republic Of Korea, Seoul :: https://github.com/purmirl
 */

package Function;

/**
 * Queue Class
 * @author PeTrA
 *
 * Queue : Abstract data type
 * First in first out data structure. (FIFO)
 * In Switch, Router, It is used as a place where packets wait.
 * (Queue delay)
 * ------
 * Time complexity in big O notation.
 * Algorithm	Average	Worst case
 * Space		O(n)	O(n)
 * Search		O(n)	O(n)
 * Insert		O(1)	O(1)
 * Delete		O(1)	O(1)
 *
 * Reference : https://en.wikipedia.org/wiki/Queue_(abstract_data_type)
 */
public class Queue {
	private QueueNode headQueueNode;
	private QueueNode trailQueueNode;
	private int queueLength;
	
	public Queue() {
		this.headQueueNode = null;
		this.trailQueueNode = null;
		this.queueLength = 0;
	}
	
	public void enqueue(QueueNode _queueNode) {
		this.trailQueueNode.getPrevQueueNode().setNextQueueNode(_queueNode);
		_queueNode.setPrevQueueNode(this.trailQueueNode.getPrevQueueNode());
		this.trailQueueNode.setPrevQueueNode(_queueNode);
		_queueNode.setNextQueueNode(this.trailQueueNode);
	}
	
	public void dequeue() {
		QueueNode output = this.headQueueNode.getNextQueueNode();
		
		
	}
	
	public int length() {
		return this.queueLength;
	}
	
	
}
