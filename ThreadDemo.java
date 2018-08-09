import java.util.*;

class ThreadDemo extends Thread
{
    public void run()
    {
        Thread t=Thread.currentThread();
        System.out.println("Name : "+t.getName()+"\n\nID : "+t.getId()+"\n\nPrio : "+t.getPriority()+"\n\nStackTrace : "+t.getStackTrace()+"\n\nClass : "+t.getClass()+"\n\nContextLoader : "+t.getContextClassLoader()+"\n\nGetGroup : "+t.getThreadGroup());
    }

    public static void main(String[] args)
    {
        ThreadDemo th=new ThreadDemo();
        dummy1();
        dummy2();
        th.start();
        
    }
    static void dummy1()
    {
        System.out.println("\n\nDummy 1");
    }
    static void dummy2()
    {
        System.out.println("\n\nDummy 2");
    }
}