package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

    private User usuario;

    @Before
    public void before() {
        this.usuario = new User(1, "SIJING", "XI");
    }

    @Test
    public void testUser() {
        assertEquals(1, this.usuario.getNumber());
        assertEquals("SIJING", this.usuario.getName());
        assertEquals("XI", this.usuario.getFamilyName());
    }

    @Test
    public void testFullName() {
        assertEquals("SIJING XI", this.usuario.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals("S.", this.usuario.initials());
    }
    
    @Test
    public void testNameAsia(){
        assertEquals("XI SIJING", this.usuario.nameAsia());
    }


}
