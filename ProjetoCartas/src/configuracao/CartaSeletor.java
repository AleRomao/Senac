package configuracao;

import cartas.Carta;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartaSeletor implements Batalha {

    @Override
    public List<Carta> selecionarCartas(List<Carta> cartas) {
                List<Carta> cartasJogador = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < cartas.size(); i++) {
            System.out.printf("Carta: %s, potencia: %d, velocidade: %d, posição: %d\n",
                    cartas.get(i).getNome(),
                    cartas.get(i).getPotencia(),
                    cartas.get(i).getVelocidade(), i);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Escolha a carta " + (i + 1) + " para batalhar (digite a posição): ");
            int escolha = sc.nextInt();
            if (escolha < 0 || escolha >= cartas.size()) {
                System.out.println("Carta Inválida. Tente novamente");
                i--;
            }else{
                cartasJogador.add(cartas.get(escolha));
            }
        }
        return cartasJogador;
    }
    
}
