package task2;

public class Task2_main {
    public static void main(String[] args){
        NewRunnable numbersPrinter1 = new NewRunnable();
        NewRunnable numbersPrinter2 = new NewRunnable();
        NewRunnable numbersPrinter3 = new NewRunnable();

        Thread numbersPrinterThread1 = new Thread(numbersPrinter1);
        Thread numbersPrinterThread2 = new Thread(numbersPrinter2);
        Thread numbersPrinterThread3 = new Thread(numbersPrinter3);

        numbersPrinterThread1.start();
        numbersPrinterThread2.start();
        numbersPrinterThread3.start();
    }
}
