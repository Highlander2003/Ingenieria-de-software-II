package com.notificaciones;

public class NotificacionSMS extends Notificacion {
    private Usuario usuario;

    public NotificacionSMS(String mensaje, Usuario usuario) {
        super(mensaje);
        this.usuario = usuario;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Notificación por SMS: " + mensaje);
    }
}
