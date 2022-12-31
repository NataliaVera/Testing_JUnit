package com.example.testing.usuarios;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UsuariosTest {
    private final String nombrePorDefecto = "pruebas";
    Usuarios usuarios = new Usuarios();
    Usuario usuario = new Usuario();

    @BeforeEach
    void inicialize(){
        usuario.nombre =nombrePorDefecto;
    }

    @Test
    void crearUsuario(){
        Usuario usuarioCreado = usuarios.crear(usuario);
        assertEquals(usuarioCreado.nombre, nombrePorDefecto);
    }

    @Test
    void buscarUsuario(){
        usuarios.crear(usuario);

        String resultado = usuarios.buscar(usuario);
        assertEquals(nombrePorDefecto, resultado);
    }

    @Test
    void buscarUsuarioNoExiste(){
        String resultado = usuarios.buscar(usuario);
        assertEquals(null, resultado);
    }

    @Test
    void borrarUsuario(){
        usuarios.crear(usuario);
        boolean existe = usuarios.eliminar(usuario);
        assertEquals(true, existe);
    }

    @Test
    void borrarUsuarioNoExistente(){
        boolean resultado = usuarios.eliminar(usuario);
        assertEquals(false, resultado);
    }
}