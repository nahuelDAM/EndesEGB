package Test.Endes.Baremo;

import Main.Endes.Baremo.Baremo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaremoTest {
    @Test
    public void testAdjudicadaValida() {
        Baremo baremo = new Baremo();
        assertEquals("Adjudicada", baremo.comprobarBaremo("1234567A", 9));
    }

    @Test
    public void testNoAdjudicadaValida() {
        Baremo baremo = new Baremo();
        assertEquals("No adjudicada", baremo.comprobarBaremo("1234567A", 4));
    }

    @Test
    public void testDatoNoValido1() {
        Baremo baremo = new Baremo();
        assertEquals("Dato no Válido", baremo.comprobarBaremo("123456A", 2));
    }

    @Test
    public void testDatoNoValido2() {
        Baremo baremo = new Baremo();
        assertEquals("Dato no Válido", baremo.comprobarBaremo("1234567890A", 2));
    }

    @Test
    public void testDatoNoValido3() {
        Baremo baremo = new Baremo();
        assertEquals("Dato no Válido", baremo.comprobarBaremo("1234ABC5", 2));
    }

    @Test
    public void testDatoNoValido4() {
        Baremo baremo = new Baremo();
        assertEquals("Dato no Válido", baremo.comprobarBaremo("ABCD12345", 6));
    }

    @Test
    public void testDatoNoValido5() {
        Baremo baremo = new Baremo();
        assertEquals("Dato no Válido", baremo.comprobarBaremo("1234567A", -5));
    }

    @Test
    public void testDatoNoValido6() {
        Baremo baremo = new Baremo();
        assertEquals("Dato no Válido", baremo.comprobarBaremo("1234567A", 20));
    }

    @Test
    public void testDatoNoValido7() {
        Baremo baremo = new Baremo();
        assertEquals("Dato no Válido", baremo.comprobarBaremo("1234567A", 7));
    }
}