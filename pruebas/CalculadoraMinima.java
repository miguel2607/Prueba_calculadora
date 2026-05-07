package pruebas;

public class CalculadoraMinima {

    int suma(int a, int b) {
        return a + b;
    }

    int resta(int a, int b) {
        return a - b;
    }

    int multiplicacion(int a, int b) {
        return a * b;
    }

    int division(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        CalculadoraMinima c = new CalculadoraMinima();
        int x = 12;
        int y = 3;
        System.out.println(c.suma(x, y));
        System.out.println(c.resta(x, y));
        System.out.println(c.multiplicacion(x, y));
        System.out.println(c.division(x, y));
    }
}
