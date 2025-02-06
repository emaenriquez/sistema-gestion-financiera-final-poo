package Entidad;

public class Cliente {
    private static int contadorId = 0;
    public String nombre;
    public int idCliente;
    public String direccion;
    public int telefono;
    public String correo;

    public Cliente() {
    }

    public Cliente(String nombre, String direccion, int telefono, String correo) {
        this.nombre = nombre;
        this.idCliente = generadorIdUnico();
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Cliente.contadorId = contadorId;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    private int generadorIdUnico(){
        return ++contadorId;
    }
}
