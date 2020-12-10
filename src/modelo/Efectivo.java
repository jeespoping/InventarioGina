package modelo;

public class Efectivo {
    int id;
    double gasto;
    double entrada;
    String titulo;
    String fecha;
    public Efectivo(){
        
    }

    public Efectivo(int id, double gasto, double entrada, String titulo, String fecha) {
        this.id = id;
        this.gasto = gasto;
        this.entrada = entrada;
        this.titulo = titulo;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }  

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGasto() {
        return gasto;
    }

    public void setGasto(double gasto) {
        this.gasto = gasto;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }
    
    
}
