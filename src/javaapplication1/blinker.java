/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author moses
 */
public class blinker implements Runnable {

    @Override
    public void run() {
        try{
         for(;;){
             ScrambledGame.jLabel5.setForeground(Color.red);
             Thread.sleep(500);
             ScrambledGame.jLabel5.setForeground(Color.black);
             Thread.sleep(500);
         }
         }catch (Exception e){}
    }
    
}