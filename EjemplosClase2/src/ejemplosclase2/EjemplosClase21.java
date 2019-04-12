package ejemplosclase2;

import java.util.Scanner;

/**
 * @author Fernando
 */
public class EjemplosClase21 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nombre;
        String apellido;

        System.out.println("Por favor, ingresar sus nombres: ");
        nombre = scan.nextLine();
        System.out.println("Por favor, ingresar sus apellidos: ");
        apellido = scan.nextLine();

        System.out.println("Su nombre es: " + nombre + "\n\n\tSu apellido es: "
                + apellido);

    }

}
