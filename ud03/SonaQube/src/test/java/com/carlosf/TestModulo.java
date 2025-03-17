package com.carlosf;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestModulo {

      @Test
    public void comprobarConstructorVacio(){

        Modulo contornosDesenvolvemento = new Modulo();

        
        assertNull(contornosDesenvolvemento.getNombre());
        assertNull(contornosDesenvolvemento.getCodigo());
        assertNull(contornosDesenvolvemento.getDescripcion());
        assertNull(contornosDesenvolvemento.getHoras());
        assertNull(contornosDesenvolvemento.getSesiones());
    }

    Modulo BBDD;

     @BeforeEach
     void createMatricula() {

        BBDD = new Modulo();

        BBDD.setNombre("BasesDatos");
        BBDD.setCodigo("BD");
        BBDD.setDescripcion("organizar e administrar datos");
        BBDD.setHoras(250);
        BBDD.setSesiones(70);

     }

     @Test
     void comprobarGetters(){

        assertNotNull(BBDD.getNombre());
        assertNotNull(BBDD.getCodigo());
        assertNotNull(BBDD.getDescripcion());
        assertNotNull(BBDD.getHoras());
        assertNotNull(BBDD.getSesiones());
     }

     Modulo Linguaxes;

     @Test
     public void comprobarToString(){

        Linguaxes = new Modulo("LMSXI","LinguaxeMarcas","Aprender diferentes linguaxes",100,20);

     }

}