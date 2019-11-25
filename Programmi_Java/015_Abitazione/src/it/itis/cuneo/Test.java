package it.itis.cuneo;

/**
 * Created by inf.devigusm0708 on 20/11/2019.
 */
public class Test {

    public static void main(String[] args) {
     Villa villa = new Villa(5 , 200 , "Via roma" , "Cuneo" , 2 , 100 , true);
        System.out.println(villa.toString());

       Appartamento appartamento = new Appartamento(5 , 200 , "Via roma" , "Cuneo" , 2 , false , 5);
        System.out.println(appartamento.toString());
    }
}
