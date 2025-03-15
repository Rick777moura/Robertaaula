/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.henrique.logging;
import java.util.logging.Logger;
/**
 *
 * @author henrique.1954
 */
public class ExemploLogger {
    //atributos
    private static final Logger logger = 
            Logger.getLogger(ExemploLogger.class.getName());
    
    
    
    
    public static void main(String[] args) {
        logger.info("Iniciando nosso programa...");
        try {
            int resultado = 10/0; // forcei um erro para usar de exemplo
        } catch (ArithmeticException e) {
            logger.severe("Erro: Divisão por zero");
        }
    
        logger.info("Fim do programa.");
    }
     
}
