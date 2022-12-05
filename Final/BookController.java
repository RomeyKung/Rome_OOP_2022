package Final;

import javax.swing.*;
import java.awt.event.*;

public class BookController implements ActionListener, WindowListener{

    BookView bookView;
    BookAdd bookAdd;
    BookModel model;
    Book book;
    private int index;

    public BookController() {
        bookView = new BookView();
        model = new BookModel();
        //getAllButtom and TextField
        bookView.BookViewJFrame.addWindowListener(this);
        bookView.getNext().addActionListener(this);
        bookView.getPrev().addActionListener(this);
        bookView.getAdd().addActionListener(this);
        bookView.getUpdate().addActionListener(this);
        bookView.getDelete().addActionListener(this);

        index = Integer.parseInt(bookView.getIndexTextField().getText());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "Add") {
            bookAdd = new BookAdd();
            bookAdd.getInsert().addActionListener(this);
        } else if (e.getActionCommand() == "Insert") {
            //local variable
//            System.out.println("hello boi");
            String name = bookAdd.getNameTextField().getText();
            double price = Double.parseDouble(bookAdd.getPriceTextField().getText());
            String type = (String) (bookAdd.getTypeComboBox().getSelectedItem());
            book = new Book(name, price, type);

            //insert book to ArrayList
            model.addBook(book);
            JOptionPane.showMessageDialog(null, "Done it.", "", JOptionPane.PLAIN_MESSAGE);
            bookAdd.getBookAddJFrame().dispose();

        } else if (e.getActionCommand() == ">>>" && index + 1 < model.getBooks().size()) {
            index++;
            String name = ((Book) (model.getBooks().get(index))).getName();
            String Price = ((Book) (model.getBooks().get(index))).getPrice() + "";
            String type = ((Book) (model.getBooks().get(index))).getType();

            bookView.getNameTextField().setText(name);
            bookView.getPriceTextField().setText(Price);
            bookView.getTypeComboBox().setSelectedItem(type);
            bookView.getIndexTextField().setText(index + "");

        } else if (e.getActionCommand() == "<<<" && (index - 1) >= 0) {
//            System.out.println("123");
            index--;
            if (index == 0) {
                bookView.getNameTextField().setText("");
                bookView.getPriceTextField().setText("");
                bookView.getTypeComboBox().setSelectedItem("General");
                bookView.getIndexTextField().setText(index + "");
            } else {
                String name = ((Book) (model.getBooks().get(index))).getName();
                String Price = ((Book) (model.getBooks().get(index))).getPrice() + "";
                String type = ((Book) (model.getBooks().get(index))).getType();

                bookView.getNameTextField().setText(name);
                bookView.getPriceTextField().setText(Price);
                bookView.getTypeComboBox().setSelectedItem(type);
                bookView.getIndexTextField().setText(index + "");
            }

        } else if (e.getActionCommand() == "Update" && index != 0) {
            String name = bookView.getNameTextField().getText();
            double price = Double.parseDouble(bookView.getPriceTextField().getText() + "");
            String type = (String) (bookView.getTypeComboBox().getSelectedItem());

            book = new Book(name, price, type);
            model.getBooks().set(index, book);
            JOptionPane.showMessageDialog(null, "Done it.", "Update", JOptionPane.PLAIN_MESSAGE);

        } else if (e.getActionCommand() == "Delete" && index != 0) {
            model.getBooks().remove(index);
            index--;
            if (index == 0) {
                bookView.getNameTextField().setText("");
                bookView.getPriceTextField().setText("");
                bookView.getTypeComboBox().setSelectedItem("General");
                bookView.getIndexTextField().setText(index + "");
            } else {
                String name = ((Book) (model.getBooks().get(index))).getName();
                String Price = ((Book) (model.getBooks().get(index))).getPrice() + "";
                String type = ((Book) (model.getBooks().get(index))).getType();

                bookView.getNameTextField().setText(name);
                bookView.getPriceTextField().setText(Price);
                bookView.getTypeComboBox().setSelectedItem(type);
                bookView.getIndexTextField().setText(index + "");
            }
            JOptionPane.showMessageDialog(null, "Done it.", "Delete", JOptionPane.PLAIN_MESSAGE);
        }

    }

    public void windowOpened(WindowEvent e) {model.loadFile();}

    public void windowClosing(WindowEvent e) {model.saveFile();}

    public void windowClosed(WindowEvent e) {}

    public void windowIconified(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }

    public static void main(String[] args) {
        new BookController();
    }
}
