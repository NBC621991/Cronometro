/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.time;

import java.util.Calendar;

/**
 *
 * @author Mewtwo
 */
public class Time {

    Boolean iniciar = false;
    Boolean pausar = false;
    Boolean reiniciar = false;
    Boolean detener = false;

    long beginTime1, pauseTime1, restarTime1, stopTime1, resultado;

    public long getBeginTime1() {
        return beginTime1;
    }

    public void setBeginTime1(long beginTime1) {
        this.beginTime1 = beginTime1;
    }

    public long getPauseTime1() {
        return pauseTime1;
    }

    public void setPauseTime1(long pauseTime1) {
        this.pauseTime1 = pauseTime1;
    }

    public long getRestarTime1() {
        return restarTime1;
    }

    public void setRestarTime1(long restarTime1) {
        this.restarTime1 = restarTime1;
    }

    public long getStopTime1() {
        return stopTime1;
    }

    public void setStopTime1(long stopTime1) {
        this.stopTime1 = stopTime1;
    }

    public Boolean getIniciar() {
        return iniciar;
    }

    public long getResultado() {
        return resultado;
    }

    public void setResultado(long resultado) {
        this.resultado = resultado;
    }

    public void setIniciar(Boolean iniciar) {
        this.iniciar = iniciar;
    }

    public Boolean getPausar() {
        return pausar;
    }

    public void setPausar(Boolean pausar) {
        this.pausar = pausar;
    }

    public Boolean getReiniciar() {
        return reiniciar;
    }

    public void setReiniciar(Boolean reiniciar) {
        this.reiniciar = reiniciar;
    }

    public Boolean getDetener() {
        return detener;
    }

    public void setDetener(Boolean detener) {
        this.detener = detener;
    }

    public long begin() {

        if (iniciar == true) {

            Calendar beginTime = Calendar.getInstance();
            beginTime1 = beginTime.getTimeInMillis();
            return beginTime1;

        }else{
            
            beginTime1 = 0;
            return beginTime1;
        }

        
    }

    
    public long pause(){
        
            if(pausar == true){
                
            Calendar pauseTime = Calendar.getInstance();
            pauseTime1 = pauseTime.getTimeInMillis();
            
            return pauseTime1;
            
            }else{
                
                pauseTime1 = 0;
                return pauseTime1;
            }
            
        
    }
    
    
    public long restar(){
        
            if(reiniciar == true){
            
            Calendar restarTime = Calendar.getInstance();
            restarTime1 = restarTime.getTimeInMillis();
            return restarTime1;
            
            }else{
             
                restarTime1 = 0;
                return restarTime1;   
            }
            
        
    }
    
    public long stop(){
        
        if(detener == true){
            
            Calendar stopTime = Calendar.getInstance();
            stopTime1 = stopTime.getTimeInMillis();
            return stopTime1;
        }else{
            
            stopTime1 = 0;
            return stopTime1;
        }
            
    }
    
    
   public long operations(long beginTime2, long pauseTime2, long restarTime2, long stopTime2 ){
       
       if(pauseTime2 == 0 && restarTime2 == 0){
           
          resultado = (stopTime2 - beginTime2);
          
          return resultado;
          
       }else{
           
           resultado = (pauseTime2 - beginTime2) + (stopTime2 - restarTime2);
           
           return resultado;
       }
        
       
   }
    
}
