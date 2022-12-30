package org.nexttech.club;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op;
        do{
            op = Information.show();
            switch (op){
                case 1:
                    Information.Add();
                    break;
                case 2:
                    Information.Display();
                    break;
                case 3:
                    Information.Search();
                    break;
                case 4:
                    Information.Delete();
                    break;
                case 5:
                    Information.Update();
                    break;
                case 0:
                    System.out.println("Thank you for choosing us🙂");
                    break;
                default:
                    System.out.println("Wrong Input❌");
            }
        }while (op!=0);


    }
}