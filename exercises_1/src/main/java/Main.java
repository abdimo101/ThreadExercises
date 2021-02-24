

class MyRunnable implements Runnable{

    private long sum;

    public MyRunnable(){

    }
    public void run() {

        for (int i = 0; i < 1000000000; i++) {
           sum += i;
        }
        System.out.println(Thread.currentThread().getName() +" "+sum);
        }
}
public class Main {

    public static void main(String[] args) throws InterruptedException {
        //Lambda bliver brugt her.
        Runnable r = ()-> {System.out.println("Abdi");};
        Runnable r2 = ()-> {System.out.println("Mo");};
        Thread t = new Thread(r);
        Thread t2 = new Thread(r2);
        Thread task1 = new Thread(new MyRunnable());
        Thread task2 = new Thread(new MyRunnable2());
        MyRunnable3 mr3 = new MyRunnable3();
        Thread task3 = new Thread(mr3);


        t.start();
        t2.start();
        task1.start();
        task2.start();
        task3.start();

        Thread.sleep(10000);
        mr3.cancel();

       // t.join();
       // t2.join();
        task1.join();
        task2.join();
        task3.join();
        System.out.println("All tasks are done");

    }
}
