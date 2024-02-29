package Controlador;

import Modelo.Conexion;
import Modelo.Productos;
import java.util.*;
import java.sql.*;
import javax.swing.*;

public class ProductosDao {
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean RegistrarProducto(Productos pro){
        String sql="INSERT INTO productos(nombre, proveedor, costo, precio,existencia) VALUES(?, ?, ?, ?, ?)";
        try{
            con=cn.getConecction();
            ps = con.prepareStatement(sql);
            //ps.setInt(1, pro.getId_productos());
            ps.setString(1, pro.getNombre());
            ps.setString(2, pro.getproveedor());
            ps.setDouble(3, pro.getCosto());
            ps.setDouble(4, pro.getPrecio());
            ps.setInt(5, pro.getExistencia());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e.toString());
            }
        }
    }
    
    public void ConsultarProveedor(JComboBox proveedor){
        String sql="SELECT nombre_p FROM proveedores";
        try{
            con=cn.getConecction();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                proveedor.addItem(rs.getString("nombre_p"));
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e.toString());
            }
        }
    }
    
    public List listaProductos(){
        List<Productos> Listapro = new ArrayList();
        String sql = "SELECT * FROM productos";
        try{
            con= cn.getConecction();
            ps = con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Productos pro= new Productos();
                pro.setId_productos(rs.getInt("id_productos"));
                pro.setNombre(rs.getString("nombre"));
                pro.setproveedor(rs.getString("proveedor"));
                pro.setCosto(rs.getDouble("costo"));
                pro.setPrecio(rs.getDouble("precio"));
                pro.setExistencia(rs.getInt("existencia"));
                Listapro.add(pro);
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return Listapro;
    }
    
    public boolean EliminarProducto(int id_productos){
        String sql = "DELETE FROM productos WHERE id_productos = ?";
        try{
            con = cn.getConecction();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id_productos);
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e.toString());
            }
        }
        
    }
    
    public boolean ModificarProductos(Productos pro){
        String sql = "UPDATE productos SET nombre = ?, proveedor = ?, costo = ?, precio = ?, existencia = ? WHERE id_productos = ?";
        try{
            con = cn.getConecction();
            ps=con.prepareStatement(sql);
            ps.setString(1, pro.getNombre());
            ps.setString(2, pro.getproveedor());
            ps.setDouble(3, pro.getCosto());
            ps.setDouble(4, pro.getPrecio());
            ps.setInt(5, pro.getExistencia());
            ps.setInt(6, pro.getId_productos());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e.toString());
            }
        }
    }
    
    public Productos BuscarPro(String id_product){
        Productos producto = new Productos();
        String sql = "SELECT * FROM productos WHERE id_productos = ?";
        try{
            con = cn.getConecction();
            ps = con.prepareStatement(sql);
            ps.setString(1, id_product);
            rs = ps.executeQuery();
            if (rs.next()) {
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setExistencia(rs.getInt("existencia"));
                
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return producto;
    }
}
