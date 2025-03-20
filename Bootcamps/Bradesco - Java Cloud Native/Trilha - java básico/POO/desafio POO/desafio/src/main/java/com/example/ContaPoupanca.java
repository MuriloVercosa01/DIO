package com.example;

public class ContaPoupanca extends Conta{

    
    public ContaPoupanca(Cliente cliente) {
            super(cliente);
    }
    
    @Override
    public void imprimirRelatorio() {
        System.out.println("====informações da sua conta poupança====");
        infoComum();
    }
    

}
