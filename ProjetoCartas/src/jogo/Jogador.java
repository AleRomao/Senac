package jogo;

import cartas.Carta;
import java.util.List;
import observer.Observer;

public class Jogador implements Observer {

    private String nome;
    private List<Carta> cartas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador(String nome, List<Carta> cartas) {
        this.nome = nome;
        this.cartas = cartas;
    }

    public Carta escolherCarta(int index) {
        return cartas.get(index);
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println(nome + ": " + mensagem);
    }

    public List<Carta> getCartas() {
        return cartas;
    }
}
