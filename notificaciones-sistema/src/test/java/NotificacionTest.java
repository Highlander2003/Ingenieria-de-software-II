package com.notificaciones;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NotificacionTest {

    @Test
    public void testCrearNotificacionEmail() {
        Usuario usuario = new Usuario("Juan", "juan@example.com", "555-1234", null);
        Notificacion notificacion = NotificationFactory.crearNotificacion("Email", "Hola, Juan", usuario);
        assertEquals(NotificacionEmail.class, notificacion.getClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCrearNotificacionInvalida() {
        Usuario usuario = new Usuario("Juan", "juan@example.com", "555-1234", null);
        NotificationFactory.crearNotificacion("WhatsApp", "Hola, Juan", usuario);
    }
}
