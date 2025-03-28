package LogicaPresentacion;

import LogicaNegocio.Persona;

import java.util.Scanner;

public class MainPersona {

    public static void main(String[] args) {

        Persona persona = new Persona();
        Scanner sc = new Scanner(System.in);

        imprimirMenu();

        int opcion;


        do {
            imprimirMenu();
            System.out.println("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre: ");
                    persona.setNombre(sc.nextLine());

                    System.out.println("Ingrese el apellido: ");
                    persona.setApellido(sc.nextLine());

                    System.out.println("Ingrese el edad: ");
                    persona.setEdad(sc.nextInt());

                    System.out.println("Ingrese el sexo: ");
                    persona.setSexo(sc.nextLine());

                    System.out.println("Ingrese el identificacion: ");
                    persona.setID(sc.nextLong());

                    break;
                case 2:
                    System.out.print(persona.getInformacion());
                    break;
                case 3:
                    System.out.println(persona.esMayor());
                    break;
                case 4:
                    break;
            }
        } while (opcion != 4);

    }

    private static void imprimirMenu() {
        System.out.println("---------- Menu -----------");
        System.out.println("1. Ingresar los datos de la persona");
        System.out.println("2. Mostrar los datos personales");
        System.out.println("3. La persona es mayor de edad?");
        System.out.println("4. Salir");

    }
}
