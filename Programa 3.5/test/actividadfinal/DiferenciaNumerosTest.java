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
        String esperado = "2 - 3 - 4 - 5 - 6 - 7 - 8 - 9";
        int valor1 = 1, valor2 = 10;
        String resultado = DiferenciaNumeros.diferenciaNumeros(valor1, valor2);
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void prueba02() {
        System.out.println("Prueba 02\nValores usados: 10, 1");
        String esperado = "9 - 8 - 7 - 6 - 5 - 4 - 3 - 2";
        int valor1 = 10, valor2 = 1;
        String resultado = DiferenciaNumeros.diferenciaNumeros(valor1, valor2);
        assertEquals(esperado, resultado);
    }
}