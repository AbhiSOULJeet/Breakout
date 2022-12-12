/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.project.breakout;
import javax.swing.*;

/**
 *
 * @author abhij
 */
public class BreakOut {

    public static void main(String[] args) {
        
        // creates instance of JFrame
        JFrame frame1 = new JFrame("BreakOut");
        GamePlay gamePlay=new GamePlay();
 
        // 400 width and 500 height of frame1
        frame1.setBounds(10, 10, 700, 600);
         
        // uses no layout managers
        
        
        frame1.setResizable(false);
        
        frame1.add(gamePlay);
         
        // makes the frame visible
        frame1.setVisible(true);
        
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
}
