package Test.Endes.MisArrays;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import Main.Endes.MisArrays.MisArrays;
import org.junit.jupiter.api.*;

public class ArraysTest {

    static int[] array1, array2, resul;

    @BeforeEach
    void iniciar() {
        array1 = new int[]{2, 4, 5};
        array2 = new int[]{1, 1, 1};
        resul = new int[]{3, 5, 6};
    }

    @BeforeEach
    void iniciar2() {
        array1 = new int[]{2, 4, 5};
        array2 = new int[]{1, 1, 1};
        resul = new int[]{3, 5, 6};
    }

    @Test
    @Order(3)
    void testSumar() {
        MisArrays arra = new MisArrays();
        assertArrayEquals(resul, arra.sumar(array1, array2));
    }

    @Test
    @Order(2)
    void testSumar2() {
        MisArrays arra = new MisArrays();
        assertArrayEquals(resul, arra.sumar(array1, array2));
    }

    @Test
    @Order(1)
    void testDecrementar() {
        MisArrays arra = new MisArrays();
        arra.decrementar(array1, 1);
        assertArrayEquals(array1, new int[]{1, 3, 4});
    }
    @AfterAll
    static void finalizar() {
        System.out.println("Fin de los tests");
    }
    @AfterEach
    void finalizar2() {
        System.out.println("Finaliza un test");
    }
}

