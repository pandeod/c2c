import java.util.*;
import java.io.*;

class BinarySort{

    public static int binaryFind(int[] a,int start,int end,int search)
    {
        if(end>=start)
        {
            int mid=start+(end-start)/2;
            if(a[mid]==search)
                return mid;
            else if(a[mid]>search)
                return binaryFind(a, start, mid-1, search);
            else
                return binaryFind(a, mid+1, end, search);
        }
        return -1;
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Array of elements : ");
        String x=br.readLine();

        String[] num=x.split(" ");
        int n=num.length;
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(num[i]);
        }
        System.out.println("Enter element to find: ");
        int search=Integer.parseInt(br.readLine());
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int index=binaryFind(a, 0, n-1, search)+1;
        System.out.println("Your Number is at Index : "+index);
    }
}