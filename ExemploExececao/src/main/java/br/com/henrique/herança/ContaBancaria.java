/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.henrique.herança;

/**
 *
 * @author henrique.1954
 */
public class ContaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void sacar(double valor) throws SaldoInsuficiente {
        if (valor > saldo){
            throw new SaldoInsuficiente("Erro: saldo insuficiente");
        }
        saldo = saldo - valor
    }
    
}
