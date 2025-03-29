package LogicaPresentacion;

import LogicaNegocio.Persona;

import java.util.Scanner;

public class MainPersona {

    public static void main(String[] args) {

        Persona persona = new Persona();
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            imprimirMenu();
            System.out.println("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre: ");
                    persona.setNombre(sc.next());

                    System.out.println("Ingrese el apellido: ");
                    persona.setApellido(sc.next());

                    System.out.println("Ingrese el edad: ");
                    persona.setEdad(obtenerEdad(sc));

                    System.out.println("Ingrese el sexo (Masculino/Feminino o M/F): ");
                    persona.setSexo(obtenerSexo(sc));

                    System.out.println("Ingrese el identificacion: ");
                    persona.setID(sc.nextLong());

                    break;
                case 2:
                    System.out.println(persona.getInformacion());
                    break;
                case 3:
                    System.out.println(persona.esMayor());
                    break;
                case 4:
                    break;
            }
        } while (opcion != 4);

    }

    private static String obtenerSexo(Scanner sc) {
        String sexo;
        boolean esInvalido;
        do {
            sexo = sc.next();

            switch (sexo) {
                case "Masculino", "Feminino": {
                    esInvalido = false;
                }
                break;
                case "M": {
                    sexo = "Masculino";
                    esInvalido = false;
                    break;
                }
                case "F": {
                    sexo = "Femenino";
                    esInvalido = false;
                    break;
                }
                default: {
                    esInvalido = true;
                    System.out.println("El sexo no es valido, ingrese con cuidado nuevamente:");
                }
                break;
            }

        } while (esInvalido);
        return sexo;
    }

    private static int obtenerEdad(Scanner sc) {
        int edad;
        boolean esInvalido;
        do {
            edad = sc.nextInt();

            if (edad < 0) {
                System.out.println("La edad no puede ser negativa, ingrese nuevamente:");
                esInvalido = true;
            } else if (edad > 120) {
                System.out.println("La edad ingresada es demasiado grande, ingrese una edad valida:");
                esInvalido = true;
            } else if (edad == 0) {
                System.out.println("La edad no puede ser igual a cero, ingrese nuevamente:");
                esInvalido = true;
            } else {
                esInvalido = false;
            }

        } while (esInvalido);
        return edad;
    }

    private static void imprimirMenu() {
        System.out.println("---------- Menu -----------");
        System.out.println("1. Ingresar los datos de la persona");
        System.out.println("2. Mostrar los datos personales");
        System.out.println("3. La persona es mayor de edad?");
        System.out.println("4. Salir");

    }
}
