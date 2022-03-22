package Test;

import clases.Matematica;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatematicaTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void multiplicar() {

        /*double x= 4;
        double y = 0.5;
        double resultadoEsperado= 2;
        double resultado = Matematica.Multiplicar(x,y);
        assertEquals(resultadoEsperado, resultado, "No rula");*/
        assertEquals(2,Matematica.Multiplicar(4, 0.5),"No rula");
        /*Assert.assertTrue(
                "La multiplicación no es correcta",
                resultado==resultadoEsperado);*/
    }

    @Test
    void suma(){

        int x=4;
        int y=3;
        int resultadoEsperado=7;
        int resultado = Matematica.Suma(x,y);

        Assert.assertTrue(
                "La suma no es correcta",
                resultado ==resultadoEsperado);
    }

    @Test
    void esPar() {

        int num= 4;
        boolean resultadoEsperado = true;
        boolean resultado= Matematica.esPar(num);

        Assert.assertTrue(
                "El numero no es par",
                Matematica.esPar(num));
    }

    @Test
    void esPar2() {

        int num=6;
        boolean resultadoEsperado = true;
        boolean resultado= Matematica.esPar2(num);

        Assert.assertTrue(
                "El numero no es par",
                Matematica.esPar2(num));


    }
}