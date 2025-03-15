package com.mycompany.exercicio1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercicio1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        String numero;
        
        System.out.println("Digite o numero no formato (XX) XXXXX-XXX");
        numero = leia.nextLine();
        
        String regex = "\\d{2}\\+\\{\\d{2}\\}\\d{5}-\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(numero);
        
        if (matcher.matches()){
            System.out.println("O numero valido");
        }else{
            System.out.println("O numero Invalido");
        }
    }
    
}
