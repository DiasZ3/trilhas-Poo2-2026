/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.projetopoo;

/**
 *
 * @author aluno
 */
public class Principal {
    
    public static void main(String[] args){
        System.out.println("testando classe cliente");
        //usando a classe cliente
        Cliente c1 = new Cliente("dias", 17, "123456789");
        c1.imprimeDadosCliente();
        
        Cliente c2 = new Cliente("douglas", 21, "123456789");
        c2.imprimeDadosCliente();
        
        Cliente c3 = new Cliente("gomes", 18, "123456789");
        c3.imprimeDadosCliente();
         
        Cliente c4 = new Cliente();
        c4.setNome("lucas");
        c4.setIdade(16);
        c4.setcpf("123456789");
        c4.imprimeDadosCliente();
        
        //imprimir somente o nome de um cliente
        String nome = c4.getNome();
        System.out.println("nome pelo get: " + nome);
        
    }
    
}
