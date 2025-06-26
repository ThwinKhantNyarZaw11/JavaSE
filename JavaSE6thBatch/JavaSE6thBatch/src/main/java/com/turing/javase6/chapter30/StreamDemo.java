/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase6.chapter30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author macbook
 */
public class StreamDemo {
    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4,5};
        Stream<Integer> stream = Arrays.stream(arr);
        
        Predicate<Integer> isEven= (n)->n%2==0;
        Stream<Integer> result = stream.filter(isEven);
        
        result.forEach(System.out::println);
        
        ArrayList<Integer> result2 = new ArrayList<>();
        for(Integer item : arr)
        {
            if(isEven.test(item))
            {
                result2.add(item);
            }
        }
    }
}
