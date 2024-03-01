
package br.sp.senac.e169.calcularareaperimetro;
import java.util.Scanner;

public class CalcularAreaPerimetro {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        /*
        Circulo circulo = new Circulo();
        circulo.setRaio(15);
        circulo.calcularArea();
        circulo.calcularPerimetro();
        circulo.mostrar();
        System.out.println("-----------------------------");
        Retangulo retangulo = new Retangulo();
        System.out.print("Digite a Altura: ");
        retangulo.setAltura(teclado.nextDouble());
        System.out.print("Digite a Largura: ");
        retangulo.setLargura(teclado.nextDouble());
        System.out.println("-----Resultado-----");
        retangulo.calcularArea();
        retangulo.calcularPerimetro();
        retangulo.mostrar();
        */
        Carro carro = new Carro("Fiat", "Uno", 0);
        carro.acelerar();
        carro.mostrar();
        carro.acelerar();
        carro.mostrar();
        carro.frear();
        carro.mostrar();
        carro.frear();
        carro.mostrar();
    }
}
