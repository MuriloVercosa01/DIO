package com.example;

import lombok.extern.log4j.Log4j;

public class Main {
    
    public static void main(String[] args) {
        Cliente cleiton = new Cliente();
        cleiton.setNome("cleiton");
        cleiton.setCpf("123.321.789-1");
        ContaCorrente cc = new ContaCorrente(cleiton , Banco.BRADESCO );

        cc.deposito(100);
        cc.imprimirRelatorio();

        ContaPoupanca cp = new ContaPoupanca(cleiton , Banco.BRADESCO );

        cp.imprimirRelatorio();
        


    }
}