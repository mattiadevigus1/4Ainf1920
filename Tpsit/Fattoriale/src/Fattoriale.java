

public class Fattoriale extends Thread{
    double n;

    public Fattoriale(double n) {
        this.n = n;
    }

    @Override
    public void run() {
        n = n * fatt(n-1);
        System.out.print(n);
    }

    private double fatt(double t) {
        double d = 1;
        if (t >= 1){
            d = t * fatt(t-1);
        }

        return d;
    }
}
