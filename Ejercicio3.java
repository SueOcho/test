/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author JosueFlores
 */
public class Ejercicio3 {

    
    public static void main(String[] args) {
        maximoNumeroHoras(Arrays.asList( Arrays.asList(2,4,2),Arrays.asList(3,16,8))).forEach(System.out::println);
    }
            
    public static List<Integer> maximoNumeroHoras(List<List<Integer>> equipo)
    {
     // Write your code here
       return equipo.stream().map(x-> (x.get(0)*x.get(1))-((x.get(0)-1)*x.get(2))).collect(Collectors.toList());
        
     }

  }


