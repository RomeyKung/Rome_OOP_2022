/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L2;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author kakak
 */
public class BookAdd {
     JFrame bookAddWindow;
    JLabel nameLabel, priceLabel, typeLabel;
    JTextField nameTextField, priceTextField;
    JComboBox typeComboBox;
    JButton insertButton;
    JPanel topPanel, bottomPanel;
    private String[] allCombo = {"General", "Computer", "Math&Sci", "Photo"};
    
    public BookAdd(){
        bookAddWindow = new JFrame();
        nameLabel = new JLabel(" Name");
        priceLabel = new JLabel(" Price");
        typeLabel = new JLabel(" Type");
        nameTextField = new JTextField();
        priceTextField = new JTextField();
        typeComboBox = new JComboBox(allCombo);
        insertButton = new JButton("Insert");
        topPanel = new JPanel();
        bottomPanel = new JPanel();
        
        topPanel.setLayout(new GridLayout(3,2));
        topPanel.add(nameLabel);    topPanel.add(nameTextField);
        topPanel.add(priceLabel);   topPanel.add(priceTextField);
        topPanel.add(typeLabel);    topPanel.add(typeComboBox);
        
        bottomPanel.setLayout(new FlowLayout());
        bottomPanel.add(insertButton);
        
        bookAddWindow.setLayout(new BorderLayout());
        bookAddWindow.add(topPanel, BorderLayout.NORTH);
        bookAddWindow.add(bottomPanel, BorderLayout.SOUTH);
        
        bookAddWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        bookAddWindow.pack();
        bookAddWindow.setLocationRelativeTo(null);
        bookAddWindow.setVisible(true);
    }

    public JFrame getBookAddWindow() {
        return bookAddWindow;
    }

    public void setBookAddWindow(JFrame bookAddWindow) {
        this.bookAddWindow = bookAddWindow;
    }

    public JLabel getNameLabel() {
        return nameLabel;
    }

    public void setNameLabel(JLabel nameLabel) {
        this.nameLabel = nameLabel;
    }

    public JLabel getPriceLabel() {
        return priceLabel;
    }

    public void setPriceLabel(JLabel priceLabel) {
        this.priceLabel = priceLabel;
    }

    public JLabel getTypeLabel() {
        return typeLabel;
    }

    public void setTypeLabel(JLabel typeLabel) {
        this.typeLabel = typeLabel;
    }

    public JTextField getNameTextField() {
        return nameTextField;
    }

    public void setNameTextField(JTextField nameTextField) {
        this.nameTextField = nameTextField;
    }

    public JTextField getPriceTextField() {
        return priceTextField;
    }

    public void setPriceTextField(JTextField priceTextField) {
        this.priceTextField = priceTextField;
    }

    public JComboBox getTypeComboBox() {
        return typeComboBox;
    }

    public void setTypeComboBox(JComboBox typeComboBox) {
        this.typeComboBox = typeComboBox;
    }

    public JButton getInsertButton() {
        return insertButton;
    }

    public void setInsertButton(JButton insertButton) {
        this.insertButton = insertButton;
    }

    public JPanel getTopPanel() {
        return topPanel;
    }

    public void setTopPanel(JPanel topPanel) {
        this.topPanel = topPanel;
    }

    public JPanel getBottomPanel() {
        return bottomPanel;
    }

    public void setBottomPanel(JPanel bottomPanel) {
        this.bottomPanel = bottomPanel;
    }

    public String[] getAllCombo() {
        return allCombo;
    }

    public void setAllCombo(String[] allCombo) {
        this.allCombo = allCombo;
    }
   
}
