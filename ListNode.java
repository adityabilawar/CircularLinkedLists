public class ListNode 
{
	private Comparable listNodeValue;
	private ListNode nextListNode;

	public ListNode()
	{
		listNodeValue = null;
		nextListNode = null;
	}

	public ListNode(Comparable value, ListNode next)
	{
		listNodeValue=value;
		nextListNode=next;
	}

	public Comparable getValue()
	{
		return listNodeValue;
	}

	public ListNode getNext()
	{
	   return nextListNode;
	}

	public void setValue(Comparable value)
	{
		listNodeValue = value;
	}

	public void setNext(ListNode next)
	{
		nextListNode = (ListNode)next;
	}
}