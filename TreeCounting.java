import java.util.*;
import java.io.*;


class Node{
    int data,count;
    Node left,right;
    Node(int data)
    {
        this.count=1;
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class TreeCounting{

    Node root;

    TreeCounting()
    {
        this.root=null;
    }

    public void insert(int data)
    {
        this.root=insertRec(this.root, data);
    }

    public Node insertRec(Node root,int data)
    {
        if(root==null)
            root=new Node(data);
        else if(data<root.data)
        {
            root.left=insertRec(root.left, data);
        }
        else if(data>root.data)
        {
            root.right=insertRec(root.right, data);
        }
        else
        {
            root.count+=1;
            return root;
        }
        return root;
    }

    public void inorder()
    {
        inorderRec(this.root);
    }
     
    public void inorderRec(Node root)
    {
        if(root!=null)
        {
            inorderRec(root.left);
            System.out.print("-> "+root.data+" ("+root.count+")");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args)
    {
        int[] arr={5,6,3,9,3,6,2,1,5,4,3};

        int n=arr.length;

        TreeCounting tr=new TreeCounting();

        for(int x: arr)
        {
            tr.insert(x);
        }
        tr.inorder();
    }
}