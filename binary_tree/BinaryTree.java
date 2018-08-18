import java.util.*;
import java.io.*;

class Node{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class BinaryTree{

    Node root;

    BinaryTree()
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
        else
        {
            root.right=insertRec(root.right, data);
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
            System.out.print(" -> "+root.data);
            inorderRec(root.right);
        }
    }

    public void leftView()
    {
        leftViewRec(this.root);
    }
    
    public void leftViewRec(Node root)
    {
        if(root!=null)
        {
            if(root.left!=null)
            {
                leftViewRec(root.left);
            }
            else
            {
                leftViewRec(root.right);
            }
            System.out.print(" -> "+root.data);
        }
    }
    
    public int treeHeight()
    {
        int h=height(this.root);
        return h;
    }

    public int height(Node root)
    {
        if(root==null)
            return 0;
        else
        {
            int lheight=height(root.left);
            int rheight=height(root.right);

            if(lheight>rheight)
            {
                return (lheight+1);
            }
            else
            {
                return (rheight+1);
            }
        }
    }
    
    public void printLevelOrder()
    {
        int h=treeHeight();
        for(int i=1;i<=h;i++)
        {
            List<Integer> list=new ArrayList<>();
            list=printForLevel(this.root,i,list);
            System.out.print("\nLevel "+i+": ");
            for(int n:list)
                System.out.print(n+" ");
        }
    }

    public List<Integer> printForLevel(Node root,int level,List<Integer> list)
    {
        if(root==null)
            return list;
        else if(level==1)
            list.add(root.data);
        else
        {
            list=printForLevel(root.left,level-1,list);
            list=printForLevel(root.right,level-1,list);
        }
        return list;
    }

    public static void main(String[] args)
    {
        int[] arr={6,3,4,5,7,8,10,1,2};
        int n=arr.length;

        BinaryTree tr=new BinaryTree();

        for(int x: arr)
        {
            tr.insert(x);
        }
        System.out.println("\nInorder :");
        tr.inorder();
        System.out.println("\nLeftView :");
        tr.leftView();
        System.out.println("\nHeight of Tree : "+tr.treeHeight());
        System.out.println("\nLevel wise tree :");
        tr.printLevelOrder();
    }
}