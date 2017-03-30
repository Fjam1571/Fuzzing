/**
 * This class creates a node for a Doubly Linked List.
 * @author Thomas Berkey
 *
 */
public class Node<E> {
	private E element;
    private Node nextNode;
    private Node prevNode;

    /**
     * Constructor that creates a Node for a DoublyLinkedList
     * @param element	The value of the Node.
     * @param next		The Node that is ordered after this Node.
     * @param prev		The Node that is ordered before this Node.
     */
    public Node(E element, Node next, Node prev) {
        this.element = element;
        this.nextNode = next;
        this.prevNode = prev;
    }
    
    /**
     * Returns the value of the Node
     * @return	the value of the Node
     */
    public E getElement(){
    	return element;
    }
    
    /**
     * Gets the next Node.
     * @return The next Node.
     */
    public Node getNext(){
    	return nextNode;
    }
    
    /**
     * Gets the previous Node.
     * @return The previous Node.
     */
    public Node getPrev(){
    	return prevNode;
    }
    
    /**
     * Sets the next Node.
     * @param n	The next Node.
     */
    public void setNext(Node n){
    	nextNode = n;
    }
    
    /**
     * Sets the previous Node.
     * @param n	The previous Node.
     */
    public void setPrev(Node n){
    	prevNode = n;
    }
}