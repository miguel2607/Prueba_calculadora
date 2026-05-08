package pruebas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculadoraPerfectaTest {

    private final CalculadoraPerfecta calc = new CalculadoraPerfecta();

    @Test
    void suma_retorna_suma_de_a_y_b() {
        assertEquals(8, calc.sumar(5, 3));
    }

    @Test
    void resta_retorna_a_menos_b() {
        assertEquals(9, calc.restar(12, 3));
    }

    @Test
    void multiplicacion_retorna_producto() {
        assertEquals(28, calc.multiplicar(4, 7));
    }

    @Test
    void division_entera_retorna_cociente() {
        assertEquals(4, calc.dividir(12, 3));
    }

    @Test
    void division_por_cero_lanza_excepcion() {
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(5, 0));
    }
}
