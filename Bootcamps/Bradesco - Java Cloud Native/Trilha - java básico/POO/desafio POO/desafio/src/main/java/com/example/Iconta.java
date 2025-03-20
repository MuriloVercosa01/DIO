package com.example;

public interface Iconta {

    void saque(double valor);

    void deposito(double valor);

    boolean tranferencia(double valor , Conta contadestino);

    void infoComum();

    void imprimirRelatorio();
}
