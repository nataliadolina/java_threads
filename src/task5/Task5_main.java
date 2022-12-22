package task5;

public class Task5_main {
    public static final int SitsNumber = 5;

    public static void main(String[] args){
        int ph_id = 0;
        int folk_id = 0;

        Philosopher[] _philosophers = new Philosopher[SitsNumber];
        Folk[] _folks = new Folk[SitsNumber];

        for (int i = 0; i < SitsNumber; i++){
            Philosopher philosopher = new Philosopher(ph_id);
            Folk folk = new Folk(folk_id);

            _philosophers[i] = philosopher;
            _folks[i] = folk;
            ph_id ++;
            folk_id ++;
        }
    }
}
