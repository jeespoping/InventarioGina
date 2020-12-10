package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class SalidaDAO implements CRUD{
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    Salida sa = new Salida();
    
    Calendar cal = Calendar.getInstance();
    String fecha = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MARCH) + 1) + "/" + cal.get(Calendar.YEAR);
    
    
    
    int r = 0;
    
    public int guardarsalida(Salida s){
        listarSalida(s.getNombre(),s.getPrecio());
        if(sa.getId_salida() != 0 && sa.getFecha().equals(fecha) && s.getPrecio()==sa.getPrecio()){
            String sql = "update salidas set cantidad=?,total=? where nombre=? and precio=?";
            try {
            con =  cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, sa.getCantidad()+s.getCantidad());
            ps.setDouble(2, sa.getTotal()+s.getTotal());
            ps.setString(3, s.getNombre());
            ps.setDouble(4, s.getPrecio());
            r = ps.executeUpdate();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: "+e);
            }

            return r;
        }else{
            String sql = "insert into salidas(id_entrada,Nombre,cantidad,precio,fecha,total,precioe)values(?,?,?,?,?,?,?)";
            try {
                con = cn.Conectar();
                ps = con.prepareStatement(sql);
                ps.setInt(1, s.id_entrada);
                ps.setString(2, s.nombre);
                ps.setInt(3, s.cantidad);
                ps.setDouble(4, s.precio);
                ps.setString(5, s.fecha);
                ps.setDouble(6, s.total);
                ps.setDouble(7, s.precioe);
                r = ps.executeUpdate();
            } catch (Exception e) {
                System.err.println("Error: "+e);
            }
            return r;
        }
    }
    
    public Salida listarSalida(String nombre, double precio){
        String sql = "select * from salidas where nombre=? and precio=? order by id_salida desc";
        
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setDouble(2, precio);
            rs = ps.executeQuery();
            
            while(rs.next()){
               sa.setId_salida(rs.getInt(1));
               sa.setCantidad(rs.getInt(4));
               sa.setPrecio(rs.getDouble(5));
               sa.setFecha(rs.getString(6));
               sa.setTotal(rs.getDouble(7));
            }
            
        } catch (Exception e) {
            
        }
        
        return sa;
    }

    @Override
    public int add(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizar(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(int id) {
        String sql = "delete from salidas where id_salida=?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
    }
    
    public void vaciar(){
        String sql = "delete from salidas ";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
    }

    @Override
    public List listar() {
        List<Salida> lista = new ArrayList<>();
        String sql = "select * from salidas order by id_salida desc";
        
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
               Salida s = new Salida();
               s.setId_salida(rs.getInt(1));
               s.setId_entrada(rs.getInt(2));
               s.setNombre(rs.getString(3));
               s.setCantidad(rs.getInt(4));
               s.setPrecio(rs.getDouble(5));
               s.setFecha(rs.getString(6));
               s.setTotal(rs.getDouble(7));
               s.setPrecioe(rs.getDouble(8));
               lista.add(s);
            }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        
        return lista;
    }
    
}
