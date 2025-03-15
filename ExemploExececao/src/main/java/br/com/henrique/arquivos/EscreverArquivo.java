
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.henrique.arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EscreverArquivo {
    public static void main(String[] args) {
        try {
            FileWriter escritor = new FileWriter("exemplo.txt");
            try (BufferedWriter buffer = new BufferedWriter(escritor)) {
                buffer.write("Oi, este é um exemplo de arquivo criado pelo Java");
                buffer.newLine(); //quebra de linha
                buffer.write("Estou aprendendo Java!!");
            }            
        } catch (IOException ex) {
            Logger.getLogger(EscreverArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}