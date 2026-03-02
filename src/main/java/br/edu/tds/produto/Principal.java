/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.produto;

/**
 *
 * @author aluno
 */
public class Principal {
    
    public static void main(String[] args){
    System.out.println("teste");
    
    Produto p1 = new Produto("dias", 17.99f, 2);
    p1.imprimeDadosProdutos();
    
    Produto c1 = new Produto();
        c1.setNome("lucas");
        c1.setPreco(16.99f);
        c1.setQuantidade(2);
        c1.imprimeDadosProdutos();
    }
}
