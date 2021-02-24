public class WorkerCancelable implements Runnable{
    boolean keepRunning = true;
    Thread thread;
    @Override
    public void run() {
        thread = Thread.currentThread();
        while(keepRunning){
            System.out.println("Hello " + "(wait a second)");
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void cancel(){
        keepRunning = false;
    }
}
