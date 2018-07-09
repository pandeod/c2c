import java.io.*;
import java.util.*;

class Gcd{

    static int getGcd(int x,int y)
    {
        if(x>y)
        {
            if(x%y!=0)
            {
                for(int i=y-1;i>0;i--)
                {
                    if(x%i==0 && y%i==0)
                    {
                        return i;
                    }
                }
            }
            else
            {
                return y;
            }
        }
        else if(y>x)
        {
           return getGcd(y, x);
        }
        else
        {
            return x;
        }
        return 1;
    }

    static int getRecGcd(int x,int y)
    {
        if(y!=0)
        {
            return getRecGcd(y,x%y);
        }
        else
        {
            return x;
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Gcd of 442 and 221 : "+getGcd(442, 221));
        System.out.println("Gcd of 442 and 221 : "+getRecGcd(221, 442));
    }
}