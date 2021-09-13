public class SinglyLinkedList
{
	class Node
	{
		int data;
		Node next;

		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}

	public Node head=null;
	public Node tail=null;

	public void addNode(int data)
	{
		Node newNode=new Node(data);

		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}

		else
		{
			tail.next=newNode;
			tail=newNode;
		}
	}

	public void display()
	{
		Node current=head;

		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}

		System.out.println("Nodes of Singly Linked List : ");
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}

	public static void main(String args[])
	{
		SinglyLinkedList slist=new SinglyLinkedList();
	
		slist.addNode(50);
		slist.addNode(10);
		slist.addNode(5);
		slist.addNode(80);

		slist.display();

	}

}