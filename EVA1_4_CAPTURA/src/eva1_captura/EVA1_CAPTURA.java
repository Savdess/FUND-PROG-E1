/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_captura;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SI VAMOS A USAR UNA VARIABLE SE TIENEN QUE DECLARAR ANTES DE USAR
        //DECLARAR--->CREAR UNA VARIABLE PARA SU USO EN EL PROGRAMA
        //TIPO_DATO NOMBRE_IDENTIFICADOR;
        //UTILIZAR NOMBRES SIGNIFICATIVOS--->DEBE DECIR PARA QUE SE USA
        String nombre;//ESTOY DECLARANDO UNA VARIABLE
    System.out.println("Captura el nombre");
        //ENTRADA DE DATOS DEL TECLADO(JAVA)
        Scanner CA_NOMBRE = new Scanner(System.in);//Otra variable --> CA_NOMBRE DE TIPO SCANNER
        //capturar del teclado y ponerlo en la variable nombre
        //escribir en la variable(poner un valor) ASIGNCACION
        nombre = CA_NOMBRE.nextLine();
        System.out.println("El valor capturado es");
        System.out.println(nombre);//USO LA VARIABLE--->LECTURA
    }
    
}
