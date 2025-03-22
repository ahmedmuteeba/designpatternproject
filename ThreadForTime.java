import java.time.LocalTime;

public class ThreadForTime implements Runnable{

    LocalTime lt = LocalTime.now();

    @Override
    public void run() {
        try {
            while(true) {
                Thread.sleep(120000);
                System.out.println(lt);
                }
            }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
