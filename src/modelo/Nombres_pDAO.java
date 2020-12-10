package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Nombres_pDAO implements CRUD{
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    Nombres_p nom = new Nombres_p();

    @Override
    public List listar() {
        List<Nombres_p> lista = new ArrayList<>();
        String sql = "select * from nombres_p";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Nombres_p p = new Nombres_p();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                lista.add(p);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        
        return lista;
    }

    @Override
    public int add(Object[] o) {
        listarNombre((String) o[0]);
        int r = 0;
        if(nom.getId() == 0){
            String sql = "insert into nombres_p(nombre)values(?)";
            try {
                con = cn.Conectar();
                ps = con.prepareStatement(sql);
                ps.setObject(1, o[0]);
                r = ps.executeUpdate();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: "+e);
            }
        }
        return r;
    }
    
    public Nombres_p listarNombre(String nombre){
        String sql = "select * from nombres_p where nombre=?";
        
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            
            while(rs.next()){
               nom.setId(rs.getInt(1));
               nom.setNombre(rs.getString(2));
            }
            
        } catch (Exception e) {
            
        }
        
        return nom;
    }

    @Override
    public int actualizar(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
