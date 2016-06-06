package examenfinalparte1;

import java.io.IOException;

public class Prin {

    public static void main(String[] args) throws IOException {
        Principal obj = new Principal();

        System.out.println("Es: " + obj.SumaDistintos(10, 20));
        
        System.out.println("Es: " + obj.sumaMismoNum(10));
        
        System.out.println("Es: " + obj.menosUno());
    }
}
