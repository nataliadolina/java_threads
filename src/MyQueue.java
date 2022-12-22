import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class MyQueue<T> {
    private final ConcurrentLinkedQueue<T> queue = new ConcurrentLinkedQueue<T>();
    boolean valueSet = false;

    public synchronized Queue<T> get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Пoлyчeнo: " + queue);
        valueSet = false;
        notify();
        return queue;
    }

    public synchronized void put(T object) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        valueSet = true;
        this.queue.add(object);
        System.out.println("Oтпpaвлeнo: " + queue);
        notify();
    }
}