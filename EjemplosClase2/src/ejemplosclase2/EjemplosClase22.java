package ejemplosclase2;

import java.util.Scanner;

/**
 * @author Fernando
 */
public class EjemplosClase22 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nombre;
        String apellido;
        String ciudad;

        int edad;

        System.out.println("Por favor, ingresar sus nombres: ");
        nombre = scan.nextLine();

        System.out.println("Por favor, ingresar sus apellidos: ");
        apellido = scan.nextLine();

        System.out.println("Por favor, ingresar su edad: ");
        edad = scan.nextInt();
        scan.nextLine(); // Limpieza del buffer de entrada de datos

        System.out.println("Por favor, ingresar su ciudad: ");
        ciudad = scan.nextLine();

        System.out.println("Su nombre es: " + nombre + "\n\n\tSu apellido es: "
                + apellido + ", edad:  " + edad + "\nCiudad: " + ciudad);

    }

}
