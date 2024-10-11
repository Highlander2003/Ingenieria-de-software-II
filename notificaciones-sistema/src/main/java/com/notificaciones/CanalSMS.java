package com.notificaciones;

public class CanalSMS implements CanalNotificacion {
    @Override
    public void enviarNotificacion(String mensaje, Usuario usuario) {
        System.out.println("Enviando SMS a " + usuario.getTelefono() + ": " + mensaje);
    }
}
