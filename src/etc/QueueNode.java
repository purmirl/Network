/**
 * Project Computer Networking Introduce
 * copyright PeTrA (c) 2018 All rights reserved.
 * Republic Of Korea, Seoul :: https://github.com/purmirl
 */

package Function;

/**
 * QueueNode Class
 * @author PeTrA
 *
 * Queue's basic node.
 */
public class QueueNode {
	private Object queueData;
	private QueueNode prevQueueNode;
	private QueueNode nextQueueNode;
	
	public QueueNode(Object _queueData, QueueNode _prevQueueNode, QueueNode _nextQueueNode) {
		this.queueData = _queueData;
		this.prevQueueNode = _prevQueueNode;
		this.nextQueueNode = _nextQueueNode;
	}
	
	public void setQueueData(Object _queueData) {
		this.queueData = _queueData;
	}
	
	public void setPrevQueueNode(QueueNode _prevQueueNode) {
		this.prevQueueNode = _prevQueueNode;
	}
	
	public void setNextQueueNode(QueueNode _nextQueueNode) {
		this.nextQueueNode = _nextQueueNode;
	}
	
	public Object getQueueData() {
		return this.queueData;
	}
	
	public QueueNode getPrevQueueNode() {
		return this.prevQueueNode;
	}
	
	public QueueNode getNextQueueNode() {
		return this.nextQueueNode;
	}
}
