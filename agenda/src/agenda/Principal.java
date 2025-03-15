/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agenda;

/**
 *
 * @author henrique.1954
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome = "Luke Skywalker";
        String telefone = "(45)99999-9999";
        String email = "Luke@gamil.com";
        /*Contato contato = new Contato("Luke Skywalker", "(45)99999-9999";, "Luke@gamil.com";);*/
        
        Persistencia persistencia = new Persistencia();
        persistencia.criarArquivo();
        persistencia.inserir(contato);
    }
    
}
