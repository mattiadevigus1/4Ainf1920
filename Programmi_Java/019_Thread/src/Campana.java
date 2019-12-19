public class Campana  implements Runnable{
    String suono;
    int n;

    public Campana(String suono, int n) {
        this.suono = suono;
        this.n = n;
    }

    public void run ()
    {
        for (int k=0; k<n; k++)
        {
            System.out.print ((k+1) + suono + " ");
        }
    }
}
