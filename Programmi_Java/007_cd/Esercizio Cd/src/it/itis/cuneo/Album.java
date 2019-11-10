package it.itis.cuneo;

public class Album {
    private Cd pop;
    private Cd rap;

    //Costruttore
    public Album(Cd cd, Cd cd1)
    {
        this.pop = new Cd(cd);
        this.rap = new Cd(cd1);
    }

    @Override
    public String toString() {
        return "Pop: " + this.pop + "Rap: " + this.rap;
    }

    public static void main(String[] args) {
        Cd cd = new Cd("Musica da giostra" , "Dj Matrix" , 120 , 24);
        Cd cd1= new Cd(cd);
        System.out.println(cd.equals(cd1));
        Album album = new Album(cd,cd1);
        System.out.println(album.toString());
    }
}
