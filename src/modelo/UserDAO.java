package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
    PreparedStatement ps;
    ResultSet rs;
    
    Conexion acceso=new Conexion();
    java.sql.Connection con;
    
    public User ValidarVendedor(String user, String password){
        User eu = new User();
        String sql = "select * from users where user=? and password=?";
        try {
            con=acceso.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, password);
            rs=ps.executeQuery();
            while (rs.next()) {
                eu.setId_user(rs.getInt(1));
                eu.setUser(rs.getString(2));
                eu.setPassword(rs.getString(3));
            }
        } catch (Exception e) {
        }
        return eu;
    }
}
