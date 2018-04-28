import java.util.*;
import java.io.*;

class StudentDemo{

	public static void main(String[] args)
	{
		Student sd1=new Student();
		Student sd2=new Student();
		Student sd3=new Student();
		Student sd4=new Student();
		Student sd5=new Student();

		sd1.name="x";
		sd1.lastName="y";
		sd1.roll="654";
		sd1.clearedSem();
		sd1.clearedSem();
		
		sd2.name="a";
		sd2.lastName="b";
		sd2.roll="123";
		sd2.clearedSem();
		sd2.clearedSem();
		sd2.clearedSem();
		sd2.clearedSem();
		
		sd3.name="c";
		sd3.lastName="d";
		sd3.roll="234";
		sd3.clearedSem();
		
		System.out.println(sd1.getDetail()+"\t Grades :"+sd1.grade);
		System.out.println(sd2.getDetail()+"\t Grades :"+sd2.grade);
		System.out.println(sd3.getDetail()+"\t Grades :"+sd3.grade);
		System.out.println("Total students :"+Student.count);
		
		System.out.println("After decreasing");
		sd4.decreaseSem();
		sd5.decreaseSem();
		
		System.out.println("Total students :"+Student.count);
	}
	
}

class Student{
	String name;
	String roll;
	String lastName;
	int grade=1;
	
	static int count;
	Student()
	{ 
		count++;
	}
	
	void  clearedSem()
	{
		 grade++;
	}
	String getDetail()
	{
		return "Name : "+name+" "+lastName+"\tRoll No : "+roll;
	}
	static void decreaseSem()
	{
		count--;
	}
}

//for each instance -- non-static 
// 2d array multiple 1d array