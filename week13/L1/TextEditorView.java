package L1;
import java.awt.*;
import javax.swing.*;

public class TextEditorView{
    private JFrame window;
    private JMenuBar menuBar;
    private JMenu menuFile ;
    private JMenuItem itemNew, itemOpen, itemSave, itemClose;
    private JTextArea textArea;
    
    public TextEditorView(){
        window = new JFrame();
//        parent 
        menuBar = new JMenuBar();
//        child
        menuFile = new JMenu("File");
//        child of child
        itemNew = new JMenuItem("New");
        itemOpen = new JMenuItem("Open");
        itemSave = new JMenuItem("Save");
        itemClose = new JMenuItem("Close");
        
      
        textArea = new JTextArea(20, 50);
        
        
        window.setJMenuBar(menuBar);
        menuBar.add(menuFile);
        menuFile.add(itemNew);
        menuFile.add(itemOpen);
        menuFile.add(itemSave);
        menuFile.addSeparator();
        menuFile.add(itemClose);
        
        window.setLayout(new FlowLayout());
        window.add(textArea);
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
}

    public JFrame getWindow() {
        return window;
    }

    public void setWindow(JFrame window) {
        this.window = window;
    }

    public JMenuBar getMenuBar() {
        return menuBar;
    }

    public void setMenuBar(JMenuBar menuBar) {
        this.menuBar = menuBar;
    }

    public JMenu getMenuFile() {
        return menuFile;
    }

    public void setMenuFile(JMenu menuFile) {
        this.menuFile = menuFile;
    }

    public JMenuItem getItemNew() {
        return itemNew;
    }

    public void setItemNew(JMenuItem itemNew) {
        this.itemNew = itemNew;
    }

    public JMenuItem getItemOpen() {
        return itemOpen;
    }

    public void setItemOpen(JMenuItem itemOpen) {
        this.itemOpen = itemOpen;
    }

    public JMenuItem getItemSave() {
        return itemSave;
    }

    public void setItemSave(JMenuItem itemSave) {
        this.itemSave = itemSave;
    }

    public JMenuItem getItemClose() {
        return itemClose;
    }

    public void setItemClose(JMenuItem itemClose) {
        this.itemClose = itemClose;
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }
   
}
