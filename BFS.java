import java.io.*;
import java.util.*;

class BFS{

    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter no. of nodes: ");
        int n=Integer.parseInt(br.readLine());
        int[][] adj=new int[n][n];
        List<Integer> path=new ArrayList<>();
        System.out.println("Enter Connected Nodes ");
        for(int i=0;i<n;i++)
        {
            System.out.print("\nNodes connected to Node "+i+" :");
            String s=br.readLine();
            String[] arr=s.split(" ");
            for(String x:arr)
            {
                adj[i][Integer.valueOf(x)]=1;
            }
        }
        System.out.println("Adjecency Matrix :");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter source node :");
        int src=Integer.parseInt(br.readLine());
        path=getBfsPath(adj,src,n);
        System.out.println("BFS path is : ");
        for(int p:path)
        {
            System.out.print(p+" -> ");
        }
    }

    static List<Integer> getBfsPath(int[][] adj,int src,int n)
    {
        List<Integer> path=new ArrayList<>();
        Deque<Integer> q=new ArrayDeque<>();
        int[] visited=new int[n];
        q.add(src);
        while(!q.isEmpty())
        {
            int x=q.poll();
            path.add(x);
            visited[x]=1;
            for(int i=0;i<n;i++)
            {
                if(adj[x][i]==1 && visited[i]!=1 && !(q.contains(i)))
                {
                    q.add(i);
                }
            }
        }
        return path;
    }
}