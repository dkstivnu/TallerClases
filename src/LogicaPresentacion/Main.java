package LogicaPresentacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            imprimirMenuClases();

            System.out.println("Elija una opcion del menu: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    MainCaja.main(args);
                    break;
                case 2:
                    MainEstudiante.main(args);
                    break;
                case 3:
                    MainCuenta.main(args);
                    break;
                case 4:
                    MainPelicula.main(args);
                    break;
                case 5:
                    MainPersona.main(args);
                    break;
                case 0:
                    // Un cinco por el trabajo profe :)
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 0);
    }

    private static void imprimirMenuClases() {

        System.out.println("-------- MENU CLASES --------");
        System.out.println("1. Caja");
        System.out.println("2. Estudiante");
        System.out.println("3. Cuenta");
        System.out.println("4. Pelicula");
        System.out.println("5. Persona");
        System.out.println("0. Salir");
    }
}
