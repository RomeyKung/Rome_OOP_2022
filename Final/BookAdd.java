package Final;

import java.awt.*;
import javax.swing.*;


public class BookAdd {

    JFrame BookAddJFrame;
    JPanel P1,P2;
    JLabel nameLabel, priceLabel, typeLabel;
    JTextField nameTextField, priceTextField;
    JComboBox typeComboBox;
    private String[] allType = {"General", "Computer", "Math&Sci", "Photo"};
    JButton insert;

    public BookAdd() {
        BookAddJFrame = new JFrame();
        P1 = new JPanel();
        P2 = new JPanel();
        nameLabel = new JLabel("Name");
        priceLabel = new JLabel("Price");
        typeLabel = new JLabel("Type");
        nameTextField = new JTextField();
        priceTextField = new JTextField();
        typeComboBox = new JComboBox(allType);
        insert = new JButton("Insert");

        P1.setLayout(new GridLayout(3, 2));
        P1.add(nameLabel);
        P1.add(nameTextField);
        P1.add(priceLabel);
        P1.add(priceTextField);
        P1.add(typeLabel);
        P1.add(typeComboBox);
        
        P2.add(insert);
       
        BookAddJFrame.setLayout(new BorderLayout());
        BookAddJFrame.add(P1,BorderLayout.NORTH);
        BookAddJFrame.add(P2, BorderLayout.SOUTH);


        //setFrame
        BookAddJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        BookAddJFrame.setVisible(true);
        BookAddJFrame.setSize(250, 150);
        BookAddJFrame.setLocationRelativeTo(null);
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

    public JButton getInsert() {
        return insert;
    }

    public void setInsert(JButton insert) {
        this.insert = insert;
    }

    public JFrame getBookAddJFrame() {
        return BookAddJFrame;
    }


}
