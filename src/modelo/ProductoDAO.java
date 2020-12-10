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

public class ProductoDAO implements CRUD{
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r;
    Producto p =new Producto();
    Calendar cal = Calendar.getInstance();
    String fecha = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MARCH) + 1) + "/" + cal.get(Calendar.YEAR);
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    public Producto listarnombre(String nombre){
        String sql = "select * from entradas where nombre=?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while (rs.next()) {                
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setCantidad(rs.getInt(3));
                p.setPrecio_venta(rs.getDouble(4));
                p.setFecha(rs.getString(5));
                p.setPrecia_entrada(rs.getDouble(6));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        
        return p;
    }
    
    public int actualizarstock(int cant, String nombre){
        String sql = "update entradas set cantidad=? where nombre=?";
        try {
            
            con =  cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, cant);
            ps.setString(2, nombre);
            r = ps.executeUpdate();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        
        return r;
    }
    
    @Override
    public List listar() {
        List<Producto> lista = new ArrayList<>();
        String sql = "select * from entradas";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setCantidad(rs.getInt(3));
                p.setPrecio_venta(rs.getDouble(4));
                p.setFecha(rs.getString(5));
                p.setPrecia_entrada(rs.getDouble(6));
                lista.add(p);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        
        return lista;
    }

    @Override
    public int add(Object[] o) {
        String fechaa = "";
        try {
            Date f = formato.parse(fecha);
            fechaa = formato.format(f);
        } catch (Exception e) {
        }
        listarnombre((String) o[0]);
        int r = 0;
        if(p.getId()!=0){ //&& p.getFecha().equals(fechaa)){ si dice que no importa la fecha
            String sql = "update entradas set cantidad=?, fecha=? where nombre=?";
            try {
            con =  cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, p.getCantidad()+( int ) o[1]);
            ps.setString(2, (String) o[3]);
            ps.setString(3, p.getNombre());
            r = ps.executeUpdate();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: "+e);
            }
        } else{
            String sql = "insert into entradas(nombre,cantidad,precio_venta,fecha,precio_entrada)values(?,?,?,?,?)";
            try {
                con = cn.Conectar();
                ps = con.prepareStatement(sql);
                ps.setObject(1, o[0]);
                ps.setObject(2, o[1]);
                ps.setObject(3, o[2]);
                ps.setObject(4, o[3]);
                ps.setObject(5, o[4]);
                r = ps.executeUpdate();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: "+e);
            }
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "update entradas set nombre=?,cantidad=?,precio_venta=?,fecha=?,precio_entrada=? where id_entrada=?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r = ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql = "delete from entradas where id_entrada=?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
    }
}
