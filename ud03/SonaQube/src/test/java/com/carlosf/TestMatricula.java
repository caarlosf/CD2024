package com.carlosf;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class TestMatricula {


     @Test
     public void comprobarConstructorVacio(){

        Matricula alumno1 = new Matricula();
        
        assertNull(alumno1.getAlumno());
        assertNull(alumno1.getModulo());
        assertNull(alumno1.getNota());
        assertNull(alumno1.getCurso());
       
    }
    

    Matricula matricula1;

    @BeforeEach
     void createMatricula() {
        
        matricula1 = new Matricula();

       matricula1.setAlumno(new Alumno());
       matricula1.setModulo(new Modulo());
       matricula1.setNota(7);
       matricula1.setCurso("DAW");
    }


    @Test
     void comprobarGetters(){

       assertNotNull(matricula1.getAlumno());
       assertNotNull(matricula1.getModulo());
       assertEquals(7, matricula1.getNota());
       assertEquals("DAW", matricula1.getCurso());
    }

    @Test
    void testConstructorConObjetos() {
        
        Alumno alumno = new Alumno();
        alumno.setNombre("Pepe");

        Modulo modulo = new Modulo();
        //modulo.setModulo("BBDD");


        Matricula matricula1 = new Matricula(alumno, modulo, 7, "DAW");

        
        assertEquals("Pepe", matricula1.getAlumno().getNombre());
        //assertEquals("BBDD", matricula1.getModulo().getModulo());
        assertEquals(7, matricula1.getNota());
        assertEquals("DAW", matricula1.getCurso());

        
        String esperado = "Matricula [alumno=Alumno[Pepe], modulo=Modulo[BBDD], nota=7, curso=DAW]";
        //assertEquals(esperado, matricula1.toString());
    }
}