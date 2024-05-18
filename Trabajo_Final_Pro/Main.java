package Trabajo_Final_Pro;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            TiendaElectronica tienda = new TiendaElectronica();

            while (true) {
                System.out.println("\nMenú Principal:");
                System.out.println("1. Ver Inventario");
                System.out.println("2. Realizar Venta");
                System.out.println("3. Generar Informe de Ventas");
                System.out.println("4. Generar Informe de Inventario");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        tienda.mostrarInventario();
                        break;
                    case 2:
                        tienda.realizarVenta();
                        break;
                    case 3:
                        tienda.generarInformeVentas();
                        break;
                    case 4:
                        tienda.generarInformeInventario();
                        break;
                    case 5:
                        System.out.println("Saliendo del sistema...");
                        return;
                    default:
                        System.out.println("Opción no válida. Inténtelo de nuevo.");
                }
            }
        }
    }
