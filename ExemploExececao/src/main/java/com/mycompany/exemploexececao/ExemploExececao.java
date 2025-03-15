/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemploexececao;

/**
 *
 * @author henrique.1954
 */
public class ExemploExececao {

    public static void main(String[] args) {
        
        try {
            int x = 0;
        int y = 100/x;
        System.out.println("Resultado" + y);
            }catch (ArithmeticException e) {
            System.out.println("erro" + e.getMessage());}
        
                
                
    }
}
