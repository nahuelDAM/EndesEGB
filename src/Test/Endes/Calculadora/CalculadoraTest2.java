package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest2 {

    @Test
    void testEsPar() {
        assertTrue(Calculadora.esPar(10));
    }

    @Test
    void testEsPar2() {
        assertFalse(Calculadora.esPar(33));
    }
    @Test
    void testParOimpar(){
        assertEquals("impar", Calculadora.esParOImpar(11));
        assertEquals("par", Calculadora.esParOImpar(10));
    }
}