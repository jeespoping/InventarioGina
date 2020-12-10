package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EfectivoDAO implements CRUD{
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    Efectivo e = new Efectivo();

    @Override
    public List listar() {
        List<Efectivo> lista = new ArrayList<>();
        String sql = "select * from efectivo";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Efectivo e = new Efectivo();
                e.setId(rs.getInt(1));
                e.setTitulo(rs.getString(2));
                e.setGasto(rs.getDouble(3));
                e.setEntrada(rs.getDouble(4));
                e.setFecha(rs.getString(5));
                lista.add(e);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        
        return lista;
    }

    @Override
    public int add(Object[] o) {
        String sql = "insert into efectivo(titulo,gasto,entrada,fecha)values(?,?,?,?)";
        int r = 0;
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r = ps.executeUpdate();            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        return r;
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
