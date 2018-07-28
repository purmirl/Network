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
	
	/**
	 * Enqueue function.
	 * @param _queueNode
	 * 
	 * Add one node into the queue.
	 */
	public void enqueue(QueueNode _queueNode) {
		this.trailQueueNode.getPrevQueueNode().setNextQueueNode(_queueNode);
		_queueNode.setPrevQueueNode(this.trailQueueNode.getPrevQueueNode());
		this.trailQueueNode.setPrevQueueNode(_queueNode);
		_queueNode.setNextQueueNode(this.trailQueueNode);
	}
	
	/**
	 * Dequeue function.
	 * @return
	 * 
	 * Get one node from the queue.
	 */
	public QueueNode dequeue() {
		QueueNode output = this.headQueueNode.getNextQueueNode();
		this.headQueueNode.getNextQueueNode().getNextQueueNode().setPrevQueueNode(this.headQueueNode);
		this.headQueueNode.setNextQueueNode(this.headQueueNode.getNextQueueNode().getNextQueueNode());
		return output;
	}
	
	public int length() {
		return this.queueLength;
	}
	
	
}
