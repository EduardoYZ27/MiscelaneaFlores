package Modelo;

public class Ventas_t {
    private int id_venta_t;
    private String vendedor;
    private double total;
    private String fecha;   

    public Ventas_t() {
    }

    public Ventas_t(int id_venta_t, String vendedor, double total,String fecha) {
        this.id_venta_t = id_venta_t;
        this.vendedor = vendedor;
        this.total = total;
        this.fecha = fecha;
    }

    public int getId_venta_t() {
        return id_venta_t;
    }

    public void setId_venta_t(int id_venta_t) {
        this.id_venta_t = id_venta_t;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}