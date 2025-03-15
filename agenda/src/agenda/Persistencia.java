/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author henrique.1954
 */
public class Persistencia {

    private final String arquivo = "contatos.txt";

    public void criarArquivo() {

        try {
            File file = new File(arquivo);
            if (file.createNewFile()) {
                System.out.println("Arquivo criado com sucesso");
            }
        } catch (IOException ex) {
            System.out.println("Erro ao criar arquivo");
        }
    }

    public void inserir(Contato contato) {

        try {
            FileWriter escritor =
                     escritor = new FileWriter(arquivo, true);

            BufferedWriter buffer = new BufferedWriter(escritor);
            Buffer.write(contato.getNome() + ";"+ contato.getTelefone() + ";"+ contato.getEmail());
            buffer.close();
        } catch (IOException ex) {
            System.out.println("Erro ao gravar o arquivo");
        }

    }
}
