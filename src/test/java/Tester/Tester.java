package Tester;


import java.io.IOException;
import java.net.Socket;

public class Tester {
    public static void main(String[] args) {
        try {
            Socket socket  =new Socket("www.youtube.com",80);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}






