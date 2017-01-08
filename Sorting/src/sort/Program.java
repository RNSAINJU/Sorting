/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sort;
import array.ArrayHelper;
import java.util.Scanner;
/**
 *
 * @author Demon
 */
public class Program {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       int[] numbers={75,45,54,78,55,65};
       
       ArrayHelper helper=new ArrayHelper();
       helper.simpleSort(numbers, true);
       for(int i=0; i<numbers.length;i++){
           System.out.println(numbers[i]);
       }
       }
    }
    

