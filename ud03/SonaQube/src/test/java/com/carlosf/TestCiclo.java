package com.carlosf;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class TestCiclo {


    @Test
     public void comprobarConstructorVacio(){

        Ciclo cicloSMR= new Ciclo();

        
        assertNull(cicloSMR.getNombre());
        assertNull(cicloSMR.getCodigo());
        assertNull(cicloSMR.getNivel());
        assertNull(cicloSMR.getCentro());
       
    }


    Ciclo cicloDAW;

    @BeforeEach
     void createCiclo() {

       cicloDAW = new Ciclo();

       cicloDAW.setNombre(("Desenvolvemento"));
       cicloDAW.setCodigo(("DAW"));
       cicloDAW.setNivel(new Nivel("Superior"));
       cicloDAW.setCentro(new Centro(1, "centroSanClemente", "Localidad", "Calle", "Núm", 12345));
      
   }

   @Test
     void comprobarGetters(){

      Ciclo cicloDAW = new Ciclo();

      
      assertNull(cicloDAW.getNombre());
      assertNull(cicloDAW.getCodigo());
      assertNull(cicloDAW.getNivel());
      assertNull(cicloDAW.getCentro());
     
  }





}
