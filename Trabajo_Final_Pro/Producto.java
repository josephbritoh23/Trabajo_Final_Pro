package Trabajo_Final_Pro;
public class Producto {
    private String nombre;
    private double precio;
    private int cantidadStock;

    public Producto(String nombre, double precio, int cantidadStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void actualizarStock(int cantidad) {
        cantidadStock += cantidad;
    }
}