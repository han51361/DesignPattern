package Decorate;

import java.util.Scanner;

public class XonminCoffee {

    public static void main(String args[]){
        int num;
        String size;
        Scanner sc= new Scanner(System.in);

        System.out.println("어서오시게 뭐로 드릴까");
        System.out.println("1 : Cold Brew ");
        System.out.println("2 : Espresso");
        num = sc.nextInt();
        System.out.println("사이즈는 뭐로 드릴까");
        size = sc.next();
        switch (num){
            case 1 :
                int a;
                Beverage beverage = new ColdBrew();
                beverage.setSize(size);
                System.out.println("샷 추가해드려?");
                System.out.println("Yes: 1 , No : 2");
                a = sc.nextInt();
                if(a == 1){
                    beverage = new Shot(beverage);
                    System.out.println(beverage.getDescription()+":"+beverage.cost()+"원이여");
                }else if(a ==2){
                    System.out.println(beverage.getDescription() + beverage.cost()+"원이여");
                }
                System.out.println("맛나게 묵어요");
                break;
            case  2:
                int b;
                Beverage beverage2 = new Espresso();
                beverage2.setSize(size);

                System.out.println("샷 추가해드려?");
                System.out.println("Yes: 1 , No : 2");
                a = sc.nextInt();
                if(a == 1){
                    beverage2 = new Shot(beverage2);

                    System.out.println(beverage2.getDescription()+":"+beverage2.cost()+"원이여");
                }else if(a ==2){
                    beverage2.cost();
                    System.out.println(beverage2.getDescription() + beverage2.cost+"원이여");
                }
                System.out.println("맛나게 묵어요");
                break;
        }



    }



}
