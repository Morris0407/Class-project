package Racing;

public class Horse1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+ "\t" +i);
        }
    }
}
