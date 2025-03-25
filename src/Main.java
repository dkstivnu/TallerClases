import LogicaNegocio.Caja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ///  Creation del objeto de la clase Caja

        Caja caja = new Caja();
        Caja caja2 = new Caja(15,20,10);
        Caja caja3 = new Caja(caja2);

        /// Obtenemos la información del objeto

        System.out.println(caja.informacion());
        System.out.println(caja2.informacion());
        System.out.println(caja3.informacion());






    }
}
