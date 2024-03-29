/*
  Write a java program to showcases how multithreading allows multiple tasks to be executed simultaneously by 
  printing a count from 1 to 5 with a 1-second delay between each count
*/

public class Exp29 {
    public static void main(String[] args) {
        
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));

        thread1.start();
        thread2.start();
    }
}

class MyRunnable implements Runnable {
    private final String threadName;

    public MyRunnable(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": Count " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
