package examenfinalparte1;

public class Principal {

    int i;
 /**
     * Metodo el cual realiza una suma de 2 numeros
     * @param num1 valor del 1 numero
     * @param num2 valor del 2 num
     */
 public int suma(int num1, int num2) {
        return num1 + num2;
    }
 /**
  * Este metodo va a sumar 2 numeros distintos utilizando el metodo anterior suma
  * @param num1 valor del 1 numero
  * @param num2 valor del 2 numero
  * @return Por ultimo retorna el valor de la suma de ambos recogida en i
  */
    public int SumaDistintos(int num1, int num2) {
        i = suma(num1, num2);
        return i;
    }
/**
 * Este metodo va a sumar 2 numeros con el mismo valor, aunque solo se le introduce un parametro
 * Utilizamos tambien el metodo anterior
 * @param num Valor del numero que se introduce 
 * @return Retorna el valor de la suma recogida en i
 */
    public int sumaMismoNum(int num) {
        i = suma(num, num);
        return i;
    }
/**
 * Este metodo simplemente nos devuelve el valor -1
 * @return 
 */
    public int menosUno() {
        i = -1;
        return i;
    }

  
}
