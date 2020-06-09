package com.company;


public class Main {
    public static void main(String[] args) {
        Machien Mach1=new Machien(95,55,"Blue");
        Machien Mach2=new Machien();


       Person Person1=new Person("Крум");                   //Задаваре специфики
       Person Person2=new Person();

          Engine Eng1=new Engine(80);
          Engine Eng2=new Engine();

          WrapperEngine WE1=new WrapperEngine(55);
          WrapperEngine WE2=new WrapperEngine();

          ProductionEngine PE1=new ProductionEngine(15);
          ProductionEngine PE2=new ProductionEngine();

          HeatEngine HE1=new HeatEngine(88);
          HeatEngine HE2=new HeatEngine();


          print(Mach1,Person1,Eng1,WE1,PE1,HE1);                      //Извежда характеристиките
          print(Mach2,Person2,Eng2,WE2,PE2,HE2);

          int Machines=2;
          int Arra[]=new int[Machines];                               //Масив с всички машини и тяхната Мощност
          Arra[0]=Mach1.power;
          Arra[1]=Mach2.power;
        System.out.println("Moщностa на всички машини:");

          for(int i=0;i<Arra.length;i++){
              System.out.println("Moщност:"+Arra[i]);
          }

    }


    public static void print(Machien Mach,Person Person,Engine Eng,WrapperEngine WE,ProductionEngine PE,HeatEngine HE){
        System.out.println("****************************************");
        System.out.println("    Характеристика на машината:");
        System.out.println("         ***************");
        System.out.printf("Количество еденици които произвежда: %d%n",Mach.power);
        System.out.printf("Нагрятa на: %d%n",Mach.height);
        System.out.printf("Цвят:%s%n",Mach.color);
        System.out.printf("Име:%s%n",Person.name);
        System.out.printf("Moщност:%d%n",Eng.power);
        System.out.printf("Идея си нямам какво е (WrapperEngine):%s%n ",WE.power);
        System.out.printf("ProductionEngine: %d%n",PE.power);
        System.out.printf("Прегрят на: %d%n",HE.power);
        System.out.println("========================================");
    }
   }
















