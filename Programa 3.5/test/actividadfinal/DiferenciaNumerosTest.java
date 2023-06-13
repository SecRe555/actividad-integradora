package actividadfinal;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Axel Luis Daniel Manzano Rodriguez
 */
public class DiferenciaNumerosTest {

    public DiferenciaNumerosTest() {
    }

    @Test
    public void prueba01() {
        System.out.println("Prueba 01\nValores usados: 1, 10");
        String esperado = "3 - 5 - 7 - 9";
        int valor1 = 1, valor2 = 10;
        String resultado = DiferenciaNumeros.diferenciaNumeros(valor1, valor2);
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void prueba02() {
        System.out.println("Prueba 02\nValores usados: 10, 0");
        String esperado = "9 - 7 - 5 - 3 - 1";
        int valor1 = 10, valor2 = 0;
        String resultado = DiferenciaNumeros.diferenciaNumeros(valor1, valor2);
        assertEquals(esperado, resultado);
    }
}