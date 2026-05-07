package pruebas;

import java.util.logging.Logger;

public class CalculadoraPerfecta {

    private static final Logger LOGGER = Logger.getLogger(CalculadoraPerfecta.class.getName());

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return dividendo / divisor;
    }

    public static void main(String[] args) {
        CalculadoraPerfecta c = new CalculadoraPerfecta();
        int a = 12;
        int b = 3;
        LOGGER.info("Suma: " + c.sumar(a, b));
        LOGGER.info("Resta: " + c.restar(a, b));
        LOGGER.info("Multiplicacion: " + c.multiplicar(a, b));
        LOGGER.info("Division: " + c.dividir(a, b));
    }
}
