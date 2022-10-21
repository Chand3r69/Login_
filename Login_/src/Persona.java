
import java.util.Date;

public class Persona {
    String  nombre;
    String primerApellido;
    String segundoApellido;
    String ci;
    String  fechaNacimiento;
    String direccion;
    int celular;
    int telefono;
    String email;

    public Persona(){

    }

    public Persona(String nombre, String primerApellido, String segundoApellido, String ci, String fechaNacimiento, String direccion, int celular, int telefono, String email) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.ci = ci;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.celular = celular;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", ci='" + ci + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", direccion='" + direccion + '\'' +
                ", celular=" + celular +
                ", telefono=" + telefono +
                ", email='" + email + '\'' +
                '}';
    }
}






