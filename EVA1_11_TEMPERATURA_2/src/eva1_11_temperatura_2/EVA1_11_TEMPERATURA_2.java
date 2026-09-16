/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_temperatura_2;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_11_TEMPERATURA_2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              double temp,Cel,kel;
      Scanner cap = new Scanner(System.in);
      //SOLICITAR DATOS AL USUARIO
      System.out.println("Introduce la temperatura en fahrenheit");
      temp = cap.nextDouble();
      Cel =(temp - 32) / 1.8;//Celsius
      kel = (temp -32) *5/9 + 273.15;//Kelvin // 5/9 DA 0,5/9.0 DA 0.5
      System.out.println(temp +"gf =" + Cel + "gC");
      System.out.println(temp +"gf =" + kel + "k");
    }
   
}