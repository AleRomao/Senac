package br.sp.senac.e169.calcularareaperimetro;

public class Carro {
    
    private String marca;
    private String modelo;
    private int velocidade;

    public Carro(String marca, String modelo, int velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = 0;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getVelocidade() {
        return velocidade;
    }
    
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    public void acelerar() {
        this.velocidade += 10;
    }
    
    public void frear() {
        if(this.getVelocidade() > 0) {
            this.setVelocidade(0);
        } else {
            System.out.println("Carro parado");
        }
    }
    
    public void mostrar() {
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Velocidade: " + this.getVelocidade());
    }
    
}
