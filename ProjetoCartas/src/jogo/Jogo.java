package jogo;

import cartas.Carta;
import configuracao.ComparacaoPotencia;
import configuracao.ComparacaoVelocidade;
import configuracao.ConfigCarta;
import configuracao.EstrategiaBatalha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogo {

    public static void comecarJogar() {
        ConfigCarta.criarCartasIniciais();
        List<Carta> cartas = ConfigCarta.obterCartas();

        // Jogador 1 seleciona suas cartas
        System.out.println("Jogador 1, escolha 5 cartas:");
        Jogador jogador1 = new Jogador("Jogador 1", selecionarCartasParaJogador(cartas));

        // Jogador 2 seleciona suas cartas
        System.out.println("Jogador 2, escolha 5 cartas:");
        Jogador jogador2 = new Jogador("Jogador 2", selecionarCartasParaJogador(cartas));

        // Iniciar batalha
        String resultado = batalha(jogador1, jogador2);
        System.out.println(resultado);
    }

    private static List<Carta> selecionarCartasParaJogador(List<Carta> cartasDisponiveis) {
        List<Carta> cartasEscolhidas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean[] selecionadas = new boolean[cartasDisponiveis.size()]; // Para rastrear as cartas selecionadas

        while (cartasEscolhidas.size() < 5) {
            // Exibir as cartas disponíveis
            System.out.println("Cartas disponiveis:");
            for (int i = 0; i < cartasDisponiveis.size(); i++) {
                if (!selecionadas[i]) { // Mostra apenas cartas não selecionadas
                    System.out.printf("Carta: %s, Potencia: %d, Velocidade: %d, Posicao: %d\n",
                            cartasDisponiveis.get(i).getNome(),
                            cartasDisponiveis.get(i).getPotencia(),
                            cartasDisponiveis.get(i).getVelocidade(), i);
                }
            }

            // Solicitar que o jogador escolha uma carta
            System.out.print("Escolha a posicao da carta que deseja adicionar (0-9): ");
            int escolha = scanner.nextInt();

            // Validação da escolha
            if (escolha < 0 || escolha >= cartasDisponiveis.size() || selecionadas[escolha]) {
                System.out.println("Escolha invalida. Tente novamente.");
            } else {
                cartasEscolhidas.add(cartasDisponiveis.get(escolha));
                selecionadas[escolha] = true; // Marcar como selecionada
                System.out.println("Voce escolheu: " + cartasDisponiveis.get(escolha).getNome());
            }
        }
        return cartasEscolhidas;
    }

    public static String batalha(Jogador jogador1, Jogador jogador2) {
        Scanner scanner = new Scanner(System.in);
        int pontosJogadorUm = 0;
        int pontosJogadorDois = 0;

        int rodadas = Math.min(jogador1.getCartas().size(), jogador2.getCartas().size());

        OpcoesJogo opcoesJogador1 = new OpcoesJogo();
        OpcoesJogo opcoesJogador2 = new OpcoesJogo();

        for (int i = 0; i < rodadas; i++) {
            System.out.printf("Rodada %d:\n", i + 1);

            // Mostrar opções especiais
            System.out.println("Escolha uma opcao especial:");
            System.out.println("1. Aumentar status");
            System.out.println("2. Pegar mais uma carta");
            System.out.println("3. Aumentar pontos para dez");
            System.out.println("4. Descartar carta do adversario");

            int opcaoEspecialJogador1 = scanner.nextInt();
            opcoesJogador1.aplicarOpcao(opcaoEspecialJogador1, jogador1.getCartas(), jogador2.getCartas());

            int opcaoEspecialJogador2 = scanner.nextInt();
            opcoesJogador2.aplicarOpcao(opcaoEspecialJogador2, jogador2.getCartas(), jogador1.getCartas());

            // Escolher carta para jogar
            Carta cartaJogadorUm = escolherCartaParaRodada(jogador1, "Jogador 1");
            Carta cartaJogadorDois = escolherCartaParaRodada(jogador2, "Jogador 2");

            // Escolher atributo para comparação
            System.out.println("Escolha o atributo para comparacao:");
            System.out.println("1. Potencia");
            System.out.println("2. Velocidade");
            int atributoEscolhido = scanner.nextInt();

            EstrategiaBatalha estrategia = (atributoEscolhido == 1) ? new ComparacaoPotencia() : new ComparacaoVelocidade();
            int comparacao = estrategia.comparar(cartaJogadorUm, cartaJogadorDois, atributoEscolhido);

            // Exibe as cartas e o atributo selecionado
            System.out.println("\n--- Comparacao das Cartas ---");
            System.out.printf("Jogador 1 - %s: %s = %d\n", cartaJogadorUm.getNome(),
                    (atributoEscolhido == 1 ? "Potencia" : "Velocidade"), (atributoEscolhido == 1 ? cartaJogadorUm.getPotencia() : cartaJogadorUm.getVelocidade()));
            System.out.printf("Jogador 2 - %s: %s = %d\n", cartaJogadorDois.getNome(),
                    (atributoEscolhido == 1 ? "Potencia" : "Velocidade"), (atributoEscolhido == 1 ? cartaJogadorDois.getPotencia() : cartaJogadorDois.getVelocidade()));

            if (comparacao > 0) {
                System.out.println("Jogador 1 ganha esta rodada!");
                pontosJogadorUm++;
            } else if (comparacao < 0) {
                System.out.println("Jogador 2 ganha esta rodada!");
                pontosJogadorDois++;
            } else {
                System.out.println("Rodada empatada!");
            }

            // Mostrar os pontos até o momento
            System.out.printf("Pontos ate agora: \nJogador 1: %d \nJogador 2: %d\n", pontosJogadorUm, pontosJogadorDois);
        }

        // Resultado final
        if (pontosJogadorUm > pontosJogadorDois) {
            return "Jogador 1 e o vencedor!";
        } else if (pontosJogadorUm < pontosJogadorDois) {
            return "Jogador 2 e o vencedor!";
        } else {
            return "O jogo terminou em empate!";
        }
    }

    private static Carta escolherCartaParaRodada(Jogador jogador, String nomeJogador) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(nomeJogador + ", escolha uma carta para jogar:");
        List<Carta> cartas = jogador.getCartas();

        for (int i = 0; i < cartas.size(); i++) {
            System.out.printf("%d: %s (Potencia: %d, Velocidade: %d)\n",
                    i + 1, cartas.get(i).getNome(), cartas.get(i).getPotencia(), cartas.get(i).getVelocidade());
        }

        int escolha = scanner.nextInt() - 1; // Ajusta para zero-based index
        return cartas.get(escolha); // Retorna a carta escolhida
    }
}


