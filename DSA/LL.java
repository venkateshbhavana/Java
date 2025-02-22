package DSA;

class LinkedList
{
    Node head;
    int size=0;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    public void addF(int value)
    {
        Node n=new Node(value);
        n.next=head;
        head=n;
        size++;
    }
    public void addL(int value)
    {
        if(head==null)
        {
            addF(value);
        }
        else
        {
            Node t=head;
            while(t.next!=null)
            {
                t=t.next;
            }
            Node n=new Node(value);
            t.next=n;
            size++;
        }
    }
    public void display()
    {
        Node t=head;
        while(t!=null)
        {
            if(t==head)
            {
                System.out.print(t.data);
            }
            else
            {
                System.out.print("->"+t.data);
            }
            t=t.next;
        }
        System.out.println();
    }
    public int size()
    {
        return size;
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public String toString()
    {
        String k="[";
        Node t=head;
        while(t!=null)
        {
            if(t==head)
            {
                k=k+t.data;
            }
            else
            {
                k=k+","+t.data;
            }
            t=t.next;
        }
        k=k+"]";
        return k;
    }
    public void clear()
    {
        head=null;
    }
    
}
public class LL
{
	public static void main(String[] args) {
		LinkedList x=new LinkedList();
		x.addF(10);
		x.addL(20);
		x.addL(30);
		x.addL(40);
		x.display();
		System.out.println(x);
		x.clear();
		System.out.println(x);
	}
}
