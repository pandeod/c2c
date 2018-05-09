import java.util.*;

public class HelloWorld{

  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter no: ");
	  int a=sc.nextInt();
       int sumEven=0;
	   int sumOdd=1;
	   int sum=0;
	   int sumE=0;
	   int sumO=0;
	   int b=a;
	   int c=a;
	   for(;a>0;a--)
	   {
			sum+=a;
	   }
	   for(;b>0;b--)
	   {
		   sumEven+=2;
		   sumE+=sumEven;
	   }
	   for(;c>1;c--)
	   {
		   sumOdd+=2;
		   sumO+=sumOdd;
	   }
	   
	  System.out.println(sum);
	  System.out.println(sumE);
	  System.out.println(sumO+1);
	  
	  //switch .... i%3 case
  }
}

class Hello{
	
	
}

//	indentation
//	Class  -- Pascal case
//	function , variables  == camel case
//	constants == all caps
//	String --class

//	i>i+1
//	i==i-1
//	i!=i+0

//switch case not fot long double float  .......case order not matters

//filling jars 
//mini-max-sum
//simple-array-sum

//Ternary operator    (condition)?true:false;
//Arrays.sort() inbuilt sort function

//By the meteorological calendar, spring starts on 1 March. 
//The seasons are defined as spring (March, April, May), 
//summer (June, July, August), autumn (September, October, November)
//and winter (December, January, February)
//week1