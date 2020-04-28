package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the obstacle? :");
        String obstacle = scanner.next();
        String movement = "";
        switch (obstacle) {
            case "wall":
                movement = "Go sideway\n";
                break;
            case "chair":
                movement = "Jump\n";
                break;
            case "nothing":
                movement = "Go forward\n";
                break;
            default:
                movement = "Surrounded the object\n\n";
                break;
        }
        System.out.printf("movement: %s\n", movement);
        {
            {
                Scanner pix = new Scanner(System.in);
                int izmerenie;
                System.out.println("dimension");
                izmerenie = pix.nextInt();
                if (izmerenie % 2 == 0) {
                    System.out.print("target detected\n");
                    for(int hits=4;hits>=1;hits--)
                        System.out.println("Hits"+ hits);
                    {
                        Random n = new Random();
                        int num;
                        num = 1 + n.nextInt(10);
                        if(num == 5) {
                            System.out.print("OPS!Broken furniture\n");
                        }
                        else {
                            System.out.print("Accurate hit\n");
                        }
                    }
                } else {
                    System.out.print("nothing detected\n");
                }
                {
                    {
                        System.out.print("Seeking for electricity:");
                        for(int i = 0; i < 1;) {
                            Random I = new Random();
                            int number1, number2;
                            number1 = 1 + I.nextInt(1000);
                            number2 = 1 + I.nextInt(1000);
                            if(number1 > number2) {
                                System.out.print("Found\n");
                                i++;
                            }
                            else if ( number2 > number1) {
                                System.out.print("Don't have electricity\n");
                                i++;
                            }
                        }
                    }
                    System.out.print("Display:");
                    Random number=new Random();
                    int numb;
                    int a=10;
                    numb=1+number.nextInt(10);
                    if(numb % 2 == 0){
                        while (a>=1){System.out.print(a--);
                        }
                        System.out.println(" I am a Robottttt:"+numb);
                    } else{
                        while (a>=1){System.out.print(a--);
                        }
                    }
                }
            }
        }
    }
}


