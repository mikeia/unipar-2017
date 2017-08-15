package com.unipar.mussinato.aulaintegracaocontinua;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
    
    @Test
    public void somarTest(){
        Double resultado = new Calculadora().somar(2.0, 2.0);
        Assert.assertEquals(4.0,resultado,0);
    }
}
