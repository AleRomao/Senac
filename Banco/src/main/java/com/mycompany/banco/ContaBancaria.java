package com.mycompany.banco;

public class ContaBancaria {
    private int numConta;
    private String nome;
    private double saldo;
    
    public int getnumConta(){
        return numConta;
    }
    
    public void setnumConta(int numConta){
        this.numConta = numConta;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void realizarDeposito(double valor) {
        this.saldo += valor;
    } 
    
    public double realizarSaque(double valor) {
        if(this.saldo >= valor){    
        this.saldo -= valor;
        } else {
            System.out.println("Saldo Insuficiente");
        }
        return saldo;
    }
    
    public void mostrar(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Numero Conta: " + this.numConta);
        System.out.println("Saldo: " + this.saldo);
    }
}
