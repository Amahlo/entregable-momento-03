import java.util.Scanner;

public class CombosNovaventa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean catalogo = true;
        int opcion;

        String[] ofertas = new String[5];
        ofertas[0] = "Combo Cuidado Personal";
        ofertas[1] = "Combo Hogar";
        ofertas[2] = "Combo Despensa";
        ofertas[3] = null;
        ofertas[4] = null;

        System.out.println("------ Catalogo de ofertas Novaventa ------");
        do {
            System.out.println("\nEliga una de las siguientes opciones");
            System.out.println("1. Ver ofertas");
            System.out.println("2. Validar cobertura de ofertas");
            System.out.println("3. Registrar nueva oferta");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    listarOfertas(ofertas);
                    break;
                case 2:
                    buscarOferta(input, ofertas);
                    break;
                case 3:
                    agregarOferta(input, ofertas);
                    break;
                case 4:
                    System.out.println("Saliendo del catalogo...");
                    catalogo = false;
                    break;
                default:
                    System.out.println("Opción no valida, ingrese nuevamente una opción valida ");
                    break;
            }

        } while (catalogo);

        input.close();
    }

    public static void listarOfertas(String[] ofertas) {
        for (String oferta : ofertas) {
            if (oferta != null) {
                System.out.println("- " + oferta);
            }

        }
    }

    public static boolean valiadarOferta(String[] ofertas, String nombreOferta) {
        for (String oferta : ofertas) {
            if (oferta != null && oferta.equalsIgnoreCase(nombreOferta)) {
                return true;
            }
        }
        return false;
    }

    public static void buscarOferta(Scanner input, String[] ofertas) {
        input.nextLine();
        System.out.println("Ingrese el nombre de la oferta: ");
        String nombreOferta = input.nextLine();

        if (valiadarOferta(ofertas, nombreOferta)) {
            System.out.println("La oferta " + nombreOferta + " Sí! esta en el catálogo");
        } else {
            System.out.println("La oferta " + nombreOferta + " No! esta en el catalogo");
        }
    }

    public static boolean validarPosicion(String[] ofertas, String nombreOferta) {
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i] == null) {
                ofertas[i] = nombreOferta;
                return true;
            }
        }
        return false;
    }

    public static void agregarOferta(Scanner input, String[] ofertas) {
        input.nextLine();
        System.out.println("Ingrese el nombre de la nueva oferta: ");
        String nombreOferta = input.nextLine();

        if (validarPosicion(ofertas, nombreOferta)) {
            System.out.println("La oferta " + nombreOferta + " fue agregada al catalogo");
        } else {
            System.out.println("El catálogo esta lleno, no es posible guardar más ofertas");
        }
    }
}