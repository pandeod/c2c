import java.io.*;
import java.util.*;

class quicksort{

    static int[] sort(int[] a,int low,int high)
    {
        if(low<high)
        {
            int p=partition(a, low, high);
            a=sort(a,low,p-1);
            a=sort(a,p+1,high);
        }
        return a;
    }
    static int partition(int[] a,int low,int high)
    {
        int pivot=a[high];
        int i=low-1,j,temp;
       for(j=low;j<high;j++)
       {
           if(a[j]<pivot)
           {
                i++;
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
           }
       }
       temp=a[i+1];
       a[i+1]=a[j];
       a[j]=temp;

       return i+1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();

        System.out.println("Enter elements : ");
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        a=sort(a,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}