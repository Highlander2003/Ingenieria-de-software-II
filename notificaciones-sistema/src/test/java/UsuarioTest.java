package com.notificaciones;

import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class UsuarioTest {

    @Test
    public void testUsuarioCreacion() {
        Usuario usuario = new Usuario("Juan", "juan@example.com", "555-1234", Arrays.asList(new CanalEmail()));
        assertEquals("Juan", usuario.getNombre());
        assertEquals("juan@example.com", usuario.getEmail());
        assertEquals("555-1234", usuario.getTelefono());
    }
}
