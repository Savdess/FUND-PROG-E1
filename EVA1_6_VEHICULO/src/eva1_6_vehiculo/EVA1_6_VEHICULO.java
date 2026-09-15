/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_vehiculo;
import java.util.*;
import java.lang.Math;
/**
 *
 * @author bisonte
 */
public class EVA1_6_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       
// TODO code application logic here
        String MARCA;
        String MODELO;
        int YEAR;
        String COLOR;
        int kILOMETRAJE;
        double PRECIO;
     Scanner AUTO_D = new Scanner(System.in);
        System.out.println("Que marca es tu auto?");
        MARCA = AUTO_D.nextLine();
        System.out.println("Que modelo es tu auto?");
        MODELO = AUTO_D.nextLine();
        System.out.println("De que year es tu carro?");
        YEAR = AUTO_D.nextInt();
        AUTO_D.nextLine();
        System.out.println("De que color es tu auto?");
       COLOR= AUTO_D.nextLine();
        System.out.println("Cuanto kilometraje tiene hasta el momento?");
        kILOMETRAJE = AUTO_D.nextInt();
        System.out.println("Cuanto cuesta tu auto?");
        PRECIO = AUTO_D.nextDouble();
        System.out.println("PERFECTO!! TU AUTO TIENE:");
        System.out.print("La marca es:");
        System.out.println(MARCA);
        System.out.print("El modelo es:");
        System.out.println(MODELO);
        System.out.print("El year es: ");
        System.out.println(YEAR);
        System.out.print("El color del auto es: ");
        System.out.println(COLOR);
        System.out.print("El kilometraje actual del auto es: ");
        System.out.println(kILOMETRAJE);
        System.out.print("El precio es: $");
        System.out.println(PRECIO);
    }
}
