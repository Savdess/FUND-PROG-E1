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
        String mARCA;
        String mODELO;
        int aÑO;
        String cOLOR;
        int kILOMETRAJE;
        double pRECIO;
     Scanner AUTO_D = new Scanner(System.in);
        System.out.println("Que marca es tu auto?");
        mARCA = AUTO_D.nextLine();
        System.out.println("Que modelo es tu auto?");
        mODELO = AUTO_D.nextLine();
        System.out.println("De que año es tu carro?");
        aÑO = AUTO_D.nextInt();
        System.out.println("De que color es tu auto?");
        cOLOR = AUTO_D.nextLine();
        System.out.println("Cuanto kilometraje tiene hasta el momento?");
        kILOMETRAJE = AUTO_D.nextInt();
        System.out.println("Cuanto cuesta tu auto?");
        pRECIO = AUTO_D.nextDouble();
        System.out.println("PERFECTO!! TU AUTO TIENE:");
        System.out.print("La marca es:");
        System.out.println(mARCA);
        System.out.print("El modelo es:");
        System.out.println(mODELO);
        System.out.print("El año es: ");
        System.out.println(aÑO);
        System.out.print("El color del auto es: ");
        System.out.println(cOLOR);
        System.out.print("El kilometraje actual del auto es: ");
        System.out.println(kILOMETRAJE);
        System.out.print("El precio es: $");
        System.out.println(pRECIO);
    }
}
