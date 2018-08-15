import java.util.*;
import java.io.*;

// class ThreadDemo extends Thread
// {
//     public void run()
//     {
//         Thread t=Thread.currentThread();
//         System.out.println("Name : "+t.getName()+"\n\nID : "+t.getId()+"\n\nPrio : "+t.getPriority()+"\n\nStackTrace : "+t.getStackTrace()+"\n\nClass : "+t.getClass()+"\n\nContextLoader : "+t.getContextClassLoader()+"\n\nGetGroup : "+t.getThreadGroup());
//     }

//     public static void main(String[] args)
//     {
//         ThreadDemo th=new ThreadDemo();
//         dummy1();
//         dummy2();
//         th.start();
        
//     }
//     static void dummy1()
//     {
//         System.out.println("\n\nDummy 1");
//     }
//     static void dummy2()
//     {
//         System.out.println("\n\nDummy 2");
//     }
// }

class ThreadDemo implements Runnable
{
    public void run()
    {
        Thread t=Thread.currentThread();
         for(int i=1;i<=1;i++)
        {
            System.out.println("Thread Running : "+t.getName()+" "+i);
            //without thread sleep random execution of threads

            // try{
            //     System.out.println("Thread Running : "+t.getName()+" "+i);
            //     t.sleep(100);
            // //with sleep random execution
            // }
            // catch(InterruptedException e)
            // {
            //     e.printStackTrace();
            // }
        }
    }

    public static void main(String[] args)
    {
        ThreadDemo threadDemo=new ThreadDemo();
        Thread t1=new Thread(threadDemo);
        Thread t2=new Thread(threadDemo);

        long startTime = System.nanoTime();

        t1.start();
        t2.start();

        long elapsedTime = System.nanoTime() - startTime;
      
        System.out.println("Total execution time to run 2 threads  "+ elapsedTime/2);
    }
}

/*
    Randomness in output due to context-switching

    Thread scheduler in java is the part of the JVM that decides which thread 
    should run.
    
    There is no guarantee that which runnable thread will be chosen
    to run by the thread scheduler.Only one thread at a time can run in a single
    process.
    
    The thread scheduler mainly uses preemptive or time slicing scheduling
    to schedule the threads.
*/