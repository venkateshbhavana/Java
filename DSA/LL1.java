// Here Not working , Done in notepad LL1.java file

package DSA;

class LL
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

public String toString(){
        String k="[";
        Node t=head;
        while(t!=null){
            if(t==head){
                k=k+t.data;
            }
            else{
                k=k+","+t.data;
            }
            t=t.next;
        }
        k=k+"]";
        return k;
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

    Node MidNode()
    {
        Node f=head;
        Node s=head;
        while(f!=null && f.next!=null)
        {
            f=f.next.next;
            s=s.next;
        }
        return s;
    }

    Node ReverseLeftHalf(Node mid)
    {
        Node a=mid;
        Node b= head;
        while(b!=mid)
        {
            Node c=b.next;
            b.next=a;
            a=b;
            b=c;
        }
        Node k=head;
        head=a;
        return k;
    }
    
    Node ReverseRightHalf(Node mid)
    {
        Node a=null;
        Node b= mid;
        while(b!=null)
        {
            Node c=b.next;
            b.next=a;
            a=b;
            b=c;
        }
        return a;
    }

    void reverseBothHalf()
    {
        Node mid=MidNode();
        Node k=ReverseLeftHalf(mid);
       k.next=ReverseRightHalf(mid);
    }
    
}
public class LL1
{
	public static void main(String[] args) {
		LinkedList x=new LinkedList();
		x.addF(10);
		x.addL(20);
		x.addL(30);
		x.addL(40);
        x.addL(50);
        x.addL(60);
        x.addL(70);
        x.addL(80);
        x.addL(90);
        x.addL(100);
System.out.println(x);
	//System.out.println(x.MidNode().data);
        x.reverseBothHalf();
        x.display();

	}
}



