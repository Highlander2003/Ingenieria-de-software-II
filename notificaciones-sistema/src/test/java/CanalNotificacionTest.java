package com.notificaciones;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CanalNotificacionTest {

    @Test
    public void testCanalEmail() {
        CanalNotificacion canal = new CanalEmail();
        Usuario usuario = new Usuario("Juan", "juan@example.com", "555-1234", null);
        canal.enviarNotificacion("Hola, Juan", usuario);
        assertTrue(true);  // Validar que se ejecuta sin errores
    }

    @Test
    public void testCanalSMS() {
        CanalNotificacion canal = new CanalSMS();
        Usuario usuario = new Usuario("Juan", "juan@example.com", "555-1234", null);
        canal.enviarNotificacion("Hola, Juan", usuario);
        assertTrue(true);  // Validar que se ejecuta sin errores
    }
}
