package stud;

public class Graduatestudent1 extends Student1 {
    int thesis;



    public Graduatestudent1( String name, int math, int english,int thesis){
        /*this.english=english;
        this.math=math;
       this.name=name;*/
        super(name,math,english);
        this.thesis=thesis;
    }
    public void print (){
        System.out.println(name+"\t" + math + "\t" + english + "\t" + thesis );
    }


}
