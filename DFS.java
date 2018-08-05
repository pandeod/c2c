import java.io.*;
import java.util.*;

class DFS{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int[][] adj=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter value of edge "+i+":"+j);
                adj[i][j]=sc.nextInt();
            }
        }
        List<Integer> arr=getPathDFS(adj,0);
        for(int x:arr)
        {
            System.out.print(x+"->");
        }
    }

    static List<Integer> getPathDFS(int[][] adj,int org)
    {
        int n=adj.length;
        List<Integer> arr=new ArrayList<Integer>();
        Stack<Integer> stack=new Stack<Integer>();
        boolean[] visited=new boolean[n];

        visited[org]=true;
        stack.push(org);
        while(!stack.empty())
        {
            int x=stack.pop();
            arr.add(x);
            int max=0;
            for(int j=0;j<n;j++)
            {
                if(adj[x][j]>0)
                {
                    if(!visited[j])
                    {
                        visited[j]=true;
                        stack.push(j);
                    }
                }
            }
        }

        return arr;
    }
}