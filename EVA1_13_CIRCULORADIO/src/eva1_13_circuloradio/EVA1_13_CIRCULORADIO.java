/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_circuloradio;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_13_CIRCULORADIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double Per,area,vol,rad;
      Scanner cap = new Scanner(System.in);
      //SOLICITAR DATOS AL USUARIO
      System.out.println("Introduce el radio");
      rad = cap.nextDouble();
      Per = (Per= 2*3.1415*rad);
      area = (area = 3.1415*Math.pow(rad,2));
        vol = (vol = (4.0/3.0) * 3.1415 *Math.pow(rad,3));
     System.out.print("Tu perimetro es:");
        System.out.println(Per);
        System.out.print("Tu area es:");
      System.out.println(area);
      System.out.print("Tu volumen es:");
      System.out.println(vol);
    }
    
}
