package Controlador;

import Modelo.*;
import java.sql.*;
import java.util.*;


public class Ventas_tDao {
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r;  
    
    public int idVenta(){
        int id=0;
        String sql = "SELECT MAX(id_venta_t) FROM ventas_t";
        try{
            con=cn.getConecction();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                id=rs.getInt(1);
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return id;
    }
    
    public int RegistrarVenta(Ventas_t v){
        String sql = "INSERT INTO ventas_t (vendedor ,total) VALUES (?, ?)";
        try{
            con=cn.getConecction();
            ps = con.prepareStatement(sql);
            ps.setString(1, v.getVendedor());
            ps.setDouble(2, v.getTotal());
            //ps.setString(3, v.getFecha());
            ps.execute();
        }catch(SQLException e){
            System.out.println(e.toString());
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e.toString());
            }
        }
        return r;
    }
    
    public int DetalleVenta (Detalle dv){
        String sql = "INSERT INTO ventas (id_productos ,nombre_producto, cantidad, precio_venta,id_venta_t) VALUES (?, ?, ?, ?, ?)";
        try{
            con=cn.getConecction();
            ps = con.prepareStatement(sql);
            ps.setString(1, dv.getId_productos());
            ps.setString(2, dv.getNombre_producto());
            ps.setInt(3, dv.getCantidad());
            ps.setDouble(4, dv.getPrecio_venta());
            ps.setInt(5, dv.getId_venta_t());
            ps.execute();
        }catch(SQLException e){
            System.out.println(e.toString());
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e.toString());
            }
        }
        return r;
    }
    
    public boolean ActualizarStock(int cantidad,String id_producto){
        String sql = "UPDATE productos SET existencia = ? WHERE id_productos = ?";
        try{
            con = cn.getConecction();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cantidad);
            ps.setString(2, id_producto);
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
    }
    
    public List listaVentas_t(){
        List<Ventas_t> ListaVenta_t = new ArrayList();
        String sql = "SELECT * FROM ventas_t";
        try{
            con= cn.getConecction();
            ps = con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Ventas_t ven_t= new Ventas_t();
                ven_t.setId_venta_t(rs.getInt("id_venta_t"));
                ven_t.setVendedor(rs.getString("vendedor"));
                ven_t.setTotal(rs.getDouble("total"));
                ListaVenta_t.add(ven_t);
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return ListaVenta_t;
    }
    
}
