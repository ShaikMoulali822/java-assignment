package Moulali;

public class Multithread3 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            Multithreading3 m1=new Multithreading3();
            m1.start();
        }
    }
}
