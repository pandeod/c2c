import java.util.*;

class DpFibbo{
public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
	System.out.println("Enter n");
    int n=sc.nextInt();
	System.out.println("Enter array ");
    int[] a=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
  
	int max=FindMaxx.findMax(a);
	System.out.println("\nMax is:"+max);
	
	int factSize=max+1;
	int[] fact=new int[factSize];
	fact[0]=1;
	
	for(int i=1;i<factSize;i++)
	{
		fact[i]=i*fact[i-1];
	}
	
	for(int i=0;i<n;i++)
	{
		System.out.println("Factorial of "+a[i]+" : "+ fact[a[i]]);
	}
	
  }
}