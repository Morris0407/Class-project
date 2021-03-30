package Box;

public class Box {
    int length;
    int width;
    int height;
    public boolean vslidate (int a,int b,int c){
        return (a<=length && b<=width&& c<=height);
}

    public Box (int length,int weight,int width){
        this.length= length;
        this.width = width;
        this.height= height;
    }


}
