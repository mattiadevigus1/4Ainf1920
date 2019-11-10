package it.itis.cuneo;

public class Rettangolo {
    private int lato1;
    private int lato2;
    private int lato3;
    private int lato4;

    public Rettangolo(int valore1, int valore2, int valore3, int valore4) {
        lato1 = valore1;
        lato2 = valore2;
        lato3 = valore3;
        lato4 = valore4;
    }

    public void setLato1(int valore1) {
        this.lato1 = valore1;
    }

    public void setLato2(int valore2) {
        this.lato2 = valore2;
    }

    public void setLato3(int valore3) {
        this.lato3 = valore3;
    }

    public void setLato4(int valore4) {
        this.lato4 = valore4;
    }

    public int getLato1() {
        return this.lato1;
    }

    public int getLato2() {
        return this.lato2;
    }

    public int getLato3() {
        return this.lato3;
    }

    public int getLato4() {
        return this.lato4;
    }

    public static class Punto {
        private int asseX;
        private int asseY;

        //costruttore
        public Punto(int valore1, int valore2) {
            asseX = valore1;
            asseY = valore2;
        }

        public void setAsseX(int valore1) {
            this.asseX = valore1;
        }

        public void setAsseY(int valore2) {
            this.asseY = valore2;
        }

        public int getAsseX() {
            return this.asseX;
        }

        public int getAsseY() {
            return this.asseY;
        }
    }

    public static class Segmento {
        private int x0;
        private int x1;
        private int y0;
        private int y1;

        //costruttore
        public Segmento(int valore1, int valore2, int valore3, int valore4) {
            x0 = valore1;
            x1 = valore2;
            y0 = valore3;
            y1 = valore4;
        }

        public void setX0(int valore1) {
            this.x0 = valore1;
        }

        public void setX1(int valore2) {
            this.x1 = valore2;
        }

        public void setY0(int valore3) {
            this.y0 = valore3;
        }

        public void setY1(int valore4) {
            this.y1 = valore4;
        }

        public int getX0() {
            return this.x0;
        }

        public int getX1() {
            return this.x1;
        }


        public int getY0() {
            return this.y0;
        }


        public int getY1() {
            return this.y1;
        }

        public int getDistanza() {
            int distanza;
            distanza = (int) Math.sqrt((x0 - x1) * (x0 - x1) + (y0 - y1) * (y0 - y1));
            return distanza;
        }

    }


    String calcolaArea() {
        int area;
        area = this.lato1 + this.lato2 + this.lato3 + this.lato4;
        return "L' area vale: " + area;
    }

    public static void main(String[] args) {
        Punto punto1 = new Punto(3, 6);
        Punto punto2 = new Punto(3, 9);
        Punto punto3 = new Punto(6, 9);
        Punto punto4 = new Punto(6, 6);
        Segmento segmento = new Segmento(punto1.getAsseX(), punto1.getAsseY(), punto2.getAsseX(), punto2.getAsseY());
        Segmento segmento1 = new Segmento(punto2.getAsseX(), punto2.getAsseY(), punto3.getAsseX(), punto3.getAsseY());
        Segmento segmento2 = new Segmento(punto3.getAsseX(), punto3.getAsseY(), punto4.getAsseX(), punto4.getAsseY());
        Segmento segmento3 = new Segmento(punto4.getAsseX(), punto4.getAsseY(), punto1.getAsseX(), punto1.getAsseY());
        Rettangolo rettangolo = new Rettangolo(segmento.getDistanza(), segmento1.getDistanza(), segmento2.getDistanza(), segmento3.getDistanza());
        System.out.println(rettangolo.calcolaArea());
    }
}
