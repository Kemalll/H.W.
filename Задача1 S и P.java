package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){

        Scanner aaa= new Scanner(System.in);
        Integer number1, number2, answer,answer2;
        System.out.println("Страна 1# на правоъгълника");
        number1=aaa.nextInt();
        System.out.println("Страна 2# на правоъгълника");
        number2=aaa.nextInt();
        answer = 2*number1 + 2*number2;
         System.out.print("P e =");
         System.out.println(answer);
         answer2 = number1*number2;
                 System.out.print("S e =");
                 System.out.println(answer2);







    }
}
