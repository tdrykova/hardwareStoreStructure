package com.programmersdub.bookstore.start;

import com.programmersdub.bookstore.enums.ConsultResult;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

class MainFrame extends JFrame {

    class MainPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            g.drawRect(10,10,50,50);
        }
    }

    class Snake extends LinkedList<Rectangle> {

    }

     public MainFrame() {
        setBounds(10,10,500,500);
        setVisible(true);
        setFocusable(true);
        add(new MainPanel());
    }
}

public class Main {

    public static void main(String[] args) {

//        JFrame mainFrame = new JFrame();
//        mainFrame.setBounds(10,10,500,500);
//        mainFrame.setVisible(true);

        MainFrame mainFrame = new MainFrame();

    }
}
