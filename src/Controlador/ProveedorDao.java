package Controlador;

import Modelo.Conexion;
import Modelo.Proveedor;
import java.util.*;
import java.sql.*;

public class ProveedorDao {
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean RegistrarProveedor(Proveedor pr){
        String sql="INSERT INTO proveedores(nombre_p, empresa, telefono, email) VALUES(?, ?, ?, ?)";
        try{
            con=cn.getConecction();
            ps = con.prepareStatement(sql);
            ps.setInt(1, 0);
            ps.setString(1, pr.getNombre_p());
            ps.setString(2, pr.getEmpresa());
            ps.setString(3, pr.getTelefono());
            ps.setString(4, pr.getEmail());
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
    
    public List listaProveedor(){
        List<Proveedor> Listapr = new ArrayList();
        String sql = "SELECT * FROM proveedores";
        try{
            con= cn.getConecction();
            ps = con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Proveedor pr= new Proveedor();
                pr.setId_proveedor(rs.getInt("id_proveedor"));
                pr.setNombre_p(rs.getString("nombre_p"));
                pr.setEmpresa(rs.getString("empresa"));
                pr.setTelefono(rs.getString("telefono"));
                pr.setEmail(rs.getString("email"));
                Listapr.add(pr);
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return Listapr;
    }
    
    public boolean EliminarProveedor(int id_proveedor){
        String sql = "DELETE FROM proveedores WHERE id_proveedor = ?";
        try{
            con = cn.getConecction();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id_proveedor);
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
    
    public boolean ModificarProveedor(Proveedor pr){
        String sql = "UPDATE proveedores SET nombre_p = ?, empresa = ?, telefono = ?, email = ? WHERE id_proveedor = ?";
        try{
            con = cn.getConecction();
            ps=con.prepareStatement(sql);
            ps.setString(1, pr.getNombre_p());
            ps.setString(2, pr.getEmpresa());
            ps.setString(3, pr.getTelefono());
            ps.setString(4, pr.getEmail());
            ps.setInt(5, pr.getId_proveedor());
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
}
