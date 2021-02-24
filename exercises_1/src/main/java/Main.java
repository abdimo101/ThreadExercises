

class MyRunnable implements Runnable{

    private long sum;

    public MyRunnable(){

    }
    public void run() {

        for (int i = 0; i < 1000000000; i++) {
           sum += i;
        }
        System.out.println(sum);
        }
}
public class Main {

    public static void main(String[] args) {
        //Lambda bliver brugt her.
        Runnable r = ()-> {System.out.println("Abdi");};
        Runnable r2 = ()-> {System.out.println("Mo");};
        Thread t = new Thread(r);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(new MyRunnable());
        Thread task2 = new Thread(new MyRunnable2());
        Thread task3 = new Thread(new MyRunnable3());
       // t.start();
       // t2.start();
        t3.start();
       // task2.start();
        //task3.start();

    }
}
