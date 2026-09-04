import java.util.Scanner;

public class RegistroNoel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean menu = true;
        int opcion;

        String[] productos = new String[5];
        productos[0] = "Ducales";
        productos[1] = "Festival";
        productos[2] = "Tosh";
        productos[3] = null;
        productos[4] = null;

        System.out.println("------Menú de búsquedad y registro de produtos Noel------");
        do {
            System.out.println("\nEliga una de las siguientes opciones");
            System.out.println("1. Listar productos");
            System.out.println("2. Buscar productos");
            System.out.println("3. Agregar producto");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    listarProductos(productos);
                    break;
                case 2:
                    buscarProducto(input, productos);
                    break;
                case 3:
                    agregarProducto(input, productos);
                    break;
                case 4:
                    System.out.println("Saliendo del ménu...");
                    menu = false;
                    break;
                default:
                    System.out.println("Opción no valida ingrese nuevamente una opción valida");
                    break;
            }

        } while (menu);

        input.close();
    }

    public static void listarProductos(String[] productos) {
        for (String producto : productos) {
            if (producto != null) {
                System.out.println("- " + producto);
            }
        }
    }

    public static boolean validarProducto(String[] productos, String nombreProducto) {
        for (String producto : productos) {
            if (producto != null && producto.equalsIgnoreCase(nombreProducto)) {
                return true;
            }
        }
        return false;
    }

    public static void buscarProducto(Scanner input, String[] productos) {
        input.nextLine();
        System.out.println("Ingrese el nombre del producto: ");
        String nombreProducto = input.nextLine();

        if (validarProducto(productos, nombreProducto)) {
            System.out.println("El producto " + nombreProducto + " Sí! esta en el inventario");
        } else {
            System.out.println("El producto " + nombreProducto + " No! esta en el inventario");
        }
    }

    public static boolean validarPosicion(String[] productos, String nombreProducto) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] == null) {
                productos[i] = nombreProducto;
                return true;
            }
        }
        return false;
    }

    public static void agregarProducto(Scanner input, String[] productos) {
        input.nextLine();
        System.out.println("Ingrese el nombre del nuevo producto: ");
        String nombreProducto = input.nextLine();

        if (validarPosicion(productos, nombreProducto)) {
            System.out.println("El producto " + nombreProducto + " fue agregado");
        } else {
            System.out.println("El inventario esta lleno, no es posible guardar más productos");
        }
    }
}