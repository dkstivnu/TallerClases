package LogicaPresentacion;

import LogicaNegocio.Caja;

import java.util.Scanner;

public class MainCaja {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float volumen;
        int opcion;

        Caja caja = new Caja();

        do {
            imprimirMenu();
            System.out.println("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.print("Ingrese el alto: ");
                    caja.setAlto(obtenerEntrada(sc));

                    System.out.print("Ingrese el ancho: ");
                    caja.setAncho(obtenerEntrada(sc));

                    System.out.print("Ingrese el largo: ");
                    caja.setLargo(obtenerEntrada(sc));
                }
                break;
                case 2:
                    System.out.println(caja.informacion());
                    break;
                case 3: {
                    volumen = caja.calcVolumen();
                    System.out.println("El volumen de la caja es: " + volumen);
                }
                break;
                case 4:
                    break;
                default:
                    mensajeError(opcion);
            }
        } while (opcion != 4);

     /*   ///  Creation del objeto de la clase Caja

        Caja caja = new Caja();
        Caja caja2 = new Caja(15, 20, 10);
        Caja caja3 = new Caja(caja2);

        /// Obtenemos la información del objeto

        System.out.println(caja.informacion());
        System.out.println(caja2.informacion());
        System.out.println(caja3.informacion());
        */

    }

    private static void mensajeError(int opcion) {
        if (opcion < 0) {
            System.out.println("La entrada no es valida! Debe ser positiva");
        } else {
            System.out.println("La entrada no es valida! Debe ser diferente de cero o menor que 4");
        }
    }

    private static float obtenerEntrada(Scanner sc) {
        float entrada;
        do {
            entrada = sc.nextFloat();

            if (entrada < 0.0) {
                System.out.println("La entrada no puede ser negativa, ingrese nuevamente: ");
            } else if (entrada == 0.0) {
                System.out.println("La entrada no puede ser cero, ingrese nuevamente: ");
            }
        } while (entrada <= 0.0);
        return entrada;
    }

    public static void imprimirMenu() {
        System.out.println("---------- Menu -----------");
        System.out.println("1. Ingresar datos de la caja");
        System.out.println("2. Mostrar datos de la caja");
        System.out.println("3. Calcular volumen de la caja");
        System.out.println("4. Salir");
    }
}
