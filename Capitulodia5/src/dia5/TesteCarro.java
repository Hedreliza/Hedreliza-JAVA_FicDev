/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia5;

/**
 *
 * @author ficdev
 */
public class TesteCarro {
    
     public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Sedan";
        carro.ano = 2021;
        
        carro.setFabricante("Ford");//da permissão ao atributo privado
        CarroEsportivo esportivo = new CarroEsportivo();
        esportivo.modelo = "Esportivo";
        esportivo.ano = 2023;
        
    }
    
}
