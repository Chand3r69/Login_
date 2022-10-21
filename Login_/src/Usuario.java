import java.util.Date;

public class Usuario extends Persona{
    String usuario;
    String contrasena;

    public Usuario(String nombre, String primerApellido, String segundoApellido, String ci, String fechaNacimiento, String direccion, int celular, int telefono, String email, String usuario, String contrasena) {
        super(nombre, primerApellido, segundoApellido, ci, fechaNacimiento, direccion, celular, telefono, email);
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "usuario='" + usuario + '\'' +
                ", contrasena='" + contrasena + '\'' +
                '}';
    }
}