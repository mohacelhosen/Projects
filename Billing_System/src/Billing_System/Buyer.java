package Billing_System;

import java.util.Scanner;

import static Billing_System.DATABASE.customer_product_list;
public abstract class Buyer {
    public static void buyer() {
        if (!customer_product_list.isEmpty()) {
            Administration.display();
            double sum = 0;
            for (int i=0; i<customer_product_list.size(); i++){
                sum = sum + customer_product_list.get(i).getTotal();
            }
            int taken;
                System.out.print("Enter amount taken: ");
                taken = new Scanner(System.in).nextInt();
            while (!(taken >= sum)) {
                System.out.println("Lower than total Amount, plz try again🤖");
                System.out.print("Enter amount taken: ");
                taken = new Scanner(System.in).nextInt();
            }
            double return_money = taken - sum;
            System.out.println("|");
            System.out.printf("|                                           return =   %-9.2f  |\n", return_money);
            System.out.println("|-----------------------------------------------------------------|");
            System.out.println();
        }else {
            System.out.println("Sorry You don't buy any product 😭");
        }
    }
}
