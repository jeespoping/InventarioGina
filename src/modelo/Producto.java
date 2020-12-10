
package modelo;

public class Producto {
    int id;
    String nombre;
    int cantidad;
    double precio_venta;
    String fecha;
    double precia_entrada;
    public Producto() {
        
    }

    public Producto(int id, String nombre, int cantidad, double precio_venta, String fecha, double precia_entrada) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio_venta = precio_venta;
        this.fecha = fecha;
        this.precia_entrada = precia_entrada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecia_entrada() {
        return precia_entrada;
    }

    public void setPrecia_entrada(double precia_entrada) {
        this.precia_entrada = precia_entrada;
    }  
  
}
