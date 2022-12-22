public class Consumer implements Runnable {
    private final MyQueue<Integer> _queue;
    private final String _name;

    public Consumer(MyQueue<Integer> myQueue) {
        this._queue = myQueue;
        Main.ConsumerNameNumber++;
        _name = String.format("Consumer%d", Main.ConsumerNameNumber);
    }

    @Override
    public void run() {
        while (Main.Flag){
            _queue.get();
            Main.CurrentConsumer = this;
            Main.Flag = false;
        }
    }

    @Override
    public String toString(){
        return _name;
    }
}
