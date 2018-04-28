import java.util.*;
import java.io.*;

class GuessNumber{

	public static void main(String[] args)
	{
		int[] a={1,2,3,4,5,6,7,8,9,10};
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int start=0,end=9,mid=0;
		int count=0,position=-1;
		do{
			mid=(start+end)/2;
			if(a[mid]==x)
			{
				position=mid;
				break;
			}
			if(a[mid]>x)
				end=mid;
			if(a[mid]<x)
				start=mid;
			count++;
		}while(count<=5);
		System.out.println("element at index : "+position);
	}
}

//complexity of binary search => log2n