public class DeleteStart
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

	public void deleteStart()
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}

		else
		{
			if(head!=tail)
			{
				head=head.next;
			}

			else
			{
				head=tail=null;
			}
		}
	}
			
	public void display()
	{
		Node current=head;

		if(head==null)
		{
			System.out.println("List is empty");
		}

		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}

		System.out.println();
	}

	public static void main(String args[])
	{
		DeleteStart ds=new DeleteStart();

		ds.addNode(40);
		ds.addNode(77);
		ds.addNode(23);
		
		System.out.println("Original list : ");	
		ds.display();
		
		while(ds.head!=null)
		{
			ds.deleteStart();
			System.out.println("Updated list : ");
			ds.display();
		}
	}	
}