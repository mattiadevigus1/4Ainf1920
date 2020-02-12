package it.itis.cuneo;

public class Main {
    public static void main(String[] args) {
        int a,b;
        a=3;
        b= 2;

        Operazione1 thr1 = new Buffer(a,b);
        Operazione2 thr2 = new Operazione1();
        Operazione3 thr3 = new Operazione2();
    }
}
