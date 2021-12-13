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
    public class Ejercicio2 {
        public static void main(String[] args) {

            podraCumplir(Arrays.asList(Arrays.asList(2,40,20,5),Arrays.asList(5,110,30,10))).stream().forEach(System.out::println);

        }

    public static List<Boolean> podraCumplir(List<List<Integer>> caso) {
     // Write your code here

   return  caso.stream().map(x ->  (((x.get(2)-x.get(3))*(x.get(0)-1))+x.get(2))>=x.get(1)?true:false).collect(Collectors.toList());    
    }
}