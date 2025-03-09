package com.carlosf;

import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;


class CentroTest {

    @Test
    void testConstructorVacio() {

        Centro centroSanClemente = new Centro();
        
        assertNull(centroSanClemente.getCodigo());
        assertNull(centroSanClemente.getNombre());
        assertNull(centroSanClemente.getLocalidad());
        assertNull(centroSanClemente.getCalle());
        assertNull(centroSanClemente.getNumero());
        assertNull(centroSanClemente.getCodigoPostal());
    }

}
