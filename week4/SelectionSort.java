import java.util.*;

class SelectionSort{

 public static void main(String[] args)
 {
	 int[] a={3,5,6,65,2,7,12,15};
	 int n=a.length;
	 int[] b=new int[n];
	 for(int i=n-1;i>=0;i--)
	 {
		 b[i]=a[maxOf(a)];
		a[maxOf(a)]=0;
	 }
	  System.out.println(Arrays.toString(b));
 }
 static int maxOf(int[] a)
 {
	 int n=a.length;
	 int max=0;
	 for(int i=0;i<n;i++)
	 {
		if(a[i]>a[max])
			max=i;
	 }
	return max;
 }
}

//counting sort O(n)
//selection sort O(n2)