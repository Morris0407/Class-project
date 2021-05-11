package Racing;

public class Racing1 {
    public static void main(String[] args) {
        Horse1 horse1 = new Horse1();
        HorseRunnable1 h3 = new HorseRunnable1();
        Thread thread = new Thread(h3);
        horse1.start();
        h3.run();
    }
}
