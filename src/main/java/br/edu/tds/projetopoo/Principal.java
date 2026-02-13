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
        Cliente c1 = new Cliente("dias", 18, "123456789");
        c1.imprimeDadosCliente();
    }
    
}
