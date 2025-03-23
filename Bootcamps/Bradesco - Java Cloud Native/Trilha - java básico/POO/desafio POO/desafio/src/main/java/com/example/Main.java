package com.example;

public class Main {
    public static void main(String[] args) {
        Cliente cleiton = new Cliente("Cleiton Silva Souza", "123.321.456-1");

        Conta cleitonAccount = new ContaCorrente(cleiton);

        cleitonAccount.deposito(50.0);
        cleitonAccount.imprimirRelatorio();
    }
}