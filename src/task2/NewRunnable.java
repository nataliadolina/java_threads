package task2;

import java.util.Random;

public class NewRunnable implements Runnable{
    private final Random _random = new Random();

    public void run(){
        for (int i = 0; i <= 100; i+=10){
            System.out.print(i);

            long waitTime = (long) (_random.nextInt(100) * 0.01 * 3);

            try {
                Thread.sleep(1000 * waitTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
