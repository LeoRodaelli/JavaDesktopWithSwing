package br.com.rodaelli.calculadora;

import javax.swing.*;

public class Aplicacao {
    public static void main(String[] args) {
        //invokeLater() -> metodo responsavel por não travar a aplicação, então ele chamar a tela dentro de uma thread
        //boa pratica dentro do java desktop
        SwingUtilities.invokeLater(() -> {
            Calculadora calc = new Calculadora();
            calc.setVisible(true);
        });
    }
}