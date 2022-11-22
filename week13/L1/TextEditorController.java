package L1;

import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class TextEditorController implements ActionListener {

    private TextEditorView view;
    private TextEditorModel model;

    public TextEditorController() {
        view = new TextEditorView();
        model = new TextEditorModel("");

        view.getItemNew().addActionListener(this);
        view.getItemOpen().addActionListener(this);
        view.getItemSave().addActionListener(this);
        view.getItemClose().addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "New") {
            view.getTextArea().setText("");
        } else if (e.getActionCommand() == "Close") {
            System.exit(0);
        } else if (e.getActionCommand() == "Open") {
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(view.getWindow());
            File f = fc.getSelectedFile();
            model.loadText(f, view);
        }else if (e.getActionCommand() == "Save"){
            JFileChooser fc = new JFileChooser();
            fc.showSaveDialog(view.getWindow());
            File f = fc.getSelectedFile();
            model.saveText(f, view.getTextArea().getText());
        }

    }

}
