import java.util.*;
import java.io.*;

class Array2d{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a[][]=new int[n][n];
		int dia1=0,dia2=0;
		
		int[] row=new int[n];
		int[] col=new int[n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				row[i]+=a[i][j];
				col[j]+=a[i][j];
				if(i==j)
				{
					dia1+=a[i][j];
				}
				if(i+j==n-1)
				{
					dia2+=a[i][j];
				}
			}
		}
		System.out.println(" row adition :"+Arrays.toString(row));
		System.out.println(" col adition :"+Arrays.toString(col));
		System.out.println(" diagonal 1 adition :"+dia1);
		System.out.println(" diagonal 2 adition :"+dia2);
		
	}
}


//Arrays.toString