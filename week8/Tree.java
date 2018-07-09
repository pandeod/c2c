import java.util.*;

class Employee{
    String name;
    int salary;

    Employee(String name,int salary)
    {
        this.name=name;
        this.salary=salary;
    }
    int getSalary()
    {
        return this.salary;
    }
    String getData()
    {
        return "Name :"+this.name+" Salary :"+this.salary;
    }
}

class Node{
    Employee emp;
    Node left;
    Node right;

    Node(Employee emp)
    {
        this.emp=emp;
        this.left=null;
        this.right=null;
    }
    Employee getEmployee()
    {
        return this.emp;
    }
}

class SubTree{
    Node root;

    SubTree(Node root)
    {
        this.root=root;
    }

    public void insert(Node rootNew,Node node)
    {
        int x=node.getEmployee().getSalary();
        int y=rootNew.getEmployee().getSalary();
        if(x<y)
        {
            if(rootNew.left!=null)
            {
                insert(rootNew.left,node);
            }
            else
            {
                rootNew.left=node;
            }
        }
        else
        {
            if(rootNew.right!=null)
            {
                insert(rootNew.right,node);
            }
            else
            {
                rootNew.right=node;
            }
        }
    }

    public void inOrder(Node root)
    {
        if(root!=null)
        {
            inOrder(root.left);
            System.out.println(root.getEmployee().getData());
            inOrder(root.right);
        }
        
    }

    public void preOrder(Node root)
    {
        if(root!=null)
        {
            System.out.println(root.getEmployee().getData());
            preOrder(root.left);
            preOrder(root.right);
        }
        
    }

    public void postOrder(Node root)
    {
        if(root!=null)
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.getEmployee().getData());
        }
        
    }

}

class Tree{

    public static void main(String[] args)
    {
        Employee e1=new Employee("A",100);
        Employee e2=new Employee("B",101);
        Employee e3=new Employee("C",102);
        Employee e4=new Employee("D",103);
        Employee e5=new Employee("E",97);
        Employee e6=new Employee("F",109);

        Node n1=new Node(e1);
        Node n2=new Node(e2);
        Node n3=new Node(e3);
        Node n4=new Node(e4);
        Node n5=new Node(e5);
        Node n6=new Node(e6);

        SubTree sb=new SubTree(n3);
        sb.insert(n3,n6);
        sb.insert(n3,n5);
        sb.insert(n3,n2);
        sb.insert(n3,n4);
        sb.insert(n3,n1);

        System.out.println("In-order Tree :");
        sb.inOrder(n3);

        System.out.println("Pre-order Tree :");
        sb.preOrder(n3);

        System.out.println("Post-order Tree :");
        sb.postOrder(n3);
    }
}

