/*Create three threads- with different priorities – MAX, MIN, NORM- and start the threads at the same time. Observe the completion of the threads. (Thread priorities concept)*/
public class Mythread3 implements Runnable {
    public static void main(String[] args) {
        Mythread3 mythread3 = new Mythread3();
        Thread t1 = new Thread(mythread3,"Thread1" );
        Thread t2 = new Thread(mythread3,"Thread2");
        Thread t3 = new Thread(mythread3,"Thread3");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();

    }
    @Override
    public void run()
    {
        for(int i =0;i<100;i++)
            System.out.println(Thread.currentThread().getName() + ": " + i);
    }
}
