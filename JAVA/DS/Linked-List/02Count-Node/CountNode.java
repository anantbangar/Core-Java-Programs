public class CountNode
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
	
		if(current==null)
		{
			System.out.println("List is empty");
		}

		else
		{
			System.out.println("Nodes in list : ");
			while(current!=null)
			{
				System.out.print(current.data+" ");
				current=current.next;
			}
		}
	}

	public int countNode()
	{
		int count=0;
		Node current=head;
		while(current!=null)
		{
			count++;
			current=current.next;
		}

		return count;
	}

	public static void main(String args[])
	{
		CountNode cn=new CountNode();

		cn.addNode(20);
		cn.addNode(4);
		cn.addNode(100);
		cn.display();
		
		System.out.println("count of node is : "+cn.countNode());
	}

}