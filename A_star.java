import java.io.*;
import java.util.*;

class A_star
{

    static int[][] adjs98;
    static String[] pathToNode;

    public static void main(String[] args)throws OutOfMemoryError
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter no. of Nodes: ");
        int n=sc.nextInt();

        adjs98=new int[n][n];
        int[] costArr98=new int[n];
        List<Integer> path98=new ArrayList<>();
        System.out.println("Enter No. of edges: ");
        int E=sc.nextInt();

        while(E--!=0)
        {
            System.out.println("Edge: ");
            int x=sc.nextInt();
            int y=sc.nextInt();
            int v=sc.nextInt();
            addEdge(x,y,v);
        }

        // addEdge(0,1,1);
        // addEdge(0,2,2);
        // addEdge(1,3,7);
        // addEdge(1,4,4);
        // addEdge(2,5,7);
        // addEdge(2,6,1);
        // addEdge(3,7,3);
        // addEdge(4,7,2);
        // addEdge(5,7,5);
        // addEdge(6,7,12);

        System.out.println("Enter source Node: ");
        int src98=sc.nextInt();
        path98.add(src98);

        int curr98=src98;

        System.out.println("Enter destination Node: ");
        int dest98=sc.nextInt();

        System.out.println("Enter Heuristic values :");
        
        int[] heuristic98=new int[n];
        int[] costAtNode=new int[n];

        for(int i=0;i<n;i++)
        {
            if(i!=src98 && i!=dest98)
            {
                System.out.println("For Node "+i+" : ");
                heuristic98[i]=sc.nextInt();
            }
        }

        // heuristic98[1]=5;
        // heuristic98[2]=6;
        // heuristic98[3]=8;
        // heuristic98[4]=5;
        // heuristic98[5]=4;
        // heuristic98[6]=15;

        displayAdjs();
        
        System.out.println();

        pathToNode =new String[n];
        pathToNode[0]=""+src98;

        while(curr98!=dest98)
        {
            for(int i=0;i<n;i++)
            {
                if(adjs98[curr98][i]!=0)
                {
                    pathToNode[i]=pathToNode[curr98]+" "+i;
                    costAtNode[i]=costAtNode[curr98]+adjs98[curr98][i];
                    costArr98[i]=heuristic98[i]+costAtNode[i];
                }
            }
            costArr98[curr98]=0;
            curr98=findMin(costArr98,curr98,pathToNode);
            path98.add(curr98);
        }

        System.out.println("\nA* path is :");

        for(int p:path98)
        {
            System.out.print(" -> "+p);
        }

        System.out.println("\nTotal cost :"+costAtNode[dest98]);
    }
    static void addEdge(int x,int y,int v)
    {
        adjs98[x][y]=v;
    }
    static void displayAdjs()
    {
        System.out.println("Adjacency Matrix: ");
        int n=adjs98.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(adjs98[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int findMin(int[] costArr98,int c,String[] pathToNode)
    {
        int min=Integer.MAX_VALUE;
        int minIndex=-1;
        int n=costArr98.length;
        
        for(int i=0;i<n;i++)
        {
            if(costArr98[i]!=0)
            {
                System.out.println("path :"+pathToNode[i]+" cost :"+costArr98[i]);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(costArr98[i]!=0 && costArr98[i]<min)
            {
                min=costArr98[i];
                minIndex=i;
            }
        }
        System.out.println("Min path : "+pathToNode[minIndex]+" cost: "+min+"    Now, "+minIndex+" is selected.\n");
        return minIndex;
    }
}


/*
OUTPUT :

A:\c2c_classnotes\c2c>java A_star
Enter no. of Nodes:
8
Enter No. of edges:
10
Edge:
0 1 1
Edge:
0 2 2
Edge:
1 3 7
Edge:
1 4 4
Edge:
2 5 7
Edge:
2 6 1
Edge:
3 7 3
Edge:
4 7 2
Edge:
5 7 5
Edge:
6 7 12
Enter source Node:
0
Enter destination Node:
7
Enter Heuristic values :
For Node 1 :
5
For Node 2 :
6
For Node 3 :
8
For Node 4 :
5
For Node 5 :
4
For Node 6 :
15
Adjacency Matrix:
0 1 2 0 0 0 0 0
0 0 0 7 4 0 0 0
0 0 0 0 0 7 1 0
0 0 0 0 0 0 0 3
0 0 0 0 0 0 0 2
0 0 0 0 0 0 0 5
0 0 0 0 0 0 0 12
0 0 0 0 0 0 0 0

path :0 1 cost :6
path :0 2 cost :8
Min path : 0 1 cost: 6    Now, 1 is selected.

path :0 2 cost :8
path :0 1 3 cost :16
path :0 1 4 cost :10
Min path : 0 2 cost: 8    Now, 2 is selected.

path :0 1 3 cost :16
path :0 1 4 cost :10
path :0 2 5 cost :13
path :0 2 6 cost :18
Min path : 0 1 4 cost: 10    Now, 4 is selected.

path :0 1 3 cost :16
path :0 2 5 cost :13
path :0 2 6 cost :18
path :0 1 4 7 cost :7
Min path : 0 1 4 7 cost: 7    Now, 7 is selected.


A* path is :
 -> 0 -> 1 -> 2 -> 4 -> 7
Total cost :7

*/