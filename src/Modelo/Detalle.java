package Modelo;

public class Detalle {
    private int id_venta;
    private String id_productos;
    private String nombre_producto;
    private int cantidad;
    private double precio_venta;
    private int id_venta_t;

    public Detalle() {
    }

    public Detalle(int id_venta, String id_productos, String nombre_producto, int cantidad, double precio_venta, int id_venta_t) {
        this.id_venta = id_venta;
        this.id_productos = id_productos;
        this.nombre_producto = nombre_producto;
        this.cantidad = cantidad;
        this.precio_venta = precio_venta;
        this.id_venta_t = id_venta_t;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getId_productos() {
        return id_productos;
    }

    public void setId_productos(String id_productos) {
        this.id_productos = id_productos;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public int getId_venta_t() {
        return id_venta_t;
    }

    public void setId_venta_t(int id_venta_t) {
        this.id_venta_t = id_venta_t;
    }
    
    
}
