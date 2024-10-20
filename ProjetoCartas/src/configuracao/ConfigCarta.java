package configuracao;

import cartas.CarroFactory;
import cartas.Carta;
import cartas.CartaFactory;
import java.util.ArrayList;
import java.util.List;

public class ConfigCarta {

    private static List<Carta> cartas = new ArrayList<>();
    private static CartaFactory cartaFactory = new CarroFactory();

    public static Carta adicionarCarta(String nome, int velocidade, int potencia) {
        Carta novaCarta = cartaFactory.criarCarta(nome, velocidade, potencia);
        cartas.add(novaCarta);
        return novaCarta;
    }

    // Método para criar cartas iniciais
    public static void criarCartasIniciais() {
        adicionarCarta("Carro 1", 150, 90);
        adicionarCarta("Carro 2", 200, 220);
        adicionarCarta("Carro 3", 259, 300);
        adicionarCarta("Carro 4", 300, 100);
        adicionarCarta("Carro 5", 400, 250);
        adicionarCarta("Carro 6", 200, 200);
        adicionarCarta("Carro 7", 350, 150);
        adicionarCarta("Carro 8", 450, 300);
        adicionarCarta("Carro 9", 270, 210);
        adicionarCarta("Carro 10", 320, 270);
    }

    // Método para obter a lista de cartas
    public static List<Carta> obterCartas() {
        return new ArrayList<>(cartas);
    }
}
