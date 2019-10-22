package com.jcourse.guess.view;

import com.jcourse.guess.controller.GuessController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JframeView extends JFrame {
    private JTextField jtfInput;
    private JTextArea jtaOutput;
    GuessController guessController = new GuessController();

    private void createElements(){
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());

        jtfInput = new JTextField();
        jPanel.add(jtfInput, BorderLayout.CENTER);

        JButton btnSubmit = new JButton("Submit");
        jPanel.add(btnSubmit, BorderLayout.EAST);
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaOutput.append(guessController.gameDo(jtfInput.getText())+"\n");
            }
        });

        add(jPanel, BorderLayout.SOUTH);

        jtaOutput = new JTextArea();
        add(jtaOutput);

    }

    public JframeView(){
        setSize(640, 480);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

         createElements();
        setVisible(true);
    }

}
