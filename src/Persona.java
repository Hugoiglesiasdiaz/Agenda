public class Persona {
    private String nombre;
    private String apellidos;
    private String telefono;
    private String correoE;
    

    

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", correoE="
                + correoE + "]";
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCorreoE() {
        return correoE;
    }
    public void setCorreoE(String correoE) {
        this.correoE = correoE;
    }

    
    

}