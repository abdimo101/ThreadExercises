 class MyRunnable3 implements Runnable{
    private boolean go = true;
    private Thread me;
     @Override
     public void run() {
         me = Thread.currentThread();
         int count = 10;
         while (go) {
             System.out.println(Thread.currentThread().getName()+" : "+ count);
             count++;
             try {
                 Thread.sleep(3000);
             } catch (InterruptedException e) {
                 // e.printStackTrace();
                 go = false;
             }
         }
     }

     public void cancel() {
         me.interrupt();
     }
 }
