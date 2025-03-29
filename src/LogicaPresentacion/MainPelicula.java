package LogicaPresentacion;

import LogicaNegocio.Pelicula;

import java.util.Scanner;

public class MainPelicula {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pelicula peli;
        peli = new Pelicula();

        int opcion;
        do {
            imprimirMenu();

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre de la pelicula: ");
                    peli.setNombre(sc.next());

                    System.out.println("Ingrese el director de la pelicula: ");
                    peli.setDirector(sc.next());

                    System.out.println("Ingrese el genero de la pelicula: ");
                    peli.setGenero(sc.next());

                    System.out.println("Ingrese la duracion de la pelicula: ");
                    peli.setDuracion(obtenerDuracion(sc));

                    System.out.println("Ingrese el año de estreno la pelicula: ");
                    peli.setYear(obtenerYear(sc));

                    System.out.println("Ingrese la valoracion de la pelicula: ");
                    peli.setCalificacion(obtenerValoracion(sc));

                    break;
                case 2:
                    System.out.println(peli.info());
                    break;


                case 3:
                    break;
                default:
                    mensajeError(opcion);
                    break;
            }

        } while (opcion != 3);
    }

    private static double obtenerValoracion(Scanner sc) {
        double valoracion;
        boolean esInvalido;
        do {
            valoracion = sc.nextDouble();
            if (valoracion < 0) {
                System.out.println("La valoracion no puede ser negativa, ingrese nuevamente: ");
                esInvalido = true;
            } else if (valoracion > 10) {
                System.out.println("La valoracion no puede ser mayor a 10, ingrese nuevamente: ");
                esInvalido = true;

            } else {
                esInvalido = false;
            }
        } while (esInvalido);
        return valoracion;
    }

    private static int obtenerYear(Scanner sc) { // La primera pelicula se rodo en 1895 en Francia
        int year;
        boolean esInvalido;
        do {
            year = sc.nextInt();
            if (year < 0) {
                System.out.println("El año de estreno no puede ser negativo, ingrese nuevamente: ");
                esInvalido = true;
            } else if (year < 1895) {
                System.out.println("El año de estreno esta fuera de rango, ingrese nuevamente: ");
                esInvalido = true;
            } else if (year <= 2025) {
                esInvalido = false;
            } else {
                esInvalido = true;
                System.out.println("El año de estreno no puede ser mayor a 2025, ingrese nuevamente: ");
            }

        } while (esInvalido);
        return year;
    }

    private static void imprimirMenu() {
        System.out.println("-------- MENU --------");
        System.out.println("1. Ingresar informacion de la pelicula");
        System.out.println("2. Mostrar informacion de la pelicula");
        System.out.println("3. Salir");
    }

    private static int obtenerDuracion(Scanner sc) {
        int duracion;
        do {
            duracion = sc.nextInt();

            if (duracion < 0) {
                System.out.println("La duracion de la pelicula no puede ser negativa, ingrese nuevamente: ");
            } else if (duracion == 0) {
                System.out.println("La duracion de la pelicula no puede ser cero, ingrese nuevamente");
            }

        } while (duracion <= 0);

        return duracion;


    }

    private static void mensajeError(int opcion) {
        if (opcion < 0) {
            System.out.println("La opcion no es valida! Debe ser positiva");
        } else {
            System.out.println("La opcion no es valida! Debe ser diferente de cero o menor que 3");
        }
    }
}

