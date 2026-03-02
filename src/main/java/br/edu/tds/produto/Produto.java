/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.produto;

/**
 *
 * @author aluno
 */
public class Produto {
    private String nome;
    private float preco;
    private int quantidade;
    
    
   //definir os meus construtores
    public Produto(){
    
    }
     public Produto(String n, float p, int q){
         this.nome = n;
         this.preco = p;
         this.quantidade = q;
     }
   //metodo get e set
     public void setNome(String n){
        this.nome = n;
    }
    public void setPreco(float p){
        this.preco = p;
    }
    public void setQuantidade(int q){
        this.quantidade = q;
    }
    public String getNome(){
        return this.nome;
    }
    public float getPreco(){
        return this.preco;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    
    //metodos funcionais
    public void imprimeDadosProdutos(){
        System.out.println("nome: " + this.nome);
        System.out.println("preço: " + this.preco);
        System.out.println("quantidade: " + this.quantidade);
        System.out.println("-------------------------");
    }
}
