package examenfinalparte1;

public class Principal {

    int i;

 public int suma(int num1, int num2) {
        return num1 + num2;
    }
    public int SumaDistintos(int num1, int num2) {
        i = suma(num1, num2);
        return i;
    }

    public int sumaMismoNum(int num) {
        i = suma(num, num);
        return i;
    }

    public int menosUno() {
        i = -1;
        return i;
    }

  
}
