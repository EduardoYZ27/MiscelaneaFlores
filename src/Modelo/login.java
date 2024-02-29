package Modelo;

public class login {
    private int id_usuario;
    private String nombre_u;
    private String correo_u;
    private String pass;

    public login() {
    }

    public login(int id_usuario, String nombre_u, String correo_u, String pass) {
        this.id_usuario = id_usuario;
        this.nombre_u = nombre_u;
        this.correo_u = correo_u;
        this.pass = pass;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_u() {
        return nombre_u;
    }

    public void setNombre_u(String nombre_u) {
        this.nombre_u = nombre_u;
    }

    public String getCorreo_u() {
        return correo_u;
    }

    public void setCorreo_u(String correo_u) {
        this.correo_u = correo_u;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
}
