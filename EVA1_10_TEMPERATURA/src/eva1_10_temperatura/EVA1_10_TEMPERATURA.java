/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_temperatura;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_10_TEMPERATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      double temp,far,kel;
      Scanner cap = new Scanner(System.in);
      //SOLICITAR DATOS AL USUARIO
      System.out.println("Introduce la temperatura");
      temp = cap.nextDouble();
      far =(temp * 1.8) + 32;//fahrenheit
      kel = temp + 273.15;//Kelvin
      System.out.println(temp +"gC =" + far + "gf");
      System.out.println(temp +"gC =" + kel + "k");
    }
    
}
