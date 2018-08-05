import java.util.*;
import java.io.*;

class IntersectionArray{

    public static void main(String[] args)
    {
        int[] ar1={1,2,4,5,7,8,9};
        int[] ar2={1,3,4,7,8,10,11};
    }

    static int getMax(int[] x)
    {
        int n=x.length;
        int max=x[0];
        for(int i=1;i<n;i++)
        {
            if(max<x[i])
                max=x[i];
        }
        return max;
    }
}