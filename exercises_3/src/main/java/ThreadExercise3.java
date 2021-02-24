public class ThreadExercise3 {

    public static void main(String[] args) throws InterruptedException {
        WorkerCancelable worker = new WorkerCancelable();
        Thread t = new Thread(worker);
        t.start();
        t.join();
        System.out.println("DONE");
    }
}
