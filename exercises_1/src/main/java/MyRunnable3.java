 class MyRunnable3 implements Runnable{
    long startTime = System.currentTimeMillis();
     @Override
     public void run() {
         for (int i = 10; 10000 > System.currentTimeMillis()-startTime; i++) {
             System.out.println(i);
             try {
                 Thread.sleep(3000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
     }
 }
