class Main {
    public static void main(String[] args) {
        //Task1_2();
        //Task3();
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
}