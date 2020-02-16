package it.itis.cuneo;

package it.itis.cuneo;

public class Buffer {

    private int x, y, z;

    private int a, b, c;

    public Buffer() {}

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getZ() {
        return z;
    }
    public void setZ(int z) {
        this.z = z;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }


    @Override
    public String toString() {
        return "Buffer{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}