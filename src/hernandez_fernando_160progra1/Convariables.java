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
public class Convariables {
    public static void main(String[] args){
        double X = 0;
        double Y = 0;
        Scanner lea=new Scanner(System.in);
                System.out.println("Elije el valor de la variables y cual quieres ver");
                System.out.println("Ingrese el valor de la variable X: ");
                X= lea.nextDouble();
                
                System.out.println("Ingrese el valor de la variable Y: ");
                Y= lea.nextDouble();
                
                System.out.println("Quieres ver la variable X? true/false");
                boolean variable = lea.nextBoolean();
                
        double variableAmostrar= variable ? X : Y;
        
        System.out.println("El valor de tu variable es: "+variableAmostrar);
    }
    
}
