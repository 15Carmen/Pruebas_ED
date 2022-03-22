package Test;

import clases.Burbuja;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BurbujaTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    // En este caso se debe realizar al menos un test que ejecute el bucle principal un número típico de veces.
    @Test
    void burbuja() {

        //datos de entrada
        int[] arreglo = {2, 4, 27, 12, 15, 8, 5};
        //resutado que se espera
        int[] resultadoEsperado = {2,4 ,5 ,8 ,12 ,15 ,27};
        //resultado real
        int[] resultadoReal = Burbuja.burbuja(arreglo);

        assertArrayEquals(resultadoEsperado, resultadoReal, "resultado erroneo");

    }

    // En este caso se debe realizar al menos un test que ejecute el bucle principal 0 veces.
    @Test
    void burbuja2(){

        //datos de entrada
        int[] arreglo = new int[0];
        //resutado que se espera
        int[] resultadoEsperado = {};
        //resultado real
        int[] resultadoReal = Burbuja.burbuja(arreglo);

        assertArrayEquals(resultadoEsperado, resultadoReal, "resultado erroneo");
    }

    // En este caso se debe realizar al menos un test que ejecute el bucle principal 1 vez.
    @Test
    void burbuja3(){

        //datos de entrada
        int[] arreglo = new int[]{2};
        //resutado que se espera
        int[] resultadoEsperado = {2};
        //resultado real
        int[] resultadoReal = Burbuja.burbuja(arreglo);

        assertArrayEquals(resultadoEsperado, resultadoReal, "resultado erroneo");
    }
}