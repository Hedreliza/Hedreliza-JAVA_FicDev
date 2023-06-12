/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulodia2;

import java.util.Scanner;

/**
 *
 * @author ficdev
 */
public class DesafioDia2 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
                
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();
        
        System.out.println("Seu nome é " + nome + " e você tem " + idade + " anos.");
    
    }
}
