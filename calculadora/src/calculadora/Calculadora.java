/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author franr
 */

import java.util.Scanner;
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner s=new Scanner(System.in);
boolean salir = false;
 int num1 =0 ;
        int num2 =0 ;
do{
    

        System.out.println("1.Introducir números 2.Suma 3.Resta 4.Multiplicación 5.División 6.Módulo");
        int respuesta = s.nextInt();
        
       
        
        switch (respuesta) {
            case 1:
                System.out.println("Introduce el número 1:");
                                num1=s.nextInt();
                System.out.println("Introduce el número 2:");
                                num2=s.nextInt();
                break;
                            case 2:
                                System.out.println("La suma es: "+(num1+num2));

                break;

                            case 3:
                                System.out.println("La resta es: "+(num1-num2));
                break;
                                
                            case 4:
                                System.out.println("La multiplicacion es: "+(num1*num2));
                break;
                    case 5:
                                System.out.println("La division es: "+(num1/num2));
                break;
                
                case 6:
                                System.out.println("El módulo es: "+(num1%num2));
                break;
            default:
                throw new AssertionError();
        }
        }while(!salir);
        
    }
    
}
