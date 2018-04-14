import java.util.*;

class FindMaxx{
  
  static int max=0;
  
  static int findMax(int[] a)
  {
    max=a[0];
    for(int x:a)
    {
      if(x>max)
        max=x;
    }
    return max;
  }
  
  static int[] findNormalMax(int[] a)
  {
    int min=a[0];
    max=a[0];
    for(int i=0;i<a.length;i++)
    {
      if(a[i]>max)
        {
          max=a[i];
        }
      if(a[i]<min)
      {
        min=a[i];
      }
    }
    int[] z={max,min};
    return z;
  }
  
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);	
   System.out.println("Enter n");
    int n=sc.nextInt();
	System.out.println("Enter array ");
    int[] a=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    System.out.println("\nMax is: "+findMax(a));
    int[] f=findNormalMax(a);
    System.out.println("\nMax Min is: "+f[0]+" "+f[1]);
  }
}