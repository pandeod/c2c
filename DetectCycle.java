import java.io.*;
import java.util.*;


class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

class DetectCycle{

    public static void main(String[] args)
    {
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);
        Node n5=new Node(5);
        Node n6=new Node(6);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n1;

        System.out.println("Cycle is present :"+detectCycleHere(n1));
    }

    static boolean detectCycleHere(Node n)
    {
        if(n==null)
            return false;

        Node slow=n;
        Node fast=n;
        
        //System.out.println("Slow : "+slow.data+"  fast : "+fast.data);

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

            //System.out.println("Slow : "+slow.data+"  fast : "+fast.data);
            
            if(slow==fast)
                return true;
        }
        return false;
    }

}