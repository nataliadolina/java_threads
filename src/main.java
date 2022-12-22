import java.util.Queue;

class Main {
    //task 4
    public static volatile boolean Flag = true;
    public static volatile Consumer CurrentConsumer;
    public static int ConsumerNameNumber = 0;

    public static void main(String[] args) throws InterruptedException {
        // Task1_2();
        // Task3();
        // Task4();
    }

    private static void Task1_2() {
        NewThread newThread = new NewThread("-");

        NewRunnable numbersPrinter1 = new NewRunnable();
        NewRunnable numbersPrinter2 = new NewRunnable();
        NewRunnable numbersPrinter3 = new NewRunnable();

        Thread numbersPrinterThread1 = new Thread(numbersPrinter1);
        Thread numbersPrinterThread2 = new Thread(numbersPrinter2);
        Thread numbersPrinterThread3 = new Thread(numbersPrinter3);

        newThread.start();
        numbersPrinterThread1.start();
        numbersPrinterThread2.start();
        numbersPrinterThread3.start();
    }

    private static void Task3() {
        StringBuilder str = new StringBuilder("a");
        Integer index = 0;
        StringBuilderThreadArgs args = new StringBuilderThreadArgs(str, index);
        StringBuilderThread stringBuilderThread1 = new StringBuilderThread(args);
        StringBuilderThread stringBuilderThread2 = new StringBuilderThread(args);
        StringBuilderThread stringBuilderThread3 = new StringBuilderThread(args);

        stringBuilderThread1.start();
        stringBuilderThread2.start();
        stringBuilderThread3.start();
    }

    private static void Task4() throws InterruptedException {
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