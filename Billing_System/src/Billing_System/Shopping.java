package Billing_System;

import java.util.Scanner;
public abstract class Shopping {
    public static int shopMenu(){
        String symbol = "-";
        System.out.println(symbol.repeat(36));
        System.out.println("|         🛍️Smart Shop🛒           |");
        System.out.println(symbol.repeat(36));
        System.out.println("|________1) Administration  _______|");
        System.out.println("|________2) Buyer           _______|");
        System.out.println("|________3) EXit            _______|");
        System.out.print("| 🤖Enter your Choice:   ");
        int ch = new Scanner(System.in).nextInt();
        System.out.println(symbol.repeat(36));
        return ch;
    }
}
