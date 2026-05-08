package pruebas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculadoraMinimaTest {

    private final CalculadoraMinima calc = new CalculadoraMinima();

    @Test
    void suma_retorna_suma_de_a_y_b() {
        assertEquals(8, calc.suma(5, 3));
    }

    @Test
    void resta_retorna_a_menos_b() {
        assertEquals(9, calc.resta(12, 3));
    }

    @Test
    void multiplicacion_retorna_producto() {
        assertEquals(28, calc.multiplicacion(4, 7));
    }

    @Test
    void division_entera_retorna_cociente() {
        assertEquals(4, calc.division(12, 3));
    }

    @Test
    void division_por_cero_lanza_arithmetic_exception() {
        assertThrows(ArithmeticException.class, () -> calc.division(5, 0));
    }
}
