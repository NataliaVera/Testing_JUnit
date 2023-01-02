package com.example.testing.Sesion9Faker;

import java.util.ArrayList;

public class DatosReales {
    //Mock simulan objeetos que no existen
    //Se utiliza una libreria llamada Mockito, suplanta la clase que le decimos
    public DatosReales(){
        System.out.println("datos conectados, en produccion");
    }

    public void estoEsReal(){

    }

    public ArrayList<Double> getData(){
        //DB real
        ArrayList<Double> retorno = new ArrayList<>();
        for(int i = 0; i< 3; i++){
            double valor = Math.random();
            retorno.add(valor);
        }
        return retorno;
    }
}
