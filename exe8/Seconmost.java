/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seconmost;
import java.util.Scanner;
/**

 * @author kamalika
 */
public class Seconmost {
static  int NOOFCHARS = 256;
 static char getsecondmostfreq(String str1) {

  int[] ctr = new int[NOOFCHARS];
  int i;
  for (i = 0; i < str1.length(); i++)
        
     System.out.println((ctr[str1.charAt(i)]) ++);

  int first = 0, second = 0;
  for (i = 0; i < NOOFCHARS; i++) {
   if (ctr[i] > ctr[first]) {
    second = first;
    first = i;
   } else if (ctr[i] > ctr[second] && ctr[i] != ctr[first])
    second = i;
  }
  return (char) second;
 }
 public static void main(String[] args) {
     Scanner obj=new Scanner(System.in);
  String str1 = obj.nextLine();
  System.out.println("The given string is: " + str1);
  char res = getsecondmostfreq(str1);
  if (res != '\0')
   System.out.println("The second most frequent char in the string is: " + res);
  else
   System.out.println("No second most frequent character found in the string.");
 }

 }
   
   
