import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

class Node{
    Student student;
    Node next;
    Node()
    {
        
    }
    Node(Student student)
    {
        this.student=student;
        this.next=null;
    }
}

class LinkedNodes{
    static Node root;
    
    LinkedNodes()
    {
        
    }
    LinkedNodes(Node root)
    {
        this.root=root;
    }
    Node insert(Node newNode)
    {
        Node head=root;
        Node start=root;
        while(head!=null)
        {
            if(head.student.getCgpa()==newNode.student.getCgpa())
            {
                int x=head.student.getFname().compareTo(newNode.student.getFname());
                if(x==0)
                {
                    if(head.student.getId()<newNode.student.getId())
                    {
                        newNode.next=head.next;
                        head.next=newNode;
                    }
                    else
                    {
                        newNode.next=head;
                        if(head==start)
                            start=newNode;
                        head=newNode;
                    }
                }
                else if(x>0)
                {
                    newNode.next=head.next;
                    head.next=newNode;
                }
                else
                {
                    newNode.next=head;
                    if(head==start)
                            start=newNode;
                    head=newNode;
                }
            }
            else if(head.student.getCgpa()>newNode.student.getCgpa())
            {
                newNode.next=head.next;
                head.next=newNode;
            }
            else
            {
                newNode.next=head;
                if(head==start)
                    start=newNode;
                head=newNode;
            }
            
            head=head.next;
        }
        return start;
    }
    
    List<Student> display(Node node)
    {
        List<Student> list=new ArrayList<>();
        while(node!=null)
        {
            list.add(node.student);
            node=node.next;
        }
        return list;
    }
}


//Complete the code
public class JavaSort
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		int flag=0;
        Node x=new Node();
        LinkedNodes lk=new LinkedNodes();
        List<Student> studentList = new ArrayList<Student>();
        System.out.println("Enter Data :");
		while(testCases>0){
            
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
            
            if(flag!=1)
            {
                lk=new LinkedNodes(new Node(st));
                flag=1;
            }
            else
            {
                 x=lk.insert(new Node(st));
            }
			testCases--;
		}
        
        studentList=lk.display(x);
        
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}



