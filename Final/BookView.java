package Final;

import java.awt.*;
import javax.swing.*;


public class BookView {

    JFrame BookViewJFrame;
    JLabel nameLabel, priceLabel, typeLabel;
    JPanel P1, P2, P3, P4;
    JTextField nameTextField, priceTextField, indexTextField;
    JComboBox typeComboBox;
    private String[] allType = {"General", "Computer", "Math&Sci", "Photo"};
    JButton prev, next, add, update, delete;

    public BookView() {
        BookViewJFrame = new JFrame();
        nameLabel = new JLabel("Name");
        priceLabel = new JLabel("Price");
        typeLabel = new JLabel("Type");
        prev = new JButton("<<<");
        next = new JButton(">>>");
        nameTextField = new JTextField();
        priceTextField = new JTextField();
        indexTextField = new JTextField("0");
        add = new JButton("Add");
        update = new JButton("Update");
        delete = new JButton("Delete");
        typeComboBox = new JComboBox(allType);
        P1 = new JPanel();
        P2 = new JPanel();
        P3 = new JPanel();
        P4 = new JPanel();

        
        P1.setLayout(new GridLayout(3,1));
                
        P1.add(nameLabel);        P1.add(nameTextField);
        P1.add(priceLabel);                P1.add(priceTextField);
        P1.add(typeLabel);        P1.add(typeComboBox);
        
        P2.setLayout(new FlowLayout());
        indexTextField.setColumns(3);
        indexTextField.setEditable(false);
        
        P2.add(prev);      P2.add(indexTextField);     P2.add(next);
       
        P3.setLayout(new FlowLayout());
        P3.add(add);        P3.add(update);        P3.add(delete);

        


        BookViewJFrame.setLayout(new BorderLayout());
        BookViewJFrame.add(P1, BorderLayout.NORTH);
        P4.setLayout(new GridLayout(2,1));
        P4.add(P2);
        P4.add(P3);

        BookViewJFrame.add(P4, BorderLayout.SOUTH);
        
          
        
     
        
        //setFrame
        BookViewJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BookViewJFrame.pack();
        BookViewJFrame.setLocationRelativeTo(null);
        BookViewJFrame.setVisible(true);

    }

    public JFrame getBookViewJFrame() {
        return BookViewJFrame;
    }

    public void setBookViewJFrame(JFrame BookViewJFrame) {
        this.BookViewJFrame = BookViewJFrame;
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

    public JPanel getP1() {
        return P1;
    }

    public void setP1(JPanel P1) {
        this.P1 = P1;
    }

    public JPanel getP2() {
        return P2;
    }

    public void setP2(JPanel P2) {
        this.P2 = P2;
    }

    public JPanel getP3() {
        return P3;
    }

    public void setP3(JPanel P3) {
        this.P3 = P3;
    }

    public JPanel getP4() {
        return P4;
    }

    public void setP4(JPanel P4) {
        this.P4 = P4;
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

    public JTextField getIndexTextField() {
        return indexTextField;
    }

    public void setIndexTextField(JTextField indexTextField) {
        this.indexTextField = indexTextField;
    }

    public JComboBox getTypeComboBox() {
        return typeComboBox;
    }

    public void setTypeComboBox(JComboBox typeComboBox) {
        this.typeComboBox = typeComboBox;
    }

    public String[] getAllType() {
        return allType;
    }

    public void setAllType(String[] allType) {
        this.allType = allType;
    }

    public JButton getPrev() {
        return prev;
    }

    public void setPrev(JButton prev) {
        this.prev = prev;
    }

    public JButton getNext() {
        return next;
    }

    public void setNext(JButton next) {
        this.next = next;
    }

    public JButton getAdd() {
        return add;
    }

    public void setAdd(JButton add) {
        this.add = add;
    }

    public JButton getUpdate() {
        return update;
    }

    public void setUpdate(JButton update) {
        this.update = update;
    }

    public JButton getDelete() {
        return delete;
    }

    public void setDelete(JButton delete) {
        this.delete = delete;
    }
   

}
