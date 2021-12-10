import java.util.NoSuchElementException;

public class CircleDoublyLinkedList {

    private DListNode firstNode;
    private DListNode lastNode;
    /**
     * Construct an empty list
     */
    public CircleDoublyLinkedList() {
        firstNode = null;
        lastNode = null;
    }
    /**
     * Returns true if the list contains no elements
     */
    public boolean isEmpty() {
        return firstNode == null && lastNode == null;
    }
    /**
     * Inserts the argument as the first element of this list.
     */
    public void addFirst(Object o) {
        if(firstNode == null) {
         firstNode= new DListNode(o, null, null);
         lastNode = firstNode;
         lastNode.setNext(firstNode);;
         firstNode.setPrevious(lastNode);
        }
        else {
          DListNode a = new DListNode(o, firstNode, lastNode);
          lastNode.setNext(a);
          firstNode.setPrevious(a);
          firstNode = a;
        }
    }
    /**
     * Inserts the argument as the last element of this list.
     */

    public void addLast(Object o) {
        if(lastNode == null) {
        	  firstNode= new DListNode(o, null, null);
              lastNode = firstNode;
              lastNode.setNext(firstNode);;
              firstNode.setPrevious(lastNode);
        }
        else {
        	DListNode a = new DListNode(o, firstNode, lastNode);
            lastNode.setNext(a);
            firstNode.setPrevious(a);
            lastNode = a;
        }
    }
    /**
     * Removes and returns the first element of this list.
     */
    public Object removeFirst() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        else {
        	Object a = firstNode.getValue();
        	firstNode = firstNode.getNext();
        	firstNode.setPrevious(lastNode);
        	lastNode.setNext(firstNode);
        	return a;
        }
    }
    /**
     * Removes and returns the last element of this list.
     */
    public Object removeLast() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        else {
        	Object a = lastNode.getValue();
        	lastNode = lastNode.getPrevious();
        	lastNode.setNext(firstNode);
        	firstNode.setPrevious(lastNode);
        	return a;
        }
    }
    /**
     * Returns a String representation of the list.
     */
    public String toString() {
    	String output = "";
		DListNode temp = firstNode;
		int count = 0;
		while(temp!=null) {
			if(temp==firstNode && count>0)
				break;
			output+=temp.getValue() + ", ";
			temp = temp.getNext();
			count++;
		}
		return output;
    }
    /**
     * Returns the number of elements in the list as an int.
     */
    public int size() {
    	
		int size = 0;
		DListNode temp = firstNode;
		int count = 0;
		while(temp!=null) {
			if(temp==firstNode && count>0)
				break;
			size++;
			temp = temp.getNext();
			count++;
		}
		return size;
    }
    /**
     * Removes all of the elements from this list.
     */
    private void clear() {
        firstNode = new DListNode(null, null, null);
        lastNode = new DListNode(null, null, null);
    }
    /**
     * Returns a DListIterator.
     */
//    public DListIterator iterator() {
//        return new DListIterator(this);
//    }
    public static void main(String[] args) {
        CircleDoublyLinkedList a = new CircleDoublyLinkedList();
        a.addFirst(6);
        a.addFirst(5);
        a.addLast(7);
        a.addFirst(4);
        a.addFirst(3);
        a.addFirst(2);
        a.addLast(8);
        a.addFirst(1);
        a.addLast(9);
        a.addLast(10);
        a.addLast(11);
        a.addFirst(99);
        a.removeFirst();
        a.removeLast();
        a.addLast(1232);
        a.removeLast();
        System.out.println(a);
        System.out.println("Size of Circle DLL is: " + a.size());

    }

}