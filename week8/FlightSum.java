import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class FlightSum {

    // Complete the solve function below.
    static int solve(int[] arr) {
        
        int n=arr.length;
        int total=0;
        int p=0;
        for(int i=0;i<n;i++)
        {
            int cur=arr[i];
            int count=1;
            int j=i+1;
            int flag=0;
             while(j<n)
            {
                 if(arr[j]<cur)
                 {
                    if(flag!=1)
                    {
                        p=j;
                        flag=1;
                    }
                    j++;
                 }
                 else if(arr[j]==cur)
                 {
                     count++;
                     j++;
                 }
                 else
                 {
                     break;
                 }
            }
            i=p-1;
            if(count!=1)
            {
                total+=nCp(count);
            }
        }
        
        return 2*total;
    }
    static int nCp(int x)
    {
       return x*(x-1)/2;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {

        System.out.println("Enter n: ");
        int arrCount = scanner.nextInt();

        int[] arr = new int[arrCount];

        for (int arrItr = 0; arrItr < arrCount; arrItr++) {
            arr[arrItr] = scanner.nextInt();;
        }

        int result = solve(arr);

       System.out.println(result);
    }
}
