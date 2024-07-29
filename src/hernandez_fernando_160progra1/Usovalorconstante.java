/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hernandez_fernando_160progra1;
import java.util.Scanner;
/**
 *
 * @author fdhg0
 */
public class Usovalorconstante {
    public static void main(String[] args) {
        double preciodescuento= 0;
        double precionormal= 0;
        
        Scanner lea =new Scanner(System.in);
        
        System.out.print("Ingrese el precio con descuento: ");
        preciodescuento = lea.nextDouble();
        
        System.out.print("Ingrese el precio normal: ");
        precionormal = lea.nextDouble();
        
        System.out.print("¿El cliente tiene descuento? true/false: ");
        boolean tienedescuento = lea.nextBoolean();

        double preciofinal = tienedescuento ? preciodescuento : precionormal;
        System.out.println("El precio final es: " + preciofinal);

    }
}


