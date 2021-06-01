package Box;

public class Box2 extends Box {

    public Box2 (){
        int  length=15;
        int width=15;
        int height=15;
    }


    @Override
    public String getName() {
        return "Box2";
    }

    @Override
    public int getPrice() {
        return 20;
    }
}
