package sebastian.garcia.ui;

import sebastian.garcia.model.Cancion;
import sebastian.garcia.service.BibliotecaService;

import javax.swing.*;
import java.util.List;

public class CreatePlayListUi {
    private JTextField textFieldName;
    private JList list1;
    private JPanel jPanelRoot;

    public CreatePlayListUi() {
        List<Cancion> songs = BibliotecaService.getInstance().getAllSongs();
        DefaultListModel listModel = new DefaultListModel();
        for (int i = 0; i < songs.size(); i++) {
            listModel.addElement(songs.get(i).getTitulo() + " " + songs.get(i).getIdentificador());
        }
        list1.setModel(listModel);
    }

    public JTextField getTextFieldName() {
        return textFieldName;
    }

    public void setTextFieldName(JTextField textFieldName) {
        this.textFieldName = textFieldName;
    }

    public JList getList1() {
        return list1;
    }

    public void setList1(JList list1) {
        this.list1 = list1;
    }

    public JPanel getjPanelRoot() {
        return jPanelRoot;
    }

    public void setjPanelRoot(JPanel jPanelRoot) {
        this.jPanelRoot = jPanelRoot;
    }
}
