package Modelo;

public class Proveedor {
    private int id_proveedor;
    private String nombre_p;
    private String empresa;
    private String telefono;
    private String email;

    public Proveedor() {
    }

    public Proveedor(int id_proveedor, String nombre_p, String empresa, String telefono, String email) {
        this.id_proveedor = id_proveedor;
        this.nombre_p = nombre_p;
        this.empresa = empresa;
        this.telefono = telefono;
        this.email = email;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre_p() {
        return nombre_p;
    }

    public void setNombre_p(String nombre_p) {
        this.nombre_p = nombre_p;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
