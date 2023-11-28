/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String posicion;
        int edad;
        double estatura;
        int contador = 0;
        int suma_edad = 0;
        double suma_estatura = 0;
        double promedio_edad;
        double promedio_estatura;
        String salida;
        String cadenaA = "Listado de jugadores\n";
        String cadenaB = "Listado de edades\n";
        boolean bandera = true;

        do {
            System.out.println("Ingrese el nombre del Jugador: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo: ");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del Jugador: ");
            estatura = entrada.nextDouble();

            entrada.nextLine();
            suma_edad = suma_edad + edad;
            suma_estatura = suma_estatura + estatura;
            contador = contador + 1;

            cadenaA = String.format("%s%d. %s -%s-, edad %d, estatura "
                    + "%.2f\n",
                    cadenaA,
                    contador,
                    nombre,
                    posicion,
                    edad,
                    estatura);
            cadenaB = String.format("%s%d\n",
                    cadenaB,
                    edad);
            System.out.println("Ingrese (r) para terminar de ingresar datos"
            );
            salida = entrada.nextLine();
            if (salida.equals("r")) {
                bandera = false;
            }
            
        } while (bandera); 
         
        promedio_edad = (double) suma_edad / contador;
        promedio_estatura = suma_estatura / contador;
        System.out.printf("%s%sPromedio de edades: %.1f\nPromedio de "
                + "estaturas: %.2f\n",
                cadenaA,
                cadenaB,
                promedio_edad,
                promedio_estatura);

    }
    
}
