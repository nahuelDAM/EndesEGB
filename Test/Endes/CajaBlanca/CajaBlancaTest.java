package Test.Endes.CajaBlanca;

import Main.Endes.CajaBlanca.CajaBlanca;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class CajaBlancaTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testEjercicio2_Caso1() {
        assertEquals(1, CajaBlanca.ejercicio2(2, 6, 1));
    }

    @Test
    public void testEjercicio2_Caso2() {
        assertEquals(-1, CajaBlanca.ejercicio2(0, 10, 0));
    }

    @Test
    public void testEjercicio2_Caso3() {
        assertEquals(-1, CajaBlanca.ejercicio2(3, 4, 5));
    }

    @Test
    public void testEjercicio3() throws IOException {

        ByteArrayInputStream inputStream = new ByteArrayInputStream("3\n6\n2\n".getBytes());
        System.setIn(inputStream);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        CajaBlanca.ejercicio3();
        assertEquals("El máximo es 6", outputStream.toString().trim());
    }

    @Test
    public void testEjercicio4_Caso1() {
        char[] cadena = {};
        assertEquals(0, CajaBlanca.ejercicio4(cadena, 'a'));
    }

    @Test
    public void testEjercicio4_Caso2() {
        char[] cadena = {'b', 'a', 'n', 'a', 'n', 'a'};
        assertEquals(3, CajaBlanca.ejercicio4(cadena, 'a'));
    }

    @Test
    public void testEjercicio4_Caso3() {
        char[] cadena = {'h', 'e', 'l', 'l', 'o'};
        assertEquals(1, CajaBlanca.ejercicio4(cadena, 'o'));
    }
}
