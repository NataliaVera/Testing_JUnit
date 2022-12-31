package com.example.testing.usuarios;

import java.util.ArrayList;

public class Usuarios {
    ArrayList<Usuario> usuarios = new ArrayList<>();
    public Usuario crear(Usuario usuario){
        usuarios.add(usuario);
        return usuario;
    }

   public String buscar(Usuario usuario){
        for(Usuario usuarioActual : usuarios){
            if(usuarioActual.nombre.equalsIgnoreCase(usuario.nombre)){
                return usuarioActual.nombre;
            }
        }
        return null;
   }

    public boolean eliminar(Usuario usuario){
        return usuarios.remove(usuario);
    }
}
