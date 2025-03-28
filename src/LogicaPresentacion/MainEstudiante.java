package LogicaPresentacion;

import LogicaNegocio.Estudiante;

import java.util.Scanner;

public class MainEstudiante {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Estudiante estudiante = new Estudiante();

        int opcion;


        do {
            imprimirMenu();
            System.out.println("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.print("Ingrese la primera nota: ");
                    estudiante.setNotaExam1(sc.nextDouble());

                    System.out.print("Ingrese la segunda nota: ");
                    estudiante.setNotaExam2(sc.nextDouble());

                    System.out.print("Ingrese la terca nota: ");
                    estudiante.setNotaExam3(sc.nextDouble());
                }
                break;
                case 2:
                    System.out.print(estudiante.getInformacion());
                    break;
                case 3:
                    System.out.println("La nota final del estudiante es: "+ estudiante.calcNotaFinal());
                    break;
                case 4:
                    break;
            }
        } while (opcion != 4);


    }

    private static void imprimirMenu() {
        System.out.println("---------- Menu -----------");
        System.out.println("1. Ingresar el valor de las notas");
        System.out.println("2. Mostrar las notas");
        System.out.println("3. Calcular nota final");
        System.out.println("4. Salir");

    }
}
