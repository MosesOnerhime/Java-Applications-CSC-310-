/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Date;

/**
 *
 * @author moses
 */
public class timer implements Runnable{

    @Override
    public void run() {
       try{
         for(;;){
             ScrambledGame.jLabel5.setText(new Date().toString());
             Thread.sleep(10);
         }  
       }catch (Exception e) {
    }
}
    
    
}
