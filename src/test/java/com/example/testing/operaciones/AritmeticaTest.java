package com.example.testing.operaciones;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AritmeticaTest {

    Aritmetica aritmetica = new Aritmetica();

    @BeforeAll // se va a ejecutar una unica vez antes de los test
    static void init(){
        System.out.println("Antes de los test");
    }

    @BeforeEach // se ejecuta antes de cada test
    void before(){
        System.out.println("Antes del test actual");
    }

    @AfterEach
    void afterEach(){
        System.out.println("Despues del test actual");
    }

    @AfterAll // se ejecuta despues de todos los test
    static  void after(){
        System.out.println("Test finalizados ");
    }

    @Test
    void probar2mas2(){
        Aritmetica aritmetica = new Aritmetica();
        double result = aritmetica.suma(2, 2);
        //las aserciones esperan un valor
        assertEquals(4, result);
    }

    @DisplayName("Testecillo")
    @RepeatedTest(value = 5, name = "test: {displayName}, iteraciones: {totalrepeticiones}, actual: {currentRepetition}") // Cuantas veces se va a repetir el test
    void suma(){
        Aritmetica aritmetica = new Aritmetica();
        double result = aritmetica.suma(2, 2);
        double result2 = aritmetica.suma(4, 8);
        //las aserciones esperan un valor

        assertAll(
                "sumadores",
                () -> assertEquals(4, result),
                () -> assertEquals(12, result2)
        );

    }

    /**
     * Forma de test genérica
     * @param a
     */
    @ParameterizedTest
    @ValueSource(doubles = {8, 4})
    void testParametizeds(double a){
        double result = aritmetica.suma(4,4);
        assertEquals(a, result);
    }

    @Test
    void mayorQue(){
        assertTrue(5 < 1);
    }

    @Test
    void probarFalladora(){
        Throwable excepcion = assertThrows(IOException.class,() -> aritmetica.falladora() );// funcion que me devuelva una excepcion
    }
}