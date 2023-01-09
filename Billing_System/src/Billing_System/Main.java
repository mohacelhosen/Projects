package Billing_System;

import java.io.IOException;
import java.util.Scanner;

import static Billing_System.DATABASE.customer_product_list;

class Main{
    public static void main(String[] args) throws IOException {
        int option ;
        do {
            option = Shopping.shopMenu();
            switch (option){
                case 1:{
                    int nch;
                    do {
                        nch = Administration.administration();
                        if (nch==5) break;
                        switch (nch){
                            case 1:
                                Administration.add();
                                break;
                            case 2:
                                System.out.print("Enter product code: ");
                                int pCode = new Scanner(System.in).nextInt();
                                Administration.edit(pCode);
                                break;
                            case 3:
                                System.out.print("Enter product code: ");
                                int PCode = new Scanner(System.in).nextInt();
                                Administration.delete(PCode);
                                break;
                            case 4:
                                Administration.display();
                                break;
                            case 5:
                                Shopping.shopMenu();
                                break;
                            default:
                                System.out.println("Invalid Input ❌");
                        }
                    }while (nch!=5);
                    break;}
                case 2:{
                    Buyer.buyer();
                    if (customer_product_list.isEmpty()){
                        break;
                    }
                    System.out.print("Print Out(p): ");
                    char PrintOut = new Scanner(System.in).next().charAt(0);
                    if (PrintOut=='p'){
                        DATABASE.print_out();
                        customer_product_list.clear();
                    }
                    break;}
                case 3:
                    break;
                default:
                    System.out.println("Invalid Input ❌");
            }
        }while (option!=3);
    }
}