import java.util.Queue;

public class Producer implements Runnable {
    private final MyQueue<Integer> myQueue;
    private int _currentNumber = 0;

    public Producer(MyQueue<Integer> myQueue) {
        this.myQueue = myQueue;
    }

    public void run() {
        while (Main.Flag) {
            myQueue.put(_currentNumber);
            _currentNumber++;
        }
    }
}