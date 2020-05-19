package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Display();

        switch (scanner.nextInt()) {
            case (1):
                System.out.println("Въведете колко на брой числа ще въвеждате.");
                int size = scanner.nextInt();
                if (size >= 0 & size <= 10000) {
                    int array[] = new int[size];
                    System.out.println("Въведете числата:");
                    for (int i = 0; i < size; i++) {
                        int x = scanner.nextInt();
                        array[i] = x;
                        System.out.println(i + "-" + array[i]);
                    }
                    System.out.println();
                    System.out.println("Меню с опции:");
                    System.out.println();
                    Display2();
                    switch (scanner.nextInt()) {
                        case 1:
                            System.out.println("Извеждане само на простите числа:");
                            for (int p = 0; p < array.length; p++) {
                                if (array[p] % 2 != 0) {
                                    System.out.println(array[p]);
                                }
                            }
                            break;
                        case 2:
                            int number = 0;
                            int count = 0;
                            for (int i = 0; i < array.length; i++) {
                                int tempnumber = array[i];
                                int tempcount = 0;
                                for (int j = 0; j < array.length; j++) {
                                    if (array[j] == tempnumber)
                                        tempcount++;
                                    if (tempcount > count) {
                                        number = tempnumber;
                                        count = tempcount;
                                    }
                                }
                            }
                            System.out.println("най-често срещан елемент e:\t" + number + " среща се:\t" + count);
                            break;
                        case 3:
                            int temp;
                            boolean sort = false;
                            while (sort == false) {
                                sort = true;
                                for (int i = 0; i < array.length - 1; i++) {
                                    if (array[i] > array[i + 1]) {
                                        ////разменя местата на числата спрямо големината им
                                        temp = array[i + 1];
                                        array[i + 1] = array[i];
                                        array[i] = temp;
                                        sort = false;
                                    }
                                }
                            }
                            System.out.print("{");
                            for (int i = 0; i < array.length - 1; i++) {
                                System.out.print(array[i] + ", ");
                            }
                            System.out.println("}");
                            break;
                        case 4:
                            int temp2;
                            boolean sort2 = false;
                            while (sort2 == false) {

                                sort2 = true;
                                for (int i = 0; i < array.length - 1; i++) {
                                    if (array[i] < array[i + 1]) {
                                        ////разменя местата на числата спрямо големината им
                                        temp2 = array[i + 1];
                                        array[i + 1] = array[i];
                                        array[i] = temp2;
                                        sort2 = false;
                                    }
                                }
                            }
                            System.out.print("{");
                            for (int i = 0; i < array.length - 1; i++) {
                                System.out.print(array[i] + ", ");
                            }
                            System.out.println("}");

                            break;
                        case 5:
                            int a = 1;
                            int b = 0;
                            int value = array[0];
                            for (int i = 1; i < array.length; i++) {
                                a = 1;
                                /////////брояч
                                while (array[i] == array[i - 1]) {
                                    a++;
                                    i++;
                                    if (i == array.length) {
                                    }
                                }
                                if (b < a) {
                                    b = a;
                                    value = array[i - 1];
                                }
                            }
                            System.out.print("{");
                            for (int i = 0; i < b - 1; i++) {
                                System.out.print(value + ", ");
                            }
                            System.out.println(value + "}");
                            break;
                        case 6:

                            //////////////////////////////////

                            break;
                        case 7:
                            break;

                    }
                } else {
                    System.out.println("Въведете ново число");
                }
                break;
                case (2):
                int w;
                System.out.println("Въведете колко на брой думи ще въвеждате:");
                ////задават се думите които се съхраняват в масива
                w = scanner.nextInt();
                String[] words = new String[w];
                for (int counter = 0; w > counter; counter++) {
                    System.out.println("Въведете думa:" + (counter + 1));
                    words[counter] = scanner.next();
                }
                Displayv2();
                switch (scanner.nextInt()) {
                    case 1:
                        //////////
                        break;
                    case 2:
                        //////////
                        break;
                    case 3:
                        ////////////
                        break;
                    case 4:
                        String a[] = words;
                        String element = "";
                        int count = 0;
                        for (int j = 0; j < words.length; j++) {
                            String tempelement = words[j];
                            int tempcount = 0;
                            for (int i = 0; i < words.length; i++) {
                                if (words[i].equals(tempelement))
                                    tempcount++;
                                if (tempcount > count) {
                                    element = tempelement;
                                    count = tempcount;
                                }
                            }
                        }
                        System.out.println("повтарящите се думи ca:\t" + element + "\tпо:" + count);
                        break;
                    case 5:
                        /////////////////
                        break;

                }
            case 3:
                break;

            default:System.out.println("невалидна опция");
        }













    }
//////////////////// Display с опции
    public static void Displayv2(){
        System.out.println("1. Обърнете буквите на думите от масива наобратно и ги визуализирайте в конзолата");
        System.out.println("2. Изведете броя на повтарящите се символи за всяка една от думите в масива");
        System.out.println("3. Изведете броя на символите за всяка една от думите в масива");
        System.out.println("4. Изведете броя на повтарящите се думи от масива");
        System.out.println("5. Връщане назад към основното меню");
    }


    public static void Display2(){

        System.out.println("1. Извеждане само на простите числа от масива");
        System.out.println("2. Извеждане на най-често срещан елемент в масива");
        System.out.println("3. Извеждане на максимална редица от нарастващи елементи в масива");
        System.out.println("4. Извеждане на максимална редица от намаляващи елементи в масива");
        System.out.println("5. Извеждане на максимална редица от еднакви елементи в масива");
        System.out.println("6. Извеждане на последователност от числа от масива, които имат сума\n" +
                "равна на число, генерирано на случаен принцип");
        System.out.println("7. Връщане назад към основното меню");

    }


    public static void Display() {

        System.out.println("1.Работа с числа");
        System.out.println("2.Работа с думи");
        System.out.println("3.Изход от програмата");
    }
}
