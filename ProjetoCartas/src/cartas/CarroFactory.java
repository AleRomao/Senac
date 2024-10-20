package cartas;

public class CarroFactory implements CartaFactory {

    @Override
    public Carta criarCarta(String nome, int velocidade, int potencia) {
        return new Carta(nome, velocidade, potencia);
    }
    
}
