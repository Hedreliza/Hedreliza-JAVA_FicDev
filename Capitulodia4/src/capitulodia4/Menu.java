/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulodia4;

import java.util.Scanner;

/**
 *
 * @author ficdev
 */
public class Menu {
    public static void main(String[] args) {
       
        Scanner read = new Scanner(System.in);
        
        String menu = "1 - Refrigerante. " +
                      " 2 - Suco de laranja." +
                      " 3 - Coca - cola." +
                      " 4 - Água com gás.";
        
        System.out.println(menu + "\n");
        
        System.out.print("Digite o número da sua bebida desejada: ");
        int bebida = read.nextInt();
            
        double preco;                
        
            switch(bebida) {
            case 1 :
                preco = 3.0;
                System.out.printf("Refrigerante: R$ %.2f\n",preco);
                break;
                
            case 2 :    
                preco = 6.0;
                System.out.printf("Suco de laranja: R$ %.2f\n",preco);
                break;
                
            case 3 :    
                preco = 2.50;
                System.out.printf("Coca - Cola: R$ %.2f\n",preco);
                break;
                
            case 4 :
                preco = 3.50;
                System.out.printf("Água com gás: R$ %.2f\n",preco);
                break;

            default :
               System.err.println("Bebida desejada não está no menu.");
            
            }
        
    }
    
}
