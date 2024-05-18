
import proyecto_tienda_electronica.informes.Informe;
import proyecto_tienda_electronica.productos.Producto;
import proyecto_tienda_electronica.usuarios.Usuario;

import java.util.ArrayList;
import java.util.List;

public class TiendaElectronica {
    private List<Producto> inventario;
    private List<Usuario> usuarios;
    private List<Double> ventas;

    public TiendaElectronica() {
        inventario = new ArrayList<>();
        usuarios = new ArrayList<>();
        ventas = new ArrayList<>();

        // Agregar productos al inventario
        agregarProducto("Camiseta", 10.00);
        agregarProducto("Pantalones", 30.00);
        agregarProducto("Zapatos", 50.00);
        agregarProducto("Chaleco", 25.00);
        agregarProducto("Gorra", 15.00);
        agregarProducto("Bufanda", 12.00);
        agregarProducto("Calcetines", 5.00);
        agregarProducto("Guantes", 8.00);
        agregarProducto("Falda", 20.00);
        agregarProducto("Chaqueta", 40.00);
        agregarProducto("Blusa", 18.00);
        agregarProducto("Sombrero", 7.00);
        agregarProducto("Pantuflas", 9.00);
        agregarProducto("Cinturón", 6.00);
        agregarProducto("Corbata", 11.00);
        agregarProducto("Vestido", 35.00);
        agregarProducto("Traje de baño", 28.00);
        agregarProducto("Collar", 22.00);
        agregarProducto("Pulsera", 14.00);
        agregarProducto("Reloj", 45.00);
    }

    private void agregarProducto(String nombre, double precio) {
        Producto producto = new Producto(nombre, precio, 0);
        inventario.add(producto);
    }

    public void mostrarInventario() {
        System.out.println("\nInventario:");
        for (Producto producto : inventario) {
            System.out.println(producto.getNombre() + " - Precio: $" + producto.getPrecio());
        }
    }

    public void realizarVenta() {
        // Lógica para realizar una venta
    }

    public void generarInformeVentas() {
        Informe informe = new Informe();
        informe.generarInformeVentas();
    }

    public void generarInformeInventario() {
        Informe informe = new Informe();
        informe.generarInformeInventario();
    }
}