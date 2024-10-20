package cartas;

public interface CartaFactory {
    Carta criarCarta(String nome, int velocidade, int potencia);
}

