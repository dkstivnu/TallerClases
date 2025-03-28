package LogicaPresentacion;

import LogicaNegocio.Caja;

import java.util.Scanner;

public class MainCaja {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float volumen;
        float largo;
        float ancho;
        float alto;

        int opcion;

        Caja caja = new Caja();

        do {
            imprimirMenu();
            System.out.println("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.print("Ingrese el alto: ");
                    alto = sc.nextFloat();
                    caja.setAlto(alto);

                    System.out.print("Ingrese el ancho: ");
                    ancho = sc.nextFloat();
                    caja.setAncho(ancho);

                    System.out.print("Ingrese el largo: ");
                    largo = sc.nextFloat();
                    caja.setLargo(largo);
                }
                break;
                case 2:
                    System.out.print(caja.informacion());
                    break;
                case 3: {
                    volumen = caja.calcVolumen();
                    System.out.println("El volumen de la caja es: " + volumen);
                }
                break;
                case 4:
                    break;
            }
        } while (opcion != 4);

     /*   ///  Creation del objeto de la clase Caja

        Caja caja = new Caja();
        Caja caja2 = new Caja(15, 20, 10);
        Caja caja3 = new Caja(caja2);

        /// Obtenemos la información del objeto

        System.out.println(caja.informacion());
        System.out.println(caja2.informacion());
        System.out.println(caja3.informacion());*/

    }

    public static void imprimirMenu() {
        System.out.println("---------- Menu -----------");
        System.out.println("1. Ingresar datos de la caja");
        System.out.println("2. Mostrar datos de la caja");
        System.out.println("3. Calcular volumen de la caja");
        System.out.println("4. Salir");
    }
}
