package com.example;

public class ContaPoupanca extends Conta{

    
    public ContaPoupanca(Cliente cliente , Banco banco) {
            super(cliente , banco);
    }
    
    @Override
    public void imprimirRelatorio() {
        System.out.println("====informações da sua conta poupança====");
        infoComum();
    }
    

}
