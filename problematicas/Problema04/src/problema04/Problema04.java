/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// salida = 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 - 1/15
package problema04;

/**
 *
 * @author LAB.ELECT
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limite = 15;
        int numerador = 1;
        int denominador = 1;
        String signo;
        String cadena = "";
        
        do { 
            if (denominador % 2 == 0) {
                signo = "-";
            } else {
                signo = "+";
            }
            
            cadena = String.format("%s%s%d/%d ", 
                    cadena,
                    signo,
                    numerador, 
                    denominador);
            denominador = denominador + 2;

        } while (denominador <= limite);

        System.out.println(cadena);
    }
    
}
