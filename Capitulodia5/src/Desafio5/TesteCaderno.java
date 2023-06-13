/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafio5;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ficdev
 */
public class TesteCaderno {
    public static void main(String[] args) {
        
        Caderno caderno = new Caderno();
        caderno.modelo = "Brochura";
        caderno.setEncardenacao("Costura");
        caderno.setFolha("Folha com Pauta");
        caderno.setQtdeFolhas(96);
        caderno.setCapa("dura");
        caderno.setMateria(1);
        caderno.descricaoCaderno();
        
        
        CadernoInteligente inteligente = new CadernoInteligente();
        inteligente.setModelo("inteligente");
        inteligente.setEncardenacao("disco");
        inteligente.setFolha("liso e quadriculado.");
        inteligente.setQtdeFolhas(80);
        inteligente.setCapa("dura");
        inteligente.setMateria(1);
        inteligente.descricaoCaderno();
       
        
        
        
        
        
    }
    
}
