package task4;

public class Consumer implements Runnable {
    private final MyQueue<Integer> _queue;
    private final String _name;

    public Consumer(MyQueue<Integer> myQueue) {
        this._queue = myQueue;
        Task4_main.ConsumerNameNumber++;
        _name = String.format("Consumer%d", Task4_main.ConsumerNameNumber);
    }

    @Override
    public void run() {
        while (Task4_main.Flag){
            _queue.get();
            Task4_main.CurrentConsumer = this;
            Task4_main.Flag = false;
        }
    }

    @Override
    public String toString(){
        return _name;
    }
}
