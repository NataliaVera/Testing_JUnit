package com.example.testing.curso;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.condition.OS.MAC;

class OperacionesTest {

    @Test
    @EnabledOnOs(OS.MAC) // se ejecuta solo cuando el sistema es MAC
    //@DisabledOnOs(MAC) // desabilita para ese sistema operativo
    @EnabledOnJre(JRE.JAVA_8) // que se ejecure para esa version de Java
    void verificarSistemaOperativo(){
        String sistema = System.getProperty("os.name");
        assumeTrue(sistema.equalsIgnoreCase("Mac OS X"));
    }

}