import java.io.*;
import java.util.*;

class Spiral2d{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();

        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        int lr=0,lc=0,hr=n-1,hc=n-1;
        while(hr>=lr)
        {
            for(int i=lc;i<=hc;i++)
            {
                System.out.print(arr[lr][i]+"->");
            }
            lr++;
            for(int i=lr;i<=hr;i++)
            {
                System.out.print(arr[i][hc]+"->");
            }
            hc--;
            for(int i=hc;i>=lc;i--)
            {
                System.out.print(arr[hr][i]+"->");
            }
            hr--;
            for(int i=hr;i>=lr;i--)
            {
                System.out.print(arr[i][lc]+"->");
            }
            lc++;
        }
    }
}