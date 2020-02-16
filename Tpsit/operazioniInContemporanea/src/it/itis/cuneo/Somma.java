package it.itis.cuneo;

import java.nio.Buffer;

public class Somma extends Thread {

    private Buffer buffer;

    public Somma(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        buffer.setY( buffer.getA() + buffer.getX() );
        System.out.println("y = " + buffer.getY());
    }
}