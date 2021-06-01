package Box;

public class Box1 extends Box {
    public Box1 (){
        int  length=10;
        int width=15;
        int height=15;
    }

    @Override
    public String getName() {
        return "Box1";
    }

    @Override
    public int getPrice() {
        return 10;
    }
}
