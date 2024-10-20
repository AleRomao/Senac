package jogo;

import cartas.Carta;
import java.util.ArrayList;
import java.util.List;
import observer.Observavel;
import observer.Observer;

public class OpcoesJogo implements Observavel {

    private List<Observer> observadores = new ArrayList<>();
    private boolean[] opcoesEspeciaisUsadas = new boolean[4]; // Para rastrear se as opções foram usadas

    @Override
    public void adcionarObervador(Observer observador) {
        observadores.add(observador);
    }

    @Override
    public void notificarObservadores(String mensagem) {
        for (Observer observador : observadores) {
            observador.notificar(mensagem);
        }
    }

    public boolean aplicarOpcao(int opcao, List<Carta> cartasJogador, List<Carta> cartasAdversario) {
        if (opcoesEspeciaisUsadas[opcao - 1]) { // Verifica se a opção já foi usada
            System.out.println("Voce ja usou esta opcao especial.");
            return false; // Não aplica a opção
        }

        switch (opcao) {
            case 1:
                aumentarStatus(cartasJogador);
                break;
            case 2:
                pegarMaisUmaCarta(cartasJogador);
                break;
            case 3:
                aumentarPontosParaDez(cartasJogador);
                break;
            case 4:
                descartarCartaAdversario(cartasAdversario);
                break;
            default:
                System.out.println("Opcao invalida");
                return false; // Não aplica a opção
        }

        opcoesEspeciaisUsadas[opcao - 1] = true; // Marcar a opção como utilizada
        notificarObservadores("A opcao especial " + opcao + " foi usada!");
        return true; // A opção foi aplicada com sucesso
    }

    // Métodos que alteram os status das cartas e cartas do adversário

    private void aumentarStatus(List<Carta> cartas) {
        for (Carta carta : cartas) {
            carta.setVelocidade(carta.getVelocidade() + 1);
            carta.setPotencia(carta.getPotencia() + 1);
        }
        System.out.println("Todos os status das cartas aumentaram em 1 ponto");
    }

    private void pegarMaisUmaCarta(List<Carta> cartas) {
        System.out.println("Voce pegou mais uma carta (implementação pendente)");
    }

    private void aumentarPontosParaDez(List<Carta> cartas) {
        if (!cartas.isEmpty()) {
            int potenciaAtual = cartas.get(0).getPotencia();
            cartas.get(0).setPotencia(potenciaAtual +10);
            System.out.println("Os pontos da primeira carta foram aumentados para 10");
        }
    }

    private void descartarCartaAdversario(List<Carta> cartasAdversario) {
        if (!cartasAdversario.isEmpty()) {
            cartasAdversario.remove(0);
            System.out.println("A primeira carta do adversario foi descartada");
        }
    }

    // Método para verificar se ainda existem opções especiais disponíveis
    public boolean temOpcoesEspeciaisDisponiveis() {
        for (boolean usada : opcoesEspeciaisUsadas) {
            if (!usada) {
                return true; // Se houver uma opção que não foi usada
            }
        }
        return false; // Todas as opções foram usadas
    }
}


