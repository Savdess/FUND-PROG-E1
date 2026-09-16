/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_temperatura_3;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_12_TEMPERATURA_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      double temp,far,Cel;
      Scanner cap = new Scanner(System.in);
      //SOLICITAR DATOS AL USUARIO
      System.out.println("Introduce la temperatura en Kelvin");
      temp = cap.nextDouble();
      Cel = (temp - 273.15);
      far = (temp -273.15) *9/5 + 32;
      System.out.println(temp +"gk =" + Cel + "gC");
      System.out.println(temp +"gk =" + far + "gF");
    }
    
}
