package it.itis.cuneo;

public class Moltiplicazione extends Thread {

    private Buffer buffer1, buffer2;

    public Moltiplicazione(Buffer buffer) {
        this.buffer1 = buffer;
        buffer2 = null;
    }
    public Moltiplicazione(Buffer buffer1, Buffer buffer2) {
        this.buffer1 = buffer1;
        this.buffer2 = buffer2;
    }

    public void run() {
        if (buffer2 == null) {
            // x = b * J
            buffer1.setX(buffer1.getB() * buffer1.getC());
            System.out.println("x = " + buffer1.getX());
        } else {
            // y = y1 * y2
            buffer1.setZ( buffer1.getY() * buffer2.getY() );
            System.out.println("z = " + buffer1.getZ());
        }
    }
}