/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnm.oaxaca.keep.components;

import java.awt.BorderLayout;
import java.time.LocalDate;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Adrian
 */
public class Note extends JPanel{
    private JTextField inputTitle;
    private JTextArea areaContent;
    private JLabel labelDate;
    
    public Note(String title,String content, String date){
        super();
        initElements(title,content,date);
        configurePanel();
    }
    
    public Note(String title){
        super();
        initElements(title,"",LocalDate.now().toString());
        configurePanel();
    }
    
    private void initElements(String title,String content, String date){
        inputTitle = new JTextField(title);
        areaContent = new JTextArea(content);
        labelDate = new JLabel(date);
        
        //inputTitle.setBorder(BorderFactory.createEmptyBorder());
    }
    
    
    private void configurePanel(){
        setLayout(new BorderLayout());
        add(BorderLayout.NORTH,inputTitle);
        add(BorderLayout.CENTER,areaContent);
        add(BorderLayout.SOUTH,labelDate);
    }
}
