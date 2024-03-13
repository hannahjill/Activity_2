/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity2;

import java.util.Arrays;

/**
 *
 * @author DOTA 2
 */
public class Activity2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    int[] array = {9, 2, 5, 10, 30};
    
        System.out.println("Elements of the Array:");
        System.out.println("First Array Element: " + array[0]);
        System.out.println("Second Array Element: " + array[1]);
        System.out.println("Third Array Element: " + array[2]);
        System.out.println("Fourth Array Element: " + array[3]);
        System.out.println("Fifth Array Element: " + array[4]);
    
    int sum = Arrays.stream(array).sum();
        System.out.println("\nSum of the array elements: " + sum);
    
    int max = Arrays.stream(array).max().getAsInt();
            System.out.println("Maximum value in the array: " + max);

          
            
            
            
    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
