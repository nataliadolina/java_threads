package task4;

public class Producer implements Runnable {
    private final MyQueue<Integer> myQueue;
    private int _currentNumber = 0;

    public Producer(MyQueue<Integer> myQueue) {
        this.myQueue = myQueue;
    }

    public void run() {
        while (Task4_main.Flag) {
            myQueue.put(_currentNumber);
            _currentNumber++;
        }
    }
}