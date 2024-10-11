// CanalPush.java
public class CanalPush implements CanalNotificacion {
    @Override
    public void enviarNotificacion(String mensaje, Usuario usuario) {
        System.out.println("Enviando notificación Push a " + usuario.getNombre() + ": " + mensaje);
    }
}
