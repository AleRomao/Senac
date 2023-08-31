/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.sp.senac.e169.alexandreromaoado1;

/**
 *
 * @author romao
 */
import javax.swing.JOptionPane;

public class AlexandreRomaoADO1 {

    public static void main(String[] args) {
        Aguia aguia1 = new Aguia("Tufão");
        
        Aguia aguia2 = new Aguia("Valentino");
        
        System.out.println("Nome da Aguia 1: " + aguia1.getNome() + " - Nome Aguia 2: " + aguia2.getNome());
        JOptionPane.showMessageDialog(null,"Aguia 1: " + aguia1.getNome() + "/ Aguia 2: " + aguia2.getNome());
    }
}
