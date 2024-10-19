package Configuracao;

import Cartas.Carta;

import java.util.ArrayList;
import java.util.List;

public class ConfigCarta{

    private static List<Carta> cartas = new ArrayList<>();

    public static Carta adicionarCarta(String nome, int velocidade, int potencia) {
        Carta novaCarta = new Carta(nome, velocidade, potencia);
        cartas.add(novaCarta);
        return novaCarta;
    }

    public static void criarCartasIniciais() {
        adicionarCarta("Carro 1", 150, 90);
        adicionarCarta("Carro 2", 200, 220);
        adicionarCarta("Carro 3", 259, 300);
        adicionarCarta("Carro 4", 300, 100);
        adicionarCarta("Carro 5", 400, 250);
        adicionarCarta("Carro 6", 200, 200);
    }

    public static List<Carta> obterCartas() {

        return new ArrayList<>(cartas);
    }
}
