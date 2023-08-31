/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.sp.senac.e169.alexandreromaoado1;

/**
 *
 * @author romao
 */
public class Aguia {
        //Atributos
    String nome;
    int asas;
    int pes;
    int velocidade;
    int altura;
    String cor;

    //Metodos Getters/Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAsas() {
        return asas;
    }

    public void setAsas(int asas) {
        this.asas = asas;
    }

    public int getPes() {
        return pes;
    }

    public void setPes(int pes) {
        this.pes = pes;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    //Construtor
    public Aguia(){
        
    }
    
    public Aguia(String nome){
        this.nome = nome;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public Aguia(String cor, String nome){
        this.cor = cor;
        this.nome = nome;
    }
    
    //Ações
    public void voar(){
        if(velocidade >= 60){
            System.out.println("Esta Voando!!");
        }else{
            System.out.println("Em Reposo!!");
        }   
    }
    public void caçar(){
        if(altura < 10){
            System.out.println("Em Ataque!!");
        }else{
            System.out.println("Esta Caçando!!");
        }
        
    }
    
}
