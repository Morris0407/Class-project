package Racing;

public class HorseRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println( "rr" + i);
        }
    }
}
