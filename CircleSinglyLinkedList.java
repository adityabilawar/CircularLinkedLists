import java.util.NoSuchElementException;

public class CircleSinglyLinkedList {
	private ListNode first;
	private ListNode lastNode;

	/**
	 * Constructs an empty linked list.
	 */
	public CircleSinglyLinkedList() {
		first = null;
	}
	
	public void addFirst(Object element) { 	
		if(first == null) {
			first = new ListNode((Comparable)element, null);
			first.setNext(first);
			lastNode = first;
		}
		else {
			ListNode a = new ListNode((Comparable)element, first);
			ListNode temp = first;
			while(temp!=null) {
				if(temp==lastNode)
					break;
				temp = temp.getNext();
			}
			temp.setNext(a);
			first = a;
		}

	}
	
	public void addLast(Object element) {
		if(first == null) {
			first = new ListNode((Comparable)element, null);
			first.setNext(first);
			lastNode = first;
		}
		else {
			ListNode a = new ListNode((Comparable)element, first);
			ListNode temp = first;
			while(temp!=null) {
				if(temp==lastNode)
					break;
				temp = temp.getNext();
			}
			temp.setNext(a);
			lastNode = a;
		}
	}
	
	public Object removeFirst() {
		if(first == null) {
			throw new NoSuchElementException();
		}
		else {
			Object val = first.getValue();
			first = first.getNext();
			lastNode.setNext(first);
			return val;
		}
	}
	
	public Object removeLast() {
		if(lastNode==null) {
			throw new NoSuchElementException();
		}
		else {
			Object removed = lastNode.getValue();
			ListNode temp = first;
			ListNode prev = null;
			while(temp!=null) {
				if(temp == lastNode)
					break;
				prev = temp;
				temp = temp.getNext();
			}
			prev.setNext(first);
			lastNode = prev;
			return removed;
		}
	}
	public int size() {
		
		int size = 0;
		ListNode temp = first;
		int count = 0;
		while(temp!=null) {
			if(temp==first && count>0)
				break;
			size++;
			temp = temp.getNext();
			count++;
		}
		return size;
	}
	
	public String toString() {
		String output = "";
		ListNode temp = first;
		int count = 0;
		while(temp!=null) {
			if(temp==first && count>0)
				break;
			output+=temp.getValue() + ", ";
			temp = temp.getNext();
			count++;
		}
		return output;
	
	}
	public static void main(String[] args) {
		CircleSinglyLinkedList a = new CircleSinglyLinkedList();
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
		a.addFirst(69);
		a.removeFirst();
		a.removeLast();
		System.out.println(a);
		System.out.println("Size of Circle SLL is: " + a.size());
	}

}


