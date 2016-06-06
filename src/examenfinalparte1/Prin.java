package examenfinalparte1;

import java.io.IOException;
/**
 * 
 * @author Brais
 */

public class Prin {

    public static void main(String[] args) throws IOException {
        /**
         * Aqui creamos un obj de tipo principal
         */
        Principal obj = new Principal();
        /**
         * Mostramos por pantalla Es: y concatenamos el metodo SumaDistintos introduciendole 2 valores
         */
        System.out.println("Es: " + obj.SumaDistintos(10, 20));
        /**
         * Mostramos por pantalla Es: y concatenamos el metodo sumaMismoNum introduciendole 1 valor
         */
        
        System.out.println("Es: " + obj.sumaMismoNum(10));
        /**
         * Mostramos por pantalla Es: y concatenamos el metodo SumaDistintos que retorna -1
         */
        
        System.out.println("Es: " + obj.menosUno());
    }
}
