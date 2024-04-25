package Test.Endes.Calculadora;

import Main.Endes.Calculadora.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void restar() {
        assertEquals(5, Calculadora.restar(10, 5));
        assertEquals(1, Calculadora.restar(6, 5));
        assertEquals(6, Calculadora.restar(8, 2));
    }

    @Test
    void restar1(){
        assertEquals(-2, Calculadora.restar(2, 4));
    }

    @Test
    void restar2(){
        assertEquals(0, Calculadora.restar(6, 6));
    }

    @Test
    void restar3(){
        assertEquals(3, Calculadora.restar(5, 2));
    }

    @Test
    void testDividir1() {
        assertEquals(1, Calculadora.dividir(4, 4));
    }
    @Test
    void testDividir2() {
        assertEquals(1, Calculadora.dividir(3, 2));
    }
    @Test
    void testDividir3() {
        assertThrows(java.lang.ArithmeticException.class,()->Calculadora.dividir(4, 0));
    }
    @Test
    void testDividir4() {
        assertAll("Juntado Test",
                ()->assertEquals(1, Calculadora.dividir(4, 4)),
                ()->assertEquals(1, Calculadora.dividir(3, 2))
        );
    }
    @Test
    void testDividir5() {
        assertTrue(Calculadora.dividir(6, 2)==3);
    }


}