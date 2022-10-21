public class Estudiante extends Usuario{
    String codigo;

    public Estudiante(String nombre, String primerApellido, String segundoApellido, String ci, String fechaNacimiento, String direccion, int celular, int telefono, String email, String usuario, String contrasena, String codigo) {
        super(nombre, primerApellido, segundoApellido, ci, fechaNacimiento, direccion, celular, telefono, email, usuario, contrasena);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "codigo='" + codigo + '\'' +
                ", usuario='" + usuario + '\'' +
                ", contrasena='" + contrasena + '\'' +
                '}';
    }
}
