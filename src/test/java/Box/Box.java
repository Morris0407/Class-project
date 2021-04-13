package Box;

public abstract class Box {
    int length;
    int width;
    int height;
    public boolean validate(int a, int b, int c) {
        return (a <= length && b <= width && c <= height);
    }

    public abstract String getName();

    public abstract int getPrice();

    public abstract String getName2();

    public abstract int getPrice2();

    public abstract String getName3();

    public abstract int getPrice3();





}
