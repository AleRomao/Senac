package cartas;

public class Carta {

    private String nome;
    private int velocidade;
    private int potencia;

    public Carta(String nome, int velocidade, int potencia) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.potencia = potencia;
    }

    public String getNome() {
        return nome;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getPotencia() {
        return potencia;
    }
}
