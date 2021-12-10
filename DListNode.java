public class DListNode
{
	private Object value;
	private DListNode next;
	private DListNode previous;
	public DListNode()
	{
		value= null;
		next = null;
		previous = null;
	}
	public DListNode(Object initValue, DListNode initNext, DListNode initPrev)
	{
		value= initValue;
		next = initNext;
		previous = initPrev;
	}
	


	public Object getValue() {
		return value;
	}
	public DListNode getNext() {
		return next;
	}
	public DListNode getPrevious() {
		return previous;
	}
	public void setNext(DListNode next1) {
		 next = next1;
	}
	public void setValue(Object val1) {
		 value = val1;
	}
	public void setPrevious(DListNode prev1) {
		 previous = prev1;
	}
}
