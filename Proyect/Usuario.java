// Usuario.java
import java.util.List;

public class Usuario {
    private String nombre;
    private String email;
    private String telefono;
    private List <CanalNotificacion> preferenciasNotificacion;

    public Usuario(String nombre, String email, String telefono, List<CanalNotificacion> preferencias) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.preferenciasNotificacion = preferencias;
    }

    public List<CanalNotificacion> getPreferenciasNotificacion() {
        return preferenciasNotificacion;
    }
}
