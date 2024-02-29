package Controlador;

import Modelo.Conexion;
import Modelo.login;
import java.sql.*;


public class LoginDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    public login log(String correo_u, String pass){
        login l = new login();
        String sql = "SELECT * FROM usuarios WHERE correo_u = ? AND pass = ? ";
        try{
            con = cn.getConecction();
            ps = con.prepareStatement(sql);
            ps.setString(1, correo_u);
            ps.setString(2, pass);
            rs= ps.executeQuery();
            if(rs.next()){
                l.setId_usuario(rs.getInt("id_usuario"));
                l.setNombre_u(rs.getString("nombre_u"));
                l.setCorreo_u(rs.getString("correo_u"));
                l.setPass(rs.getString("pass"));
            }
        }catch (SQLException e){
            System.out.println(e.toString());
        }
        return l;
    }
}
