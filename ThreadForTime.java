import java.time.LocalTime;

public class ThreadForTime implements Runnable {
    public void run() {
        try {
            while (true) {
                Thread.sleep(120000);
                System.out.println(LocalTime.now());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
