package configuracao;

import cartas.Carta;

public interface EstrategiaBatalha {
    int comparar(Carta carta1, Carta carta2, int atributo);
}
