package configuracao;

import cartas.Carta;

public class ComparacaoVelocidade implements EstrategiaBatalha{

    @Override
    public int comparar(Carta carta1, Carta carta2, int atributo) {
        return Integer.compare(carta1.getVelocidade(), carta2.getVelocidade());
    }
    
}
