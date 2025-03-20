package com.example;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente , Banco banco) {
        super(cliente , banco );
    }

    @Override
    public void imprimirRelatorio() {
        System.out.println("====informações da sua conta corrente====");
        infoComum();
    }
    
}
