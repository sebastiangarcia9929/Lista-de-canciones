package sebastian.garcia.ui;

import sebastian.garcia.model.Cancion;
import sebastian.garcia.service.BibliotecaService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class BibliotecaUi {
    private JLabel jlBiblioteca;
    private JLabel jlCanciones;
    private JList jlistCanciones;
    private JPanel jPanelRoot;
    private JButton playlistButton;
    private JButton buscarButton;
    private JTextField textField1;


    public BibliotecaUi() {
        List<Cancion> songs = BibliotecaService.getInstance().getAllSongs();
        DefaultListModel listModel = new DefaultListModel();
        for (int i = 0; i < songs.size(); i++) {
            listModel.addElement(songs.get(i).getTitulo() + " " + songs.get(i).getIdentificador());
        }
        jlistCanciones.setModel(listModel);


        playlistButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame = new JFrame();
                jFrame.setContentPane(new PlayListUi().getJpanelRoot());
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jFrame.pack();
                jFrame.setVisible(true);
            }
        });
    }

    public JLabel getJlBiblioteca() {
        return jlBiblioteca;
    }

    public void setJlBiblioteca(JLabel jlBiblioteca) {
        this.jlBiblioteca = jlBiblioteca;
    }

    public JLabel getJlCanciones() {
        return jlCanciones;
    }

    public void setJlCanciones(JLabel jlCanciones) {
        this.jlCanciones = jlCanciones;
    }

    public JList getJlistCanciones() {
        return jlistCanciones;
    }

    public void setJlistCanciones(JList jlistCanciones) {
        this.jlistCanciones = jlistCanciones;
    }

    public JPanel getjPanelRoot() {
        return jPanelRoot;
    }

    public void setjPanelRoot(JPanel jPanelRoot) {
        this.jPanelRoot = jPanelRoot;
    }
}
