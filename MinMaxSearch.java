import java.io.*;
import java.util.*;

class Node98{
	int data;
	Node98 left,right,mid;
	Node98(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
		this.mid=null;
	}
}

class MinMaxSearch{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of nodes : ");
		
		int n=sc.nextInt();
		Node98[] nodeArrL3=new Node98[n];
		
		
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter node data: ");
			nodeArrL3[i]=new Node98(sc.nextInt());
		}
		
		Node98[] nodeArrL2=new Node98[n/3];
		for(int i=0;i<n/3;i++)
		{
			nodeArrL2[i]=new Node98(-1);
			nodeArrL2[i].left=nodeArrL3[3*i+0];
			nodeArrL2[i].mid=nodeArrL3[3*i+1];
			nodeArrL2[i].right=nodeArrL3[3*i+2];
			nodeArrL2[i].data=findMin(nodeArrL2[i]);
		}
		
		Node98 nodeArrL1=new Node98(-1);
		nodeArrL1.left=nodeArrL2[0];
		nodeArrL1.mid=nodeArrL2[1];
		nodeArrL1.right=nodeArrL2[2];
		nodeArrL1.data=findMax(nodeArrL1);
		
		System.out.println("Max is : "+nodeArrL1.data);
	}
	
	static int findMin(Node98 n)
	{
		int min=n.left.data;
		//Node minNode=n.left;
		if(n.mid.data<min)
		{
			min=n.mid.data;
			//minNode=n.mid;
		}
		if(n.right.data<min)
		{
			min=n.right.data;
			//minNode=n.right;
		}
		return min;
	}
	
	static int findMax(Node98 n)
	{
		int max=n.left.data;
		//Node minNode=n.left;
		if(n.mid.data>max)
		{
			max=n.mid.data;
			//minNode=n.mid;
		}
		if(n.right.data>max)
		{
			max=n.right.data;
			//minNode=n.right;
		}
		return max;
	}
}