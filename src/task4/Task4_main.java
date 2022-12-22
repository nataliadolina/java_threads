package task4;

public class Task4_main {
    public static volatile boolean Flag = true;
    public static volatile Consumer CurrentConsumer;
    public static int ConsumerNameNumber = 0;

    public static void main(String[] args) throws InterruptedException {
        MyQueue<Integer> myQueue = new MyQueue<Integer>();

        Producer producer = new Producer(myQueue);
        Consumer consumer1 = new Consumer(myQueue);
        Consumer consumer2 = new Consumer(myQueue);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer1);
        Thread t3 = new Thread(consumer2);


        t1.start();
        t2.start();
        t3.start();


        t1.join();
        t2.join();
        t3.join();

        System.out.printf("объект из очереди обработал %s", CurrentConsumer);
    }
}
