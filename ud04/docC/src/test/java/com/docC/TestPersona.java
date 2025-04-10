package com.docC;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TestPersona {

    @Test
    void testConstructorYGetters() {
        Persona persona = new Persona("Carlos", 40);
        assertEquals("Carlos", persona.getNombre());
        assertEquals(40, persona.getEdad());
    }

    @Test
    void testSetters() {
        Persona persona = new Persona("Maria", 25);
        persona.setNombre("Laura");
        persona.setEdad(35);
        assertEquals("Laura", persona.getNombre());
        assertEquals(35, persona.getEdad());
    }

    @Test
    void testImprimirDetalles() {
        Persona persona = new Persona("Luis", 50);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        persona.imprimirDetalles();

        String expectedOutput = "Nombre: Luis" + System.lineSeparator() + "Edad: 50" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());

        System.setOut(System.out);
    }
}

