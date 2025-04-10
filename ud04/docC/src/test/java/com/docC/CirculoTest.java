package com.docC;

import org.junit.jupiter.api.Test;

public class CirculoTest {

        @Test
    public void testConstructorYMetodosBasicos() {
        Circulo c = new Circulo(1, 2, 3.0);
        c.obtenerX();
        c.obtenerY();
        c.obtenerRadio();
        c.establecerX(4);
        c.establecerY(5);
        c.establecerRadio(6.0);
        c.obtenerDiametro();
        c.obtenerCircunferencia();
        c.obtenerArea();
        c.toString();

        new Circulo(0, 0, -5.0);
    }
}
