package com.notificaciones;

public class CanalEmail implements CanalNotificacion {
    @Override
    public void enviarNotificacion(String mensaje, Usuario usuario) {
        System.out.println("Enviando email a " + usuario.getEmail() + ": " + mensaje);
    }
}
