package Final;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class BookModel {

    private ArrayList books = new ArrayList();
    private Book book = new Book("", 0, "");

    //สร้าง book เปล่า เก็บใน Books ก่อน file จะได้มีอะไรเขียนลงไปเก็บ
    public BookModel() {
        books.add(book);
    }

    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
        }
    }
    public ArrayList getBooks(){
        return books;
    }

    public void setBook(ArrayList books) {
        this.books = books;
    }

    public void loadFile() {
        try ( FileInputStream fin = new FileInputStream("Book.dat");  
                ObjectInputStream in = new ObjectInputStream(fin);) {
            try {
                setBook((ArrayList) in.readObject());
            } catch (Exception e) {
                System.out.print(e);
            }
        } catch (IOException e) {
            System.out.print(e);
        }
    }

    public void saveFile() {
        try ( FileOutputStream fOut = new FileOutputStream("Book.dat");  
                ObjectOutputStream oout = new ObjectOutputStream(fOut);) {
            oout.writeObject(books);
        } catch (IOException e) {
            System.out.print(e);
        }
    }
}
