package ejeercicioclase;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class MiEjercicio {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nombres;
        String apellidos;
        String ciudad;
        String pais;

        int edad;

        double nota1;
        double nota2;
        double promedio;

        System.out.println("Ingrese sus nombres: ");
        nombres = scan.nextLine();

        System.out.println("Ingrese sus apellidos: ");
        apellidos = scan.nextLine();

        System.out.println("Ingrese su edad: ");
        edad = scan.nextInt();
        scan.nextLine(); // Limpieza del buffer de entrada de datos

        System.out.println("Ingrese la ciudad: ");
        ciudad = scan.nextLine();

        System.out.println("Ingrese el País");
        pais = scan.nextLine();

        System.out.println("Ingrese sus notas: ");
        System.out.println("Nota 1: ");
        nota1 = scan.nextDouble();
        System.out.println("Nota 2: ");
        nota2 = scan.nextDouble();

        // Proceso para calcular promedio
        //Salida de Datos
        promedio = ((nota1 + nota2) / 2);

        System.out.printf("Sus nombres y apellidos: %s %s\nEdad: %s\nCiudad: %s"
                + "\nPais %s\nNotas: %s, %s\nPromedio: %s ", nombres, apellidos,
                edad, ciudad, pais, nota1, nota2, promedio);

    }

}
