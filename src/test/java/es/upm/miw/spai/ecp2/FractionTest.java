package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
    private Fraction fraccion;

    @Before
    public void before() {
        fraccion = new Fraction(1, 5);
    }
    
    @Test
    public void testFractionIntInt() {
        assertEquals(1, this.fraccion.getNumerator());
        assertEquals(5, this.fraccion.getDenominator());
    }

    @Test
    public void testFraction() {
        this.fraccion = new Fraction();
        assertEquals(1, this.fraccion.getNumerator());
        assertEquals(1, this.fraccion.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(0.2, this.fraccion.decimal(), 10e-5);
    }
    
   
}
