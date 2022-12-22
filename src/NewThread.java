import java.lang.Object;
import java.lang.Thread;
import java.util.Random;

public class NewThread extends Thread {
    private final String _symbol;
    private final Random _random = new Random();

    public NewThread(String symbol){
        _symbol = symbol;
    }

    public void run(){
        for (int i = 0; i < 100; i++){
            System.out.print(_symbol);

            long waitTime = (long) (_random.nextInt(100) * 0.01 * 3);

            try {
                Thread.sleep(1000 * waitTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
