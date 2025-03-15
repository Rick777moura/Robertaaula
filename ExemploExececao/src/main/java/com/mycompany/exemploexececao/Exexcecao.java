/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.exemploexececao;

import java.util.Scanner;

/**
 *
 * @author henrique.1954
 */
public class Exexcecao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        try { 
            System.out.println("Informe um valor pra x");
        int x = leia.nextInt();
        int y = 100/x;
        System.out.println("Resultado: "+y);
    } catch (ArithmeticException e) {
            System.out.println("Operacao invalida ");
            System.out.println("Erro:" +e.getMessage());
    }
    
}}
                
       
