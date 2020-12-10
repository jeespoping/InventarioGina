package modelo;

public class Salida {
    int id_salida;
    int id_entrada;
    String nombre;
    int cantidad;
    double precio;
    String fecha;
    double total;
    double precioe;

    public Salida() {
    }

    public Salida(int id_salida, int id_entrada, String nombre, int cantidad, double precio, String fecha, double total, double precioe) {
        this.id_salida = id_salida;
        this.id_entrada = id_entrada;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.fecha = fecha;
        this.total = total;
        this.precioe = precioe;
    }

    public int getId_salida() {
        return id_salida;
    }

    public void setId_salida(int id_salida) {
        this.id_salida = id_salida;
    }

    public int getId_entrada() {
        return id_entrada;
    }

    public void setId_entrada(int id_entrada) {
        this.id_entrada = id_entrada;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getPrecioe() {
        return precioe;
    }

    public void setPrecioe(double precioe) {
        this.precioe = precioe;
    }   
    
}
