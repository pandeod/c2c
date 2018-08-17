package primechecker;

import java.util.*;

public class primeCheck{

    public static boolean checkIfPrime(int n)
    {
        if(n<=0)
            return false;

        if(n==1)
            return false;
        if(n==2)
            return true;

        int x=(int) Math.sqrt(n);

        for(int i=2;i<=x;i++)
        {
            if(n%i==0)
                return false;
        }

        return true;
    }

}

//to compile package file in working directory=>   javac -d . primeCheck.java
//make class public  