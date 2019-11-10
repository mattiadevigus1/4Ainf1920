package it.itis.cuneo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class input {
    public static int somma(int n1, int n2)
    {
        int k;
        k = n1+n2;
        return k;
    }

    public static int sottrazione(int n1, int n2)
    {
        int k;
        k = n1-n2;
        return k;
    }

    public static int moltiplicazione(int n1, int n2)
    {
        int k;
        k = n1*n2;
        return k;
    }

    public static int divisione(int n1, int n2)
    {
        int k;
        k = n1/4n2;
        return k;
    }

    public static void main(String[] args) throws IOException {
        int k=0;
        //numero1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int i = Integer.parseInt(s);
        //numero2
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String e = br2.readLine();
        int o = Integer.parseInt(e);

        k= somma(i,o);
        System.out.println(k);
        k=sottrazione(i,o);
        System.out.println(k);
        k=moltiplicazione(i,o);
        System.out.println(k);
        k=divisione(i,o);
        System.out.println(k);
    }
}
