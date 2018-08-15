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
            System.out.print("-> "+root.data+"("+root.count+") ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args)
    {
        int[] arr={5,6,3,9,3,6,2,67,34,23,123,1,2,34,56,23,23,12,1,12,23,42,3424,52,34,234523,423,42,342,342,342,2345134,425,23,23,41,343,55,67,787,823,412,32,4456,56,78,67,88,7,54,63,563245,2,341,5,4,3};

        int n=arr.length;

        TreeCounting tr=new TreeCounting();

        for(int x: arr)
        {
            tr.insert(x);
        }
        tr.inorder();
    }
}