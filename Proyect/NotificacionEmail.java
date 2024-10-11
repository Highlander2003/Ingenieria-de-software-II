// NotificacionEmail.java
public class NotificacionEmail extends Notificacion {
    private Usuario usuario;

    public NotificacionEmail(String mensaje, Usuario usuario) {
        super(mensaje);
        this.usuario = usuario;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Notificación por Email: " + mensaje);
    }
}
