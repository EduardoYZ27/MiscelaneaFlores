package Modelo;

public class Productos {
    private int id_productos;
    private String nombre;
    private String proveedor;
    private double costo;
    private double precio;
    private int existencia;

    public Productos() {
    }

    public Productos(int id_productos, String nombre, String proveedor, double costo, double precio, int existencia) {
        this.id_productos = id_productos;
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.costo = costo;
        this.precio = precio;
        this.existencia = existencia;
    }

    public int getId_productos() {
        return id_productos;
    }

    public void setId_productos(int id_productos) {
        this.id_productos = id_productos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getproveedor() {
        return proveedor;
    }

    public void setproveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    
    
}
