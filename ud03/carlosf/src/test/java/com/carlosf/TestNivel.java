package com.carlosf;

import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;


public class TestNivel {
       @Test
    public void comprobarConstructorVacio(){

        Nivel cicloMedio = new Nivel();

        
        assertNull(cicloMedio.getNivel());
    
    } 
}