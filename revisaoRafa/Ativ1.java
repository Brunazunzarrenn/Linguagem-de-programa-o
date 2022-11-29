package br.com.revisao;

import javax.swing.JOptionPane;

public class Ativ1 {
    public static void main(String[] args) {
        String jogador = "";
        String selecao = "";

        jogador = JOptionPane.showInputDialog(null, "Digite o seu jogador preferido", "Jogador", 1);
        selecao = JOptionPane.showInputDialog(null, "Digite  a seleção do seu jogador", "Seleção", 1);

        JOptionPane.showMessageDialog(null, "O jogador " + jogador + " é da seleção " + selecao + ".", "Resultado", 0);

    }

}
