package LogicaPresentacion;

import LogicaNegocio.Cuenta;

import java.util.Scanner;

public class MainCuenta {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();

        int opcion;

        do {
            imprimirMenu();

            System.out.println("Ingrese la opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese el nombre del titular de la cuenta");
                    cuenta.setNombreTitular(sc.next());

                    System.out.println("Ingrese el dinero que hay en la cuenta");
                    cuenta.setDineroCuenta(sc.nextDouble());
                }
                break;
                case 2: {
                    infoCuenta(cuenta);
                }
                break;
                case 3:
                    System.out.println("Ingrese el dinero que quiere depositar en la cuenta:");
                    System.out.println(cuenta.ingresarDinero(sc.nextDouble()));
                    break;
                case 4:
                    System.out.println("Ingresa el dinero que quieres retirar de la cuenta");
                    System.out.println(cuenta.retirarDinero(sc.nextDouble()));
                    break;
                case 5:
                    break;
                default:
                    if (opcion > 5) {
                        System.out.println("La opcion no puede ser mayor que 5");
                    } else {
                        System.out.println("La opcion no puede ser negativa o igual a cero");
                    }
                    break;
            }
        } while (opcion != 5);
    }

    private static void infoCuenta(Cuenta cuenta) {
        System.out.println("-------- INFO. DE LA CUENTA --------");
        System.out.println("Titular de la cuenta: " + cuenta.getNombreTitular());
        System.out.println("Saldo en la cuenta: " + cuenta.getStringDinero());
    }

    private static void imprimirMenu() {
        System.out.println("--------- MENU ---------");
        System.out.println("1. Ingresar informacion de la cuenta");
        System.out.println("2. Mostrar informacion de la cuenta");
        System.out.println("3. Depositar dinero en la cuenta");
        System.out.println("4. Retirar dinero en la cuenta");
        System.out.println("5. Salir");

    }
}
