/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnm.oaxaca.keep.views;

import com.tecnm.oaxaca.keep.components.Note;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Adrian
 */
public class Window extends JFrame{
    
    private JPanel formPanel;
    private JPanel contentPanel;
    private JTextField inputTitle;
    private JButton buttonAdd;
    
    public Window(){
        setLayout(new BorderLayout());
        configureElements();
        addElements();
        actionButton();
        setLocationRelativeTo(null);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void configureElements(){
        formPanel = new JPanel(new FlowLayout());
        contentPanel = new JPanel(new GridLayout(0, 3, 2, 2));
        inputTitle = new JTextField();
        buttonAdd = new JButton("+");
        
        inputTitle.setColumns(25);
    }
    
    private void addElements(){
        formPanel.add(inputTitle);
        formPanel.add(buttonAdd);
        add(BorderLayout.NORTH,formPanel);
        add(BorderLayout.CENTER,contentPanel);
    }
    
    private void actionButton(){
        buttonAdd.addActionListener((e) -> {
            String title = inputTitle.getText();
            Note note = new Note(title);
            contentPanel.add(note);
            contentPanel.updateUI();
        });
    }
    
}
