/**
 * This class creates a Doubly Linked List.
 * @author Thomas Berkey
 */
public class DoublyLinkedList<E> {

	private Node first;
    private Node last;
    private int size;
    
    /**
     * Constructor to create a new, empty DoublyLinkedList.
     */
    public DoublyLinkedList(){
    	first = null;
    	last = null;
    	size = 0;
    }
    
    /**
     * Inserts a Node at the start of the DoublyLinkedList
     * @param element	The value of the Node to insert.
     */
    public void insertFirst(E element) {
        Node node = new Node(element, first, null);
        
        // If the list is not empty, set the first Node's previous Node to the new one.
        if(!isEmpty())
        	first.setPrev(node);
        
        // Set the first Node to the new one.
        first = node;
        
     // If the list is empty, set the last Node to the new one.
        if(isEmpty())
        	last = node;
        
        size++;
    }
    
    /**
     * Inserts a Node at the end of the DoublyLinkedList
     * @param element	The value of the Node to insert.
     */
    public void insertLast(E element) {
        Node node = new Node(element, null, last);
        
        // If the list is  empty, set the first Node to the new one.
        if(isEmpty())
        	first = node;
        
     // If the list is not empty, set the last Node's next Node to the new one.
        if(!isEmpty())
        	last.setNext(node);
        
        // Set the last Node to the new one.
        last = node;
        
        size++;
    }
    
    /**
     * Insert a Node at the position, or end if the position is too large.
     * @param position	The index to place the Node at.
     * @param element	The value of the Node to insert.
     */
    public void insertItemAt(int position, E element){
    	Node node = new Node(element, null, null);
    	Node temp = first;
    	Node tempPrev;
    	Node tempNext;
    	
    	if (position == 0){
    		insertFirst(element);
    		return;
    	}
    	
    	// Check if the position is negative.
    	if (position < 0)
    		return;
    	// Check if the position is larger than the size. If so, place on end.
    	else if (position >= size){
    		insertLast(element);
    		return;
    	}
    	else
    		// Loop to find the position
    		for (int i = 0; i < position; i++)
    			temp = temp.getNext();
    	
    	// Make connections
    	tempPrev = temp.getPrev();
    	temp.setPrev(node);
    	tempNext = temp;
    	temp = temp.getPrev();
    	temp.setNext(tempNext);
    	temp.setPrev(tempPrev);
    	if (tempPrev != null)
    		tempPrev.setNext(temp);
    	
    	size++;
    }
    
    /**
     * Removes the Node at the position.
     * @param position	The position of the Node to remove.
     */
    public void removeItemAt(int position){
    	Node temp = first;
    	Node tempPrev;
    	Node tempNext;
    	
    	// Check if the position is negative or if the position is larger than the size.
    	if (position < 0 || position >= size)
    		return;
    	else
    		// Loop to find the position
    		for (int i = 0; i < position; i++)
    			temp = temp.getNext();
    	
    	// Sever connections
    	tempPrev = temp.getPrev();
    	tempNext = temp.getNext();
    	
    	tempPrev.setNext(tempNext);
    	tempNext.setPrev(tempPrev);
    	
    	temp.setPrev(null);
    	temp.setNext(null);
    	
    	size--;
    }
    
    /**
     * Replaces the item at the given position with the new value.
     * @param position	The position to replace
     * @param element	The value to place in the Node.
     */
    public void replaceAt(int position, E element){
    	removeItemAt(position);
    	insertItemAt(position, element);
    }
    
    /**
     * Gets the value of the Node at the given position
     * @param position	The index of the value to recieve.
     * @return			The value of the Node.
     */
    public E getItemAt(int position){
    	Node temp = first;
    	
    	// Check if the position is negative or if the position is larger than the size.
    	if (position < 0 || position >= size)
    		return null;
    	else
    		// Loop to find the position
    		for (int i = 0; i < position; i++)
    			temp = temp.getNext();
    	
    	return (E) temp.getElement();
    }
    
    /**
     * Gets the size of the DoublyLinkedList
     * @return	The number of Nodes in the DoublyLinkedList.
     */
    public int size(){
    	return size;
    }
    
    /**
     * Determines if the DoublyLinkedList is empty.
     * @return True if the number of Nodes in the DoublyLinkedList is 0, false otherwise.
     */
    public boolean isEmpty(){
    	if (size == 0)
    		return true;
    	return false;
    }
    
    /**
     * Prints the contents of the DoublyLinkedList.
     */
    public void printList(){
    	Node temp = first;
    	for (int i = 0; i < size; i++){
    		System.out.println(temp.getElement());
    		temp = temp.getNext();
    	}
    }
}