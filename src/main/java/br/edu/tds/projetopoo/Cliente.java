/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.projetopoo;

/**
 *
 * @author aluno
 */
public class Cliente {
    // definiçã
    private String nome;
    private int idade;
    private String cpf;
    
    //definir os meus construtores
    public Cliente(){
    
    }
    
    public Cliente(String n, int i, String cpf){
    this.nome = n;
    this.idade = i;
    this.cpf = cpf;
    }
    
    //metodos get & set
    public void setNome(String n){
        this.nome = n;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    public void setcpf(String cpf){
        this.cpf = cpf;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getCPF(){
        return this.cpf;
    }
    
    
    
    
    
    
    //metodos funcionais
    public void imprimeDadosCliente(){
        System.out.println("nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
        System.out.println("-------------------------");
    }
    
}
