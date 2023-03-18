package sebastian.garcia;

import sebastian.garcia.ui.BibliotecaUi;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        BibliotecaUi bibliotecaUi = new BibliotecaUi();
        JFrame jFrame = new JFrame();
        jFrame.setContentPane(bibliotecaUi.getjPanelRoot());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
        System.out.println("Hello world!");
    }
}