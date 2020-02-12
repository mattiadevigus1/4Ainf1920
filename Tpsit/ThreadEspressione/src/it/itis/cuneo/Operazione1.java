package it.itis.cuneo;

import java.nio.Buffer;

public class Operazione1 extends Thread{
    Buffer dati;
    private int a;

    public Operazione1 (Buffer d) {
        a = 3;
    }

    public void run() {
        int ris;
        ris = 4*(a-2)+5;
    }
}
