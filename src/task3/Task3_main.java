package task3;

public class Task3_main {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("a");
        Integer index = 0;
        StringBuilderThreadArgs stringArgs = new StringBuilderThreadArgs(str, index);
        StringBuilderThread stringBuilderThread1 = new StringBuilderThread(stringArgs);
        StringBuilderThread stringBuilderThread2 = new StringBuilderThread(stringArgs);
        StringBuilderThread stringBuilderThread3 = new StringBuilderThread(stringArgs);

        stringBuilderThread1.start();
        stringBuilderThread2.start();
        stringBuilderThread3.start();
    }
}
