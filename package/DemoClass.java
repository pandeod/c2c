import primechecker.primeCheck;
import java.util.*;

class DemoClass{

    public static void main(String[] args)
    {
        if(primeCheck.checkIfPrime(34))
        {
            System.out.println("It is prime..");
        }
        else
        {
            System.out.println("It is NOT prime..");
        }
    }
}