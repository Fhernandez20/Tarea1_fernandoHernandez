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
public class Conformulas {
    public static void main(String[] args){
        
        Scanner lea = new Scanner(System.in);
            int primervalor=0;
            int segundovalor=0;
    
            System.out.println("Ingrese el primer numero entero: ");
            primervalor= lea.nextInt();
            System.out.println("Ingrese el segundo numero entero: ");
            segundovalor= lea.nextInt();
            
            System.out.println("quieres hacer suma o multiplicacion? true/suma ,false/multiplicacion");
            boolean operacion = lea.nextBoolean();
            

            int resultado = operacion ? (primervalor + segundovalor): (primervalor*segundovalor);
                System.out.println("Tu resultado es: "+resultado);

            }

            
    }


