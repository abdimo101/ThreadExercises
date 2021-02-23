

class MyRunnable implements Runnable{
    private int x;
    private int y;

    public MyRunnable(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void run() {
        int sum = x + y;
        System.out.println(sum);

        for (int i = 0; i < 1000000000; i++) {
            int res = sum + i;
            i++;
            System.out.println(res);
        }
        }
}
public class Main {

    public static void main(String[] args) {
        //Lambda bliver brugt her.
        Runnable r = ()-> {System.out.println("Abdi");};
        Runnable r2 = ()-> {System.out.println("Mo");};
        Thread t = new Thread(r);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(new MyRunnable(20, 10));
        Thread task2 = new Thread(new MyRunnable2());
        Thread task3 = new Thread(new MyRunnable3());
       // t.start();
       // t2.start();
       // t3.start();
       // task2.start();
        task3.start();

    }
}
