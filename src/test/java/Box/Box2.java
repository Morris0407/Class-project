package Box;

public abstract class Box2 extends Box{
    public Box2 (){
        length=20;
        width=20;
        height=20;
    }
    @Override
    public String getName2(){
        return "Box2";
}
    @Override
    public int getPrice2(){
        return 120;
    }
}
