/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largest;
import java.util.Scanner;
/**
 *
 * @author kamalika
 */
public class Largest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner (System.in);
        System.out.println("enter a and b values");
        int a =obj.nextInt();
        int b =obj.nextInt();
        if(a>b)
            System.out.println("a is greater");
        else
            System.out.println("b is greater");
    }
    
}
