/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author JosueFlores
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        
        calcularMaximoRetorno(Arrays.asList("RUULLLDDDR","RRRRRR")).stream().forEach(System.out::println);
        
    }
   
    
    
    public static Integer calcularNumeroMax(String  instrucciones) {                   
    Integer numInstrucciones=instrucciones.length();
    Integer puntoPartida=numInstrucciones+1;
    List<Integer> listaDistancia= new ArrayList();
    char[] valores = instrucciones.toCharArray();
    
      Integer x=puntoPartida;
      Integer y=puntoPartida;              
      Integer xnuevo=0;
      Integer ynuevo=0;
      
        for (int i = 0; i < numInstrucciones; i++) {
            if(valores[i]=='U'){  
                ynuevo=y-1;
                xnuevo=x;
               listaDistancia.add(Math.abs(puntoPartida-xnuevo)+Math.abs(puntoPartida-ynuevo));
                x=xnuevo;
                y=ynuevo;
                
            }
            if(valores[i]=='R'){
                ynuevo=y;
                xnuevo=x+1;
               listaDistancia.add(Math.abs(puntoPartida-xnuevo)+Math.abs(puntoPartida-ynuevo));
                x=xnuevo;
                y=ynuevo;                
            }
            if(valores[i]=='D'){
                ynuevo=y+1;
                xnuevo=x;
               listaDistancia.add(Math.abs(puntoPartida-xnuevo)+Math.abs(puntoPartida-ynuevo));
                x=xnuevo;
                y=ynuevo;                                            
            }
            if(valores[i]=='L'){
                ynuevo=y;
                xnuevo=x-1;
               listaDistancia.add(Math.abs(puntoPartida-xnuevo)+Math.abs(puntoPartida-ynuevo));
                x=xnuevo;
                y=ynuevo;                
                            
            }               
            
            
        }
        return Collections.max(listaDistancia);
 }

    
    public static List<Integer> calcularMaximoRetorno(List<String> instruccion) {
        // Write your code here
        return instruccion.stream().map(x-> calcularNumeroMax(x)).collect(Collectors.toList());         
     }
}