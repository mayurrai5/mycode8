/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycode8;

import java.util.Arrays;

/**
 *
 * @author LENOVO
 */
public class Mycode8 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
  int[] array1 = { 4, 0, 0 };
  int[] array2 = { 3, 10, 5 };
  System.out.println(Arrays.mismatch(array1, array2) + Arrays.compare(array1, array2) + Arrays.equals(array1, array2));
  }
    
}
