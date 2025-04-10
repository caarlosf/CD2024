package com.docC;

import org.junit.jupiter.api.Test;

public class EstudianteTest {
    
   
        @Test
    public void testBasicoEstudiante() {
        Estudiante e = new Estudiante("Juan", 20);

        e.getNombre();
        e.getEdad();
        e.getCalificacion();

        e.setNombre("Pedro");
        e.setEdad(21);
        e.setCalificacion(7.5);

        e.aprobo(); // true

        e.setCalificacion(3.0);
        e.aprobo(); // false

        e.edadEscolar();
        e.esUniversitario();
        e.imprimirInformacion();
    }
}