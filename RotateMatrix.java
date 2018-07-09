import java.io.*;
import java.util.*;

class RotateMatrix{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of rows : ");
        int m=sc.nextInt();
        System.out.println("Enter no of Columns :");
        int n=sc.nextInt();
        int[][] a=new int[m][n];
        int[][] b=new int[n][m];
        int[][] c=new int[n][m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix : ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               System.out.print(a[i][j]+" ");
               b[j][m-i-1]=a[i][j];
            }
            System.out.println();
        }
        System.out.println("Rotated Matrix : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}