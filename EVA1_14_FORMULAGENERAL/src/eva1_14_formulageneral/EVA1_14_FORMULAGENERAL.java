/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_formulageneral;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_14_FORMULAGENERAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double a,b,c,x1,x2;
    Scanner cap = new Scanner(System.in);
    //SOLICITAR DATOS AL USUARIO
    System.out.println("Introduce el valor de a");
    a = cap.nextDouble();
     System.out.println("Introduce el valor de b");
    b = cap.nextDouble();
     System.out.println("Introduce el valor de c");
    c = cap.nextDouble();
    x1 = (-b + Math.sqrt(Math.pow(b,2)-4 * a*c))/(2*a);
    x2 = (-b - Math.sqrt(Math.pow(b,2)-4 * a *c))/(2*a);
    System.out.print("Tu Resultado de x1 es:");
    System.out.println(x1);
    System.out.print("Tu Resultado de x2 es:");
    System.out.println(x2);
    }
    
  }
