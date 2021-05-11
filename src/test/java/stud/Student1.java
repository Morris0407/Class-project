package stud;

public class Student1 {
    String name;
    int math;
    int english;

    public Student1(){
        super();
    }

    public Student1 (String name,int math, int english){
        this.english=english;
        this.math=math;
        this.name=name;
    }
    public void print (){
        System.out.println(name + "\t" + math+"\t" + english );
    }



}
