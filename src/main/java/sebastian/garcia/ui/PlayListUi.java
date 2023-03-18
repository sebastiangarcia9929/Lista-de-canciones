package sebastian.garcia.ui;

import sebastian.garcia.model.Cancion;
import sebastian.garcia.model.PlayList;
import sebastian.garcia.service.BibliotecaService;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class PlayListUi {
    private JList list1;
    private JPanel jpanelRoot;
    private JButton crearPlayListButton;

    public PlayListUi() {
        List<PlayList> songs = BibliotecaService.getInstance().getAllPlayList();
        DefaultListModel listModel = new DefaultListModel();
        for (int i = 0; i < songs.size(); i++) {
            listModel.addElement(songs.get(i).getName());
        }
        list1.setModel(listModel);

        list1.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()){
                    JList source = (JList)event.getSource();
                    String selected = source.getSelectedValue().toString();

                    System.out.println(selected);
                }
            }
        });

        crearPlayListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame jFrame = new JFrame();
                jFrame.setContentPane(new CreatePlayListUi().getjPanelRoot());
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jFrame.pack();
                jFrame.setVisible(true);
            }
        });
    }

    public JList getList1() {
        return list1;
    }

    public void setList1(JList list1) {
        this.list1 = list1;
    }

    public JPanel getJpanelRoot() {
        return jpanelRoot;
    }

    public void setJpanelRoot(JPanel jpanelRoot) {
        this.jpanelRoot = jpanelRoot;
    }
}
