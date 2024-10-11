// NotificationFactory.java
public class NotificationFactory {
    public static Notificacion crearNotificacion(String canal, String mensaje, Usuario usuario) {
        switch (canal) {
            case "Email":
                return new NotificacionEmail(mensaje, usuario);
            case "SMS":
                return new NotificacionSMS(mensaje, usuario);
            default:
                throw new IllegalArgumentException("Canal no soportado.");
        }
    }
}
