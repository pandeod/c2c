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
    Node next;

    Node(Employee emp)
    {
        this.emp=emp;
        this.next=null;
    }
    Employee getEmployee()
    {
        return this.emp;
    }
}

class LinkedList{
    static Node start;
    Node current;

    LinkedList(Node start)
    {
        this.start=start;
    }

    void insert(Node newNode)
    {
        current=this.start;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=newNode;
    }

    void printAll()
    {
        current=this.start;
        while(current!=null)
        {
            System.out.println(current.getEmployee().getData());
            current=current.next;
        }
    }

    int search(Node newNode)
    {
        int position=1;
        current=this.start;
        while(!current.getEmployee().getData().equals(newNode.getEmployee().getData()))
        {
            position++;
            current=current.next;
        }
        return position;
    }
}

class SinglyLinkedList{

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

        LinkedList ll=new LinkedList(n5);
        ll.insert(n1);
        ll.insert(n2);
        ll.insert(n3);
        ll.insert(n4);
        ll.insert(n6);

        ll.printAll();
        
        System.out.println("position of n4 : "+ll.search(n4));
    }
}