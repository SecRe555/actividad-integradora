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
        System.out.println("Prueba 01\nValores usados: 1, 11");
        String esperado = "2 - 4 - 6 - 8 - 10";
        int valor1 = 1, valor2 = 11;
        String resultado = DiferenciaNumeros.diferenciaNumeros(valor1, valor2);
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void prueba02() {
        System.out.println("Prueba 02\nValores usados: 10, 1");
        String esperado = "8 - 6 - 4 - 2";
        int valor1 = 10, valor2 = 1;
        String resultado = DiferenciaNumeros.diferenciaNumeros(valor1, valor2);
        assertEquals(esperado, resultado);
    }
}