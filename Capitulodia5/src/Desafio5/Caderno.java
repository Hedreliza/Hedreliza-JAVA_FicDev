/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafio5;

/**
 *
 * @author ficdev
 */
public class Caderno {
    
    public String modelo;
    protected String encardenacao;
    private String folha;
    private int qtdeFolhas;
    public String capa;
    public int materia;
    
    public void fecharCaderno() {
        System.out.println("Caderno fechado.");
    }
    
    public void abrirCaderno() {
        System.out.println("Caderno aberto.");
    }
    
    public void retirarFolha() {
        System.out.println("Folha arrancada.");
    }
    
    public void descricaoCaderno() {
        System.out.print("Caderno " + getModelo());
        System.out.print(" " + getMateria() + " materia,");
        System.out.println(" capa " + getCapa() + ",");
        System.out.print("com encardenação a " + getEncardenacao());
        System.out.println(", de " + getQtdeFolhas() + " folhas");
        System.out.println("com modelo " + getFolha());
        
    }
    
    
            public String getEncardenacao() {
                return encardenacao;
            }
            
            public void setEncardenacao(String encardenacao) {
                this.encardenacao = encardenacao;
            }
     
            public String getFolha() {
                return folha;
            }

            public void setFolha(String folha) {
                this.folha = folha;
            }

            public int getQtdeFolhas() {
                return qtdeFolhas;
            }

            public void setQtdeFolhas(int qtdeFolhas) {
                this.qtdeFolhas = qtdeFolhas;
            }

            public String getCapa() {
                return capa;
            }

            public void setCapa(String capa) {
                this.capa = capa;
            }

            public int getMateria() {
                return materia;
            }


            public void setMateria(int materia) {
                this.materia = materia;
                this.materia = 1;
            }

            public String getModelo() {
                return modelo;
            }

            public void setModelo(String modelo) {
                this.modelo = modelo;
            }
}
