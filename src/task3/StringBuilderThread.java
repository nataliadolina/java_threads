package task3;

public class StringBuilderThread extends Thread {
    private final StringBuilderThreadArgs _args;
    private final CharSequence alphabet = "abcdefghijklmnopqrstuvwxyz";

    public StringBuilderThread(StringBuilderThreadArgs args) {
        _args = args;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(_args.Str);
        }
        _args.Index++;
        _args.Str.append(alphabet.charAt(_args.Index));
    }
}
