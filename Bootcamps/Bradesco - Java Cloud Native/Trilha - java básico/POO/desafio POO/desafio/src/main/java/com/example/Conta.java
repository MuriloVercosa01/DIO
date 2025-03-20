package com.example;

public abstract class Conta implements Iconta {
    protected static int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente cliente;


    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIAL++;
        this.cliente = cliente;
    }


    @Override
    public void saque(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void deposito(double valor) {
        this.saldo += valor;
    }

    @Override
    public boolean tranferencia(double valor , Conta contadestino) {
        if(this.saldo < valor) return false;
        saque(valor);
        contadestino.deposito(valor);
        return true;

    }

    protected void infoComum() {
        System.out.println("titular da conta: "+ this.cliente.getNome());
        System.out.println("cpf do titular: "+ this.cliente.getCpf());
        System.out.println("numero agência: "+ this.agencia);
        System.out.println("numero de conta: "+this.numero);
        System.out.println("saldo: "+ saldo);
        System.out.println("================================");
    }

}
