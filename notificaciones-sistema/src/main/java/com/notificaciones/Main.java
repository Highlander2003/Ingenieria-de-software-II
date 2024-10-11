package com.notificaciones;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Crear usuario con preferencias
        Usuario usuario = new Usuario("Juan", "juan@example.com", "555-1234", Arrays.asList(new CanalEmail(), new CanalSMS()));

        // Crear notificaciones para diferentes canales
        for (CanalNotificacion canal : usuario.getPreferenciasNotificacion()) {
            canal.enviarNotificacion("Hola, tienes un nuevo mensaje", usuario);
        }
    }
}
