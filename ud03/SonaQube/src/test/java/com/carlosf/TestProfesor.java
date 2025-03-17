package com.carlosf;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class TestProfesor {

    @Test
    void testProfesor() {
        
        Profesor prof = new Profesor();
        
        assertNull(prof.getEspecialidad());
        assertNull(prof.getCuerpo());
        assertFalse(prof.isSustituto());
        assertNull(prof.getFecOposicion());

        
        prof.setEspecialidad("Matemáticas");
        prof.setCuerpo("Secundaria");
        prof.setSustituto(true);
        Date fechaOposicion = new Date();
        prof.setFecOposicion(fechaOposicion);

        
        assertEquals("Matemáticas", prof.getEspecialidad());
        assertEquals("Secundaria", prof.getCuerpo());
        assertTrue(prof.isSustituto());
        assertEquals(fechaOposicion, prof.getFecOposicion());

        
        String resultadoToString = prof.toString();
        assertTrue(resultadoToString.contains("Matemáticas"));
        assertTrue(resultadoToString.contains("Secundaria"));
        assertFalse(resultadoToString.contains(String.valueOf(fechaOposicion.getTime())));
    }
}
