package com.example;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirRelatorio() {
        System.out.println("====informações da sua conta corrente====");
        infoComum();
    }
    
}
