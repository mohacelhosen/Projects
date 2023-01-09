package Billing_System;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public abstract class DATABASE {
    public static int count = 1;
    static List<Add_Product> customer_product_list = new ArrayList<>();

    public static void print_out() throws IOException {

        String fileName = "smart"+count+".txt";
        count = ++count;
        File f = new File(fileName);
        PrintWriter pr = new PrintWriter(fileName);
        pr.printf(
                "|-----------------------------------------------------------------|\n" +
                "|                         🛍️Smart Shop🛒                          |\n" +
                "|-----------------------------------------------------------------|\n" +
                "|       Name      |   Code  |  Price  |  QTY  | Discount |  Total |\n" +
                "|-----------------------------------------------------------------|\n");
        for (int i =0; i<customer_product_list.size(); i++) {
            String name =customer_product_list.get(i).getProduct_name();
            int code = customer_product_list.get(i).getProduct_code();
            double price = customer_product_list.get(i).getProduct_price();
            float qty = customer_product_list.get(i).getQTY();
            byte  discount = customer_product_list.get(i).getProduct_discount();
            double total = customer_product_list.get(i).getTotal();
            pr.printf(
                "| %-15s | %-7d | %-7.2f | %-5.2f | %-8d | %-4.2f |\n",name,code,price,qty,discount,total
            );
        }
        pr.println("|-----------------------------------------------------------------|");
        double sum = 0;
        for (int i=0; i<customer_product_list.size(); i++){
            sum = sum + customer_product_list.get(i).getTotal();
        }
        pr.printf("|                                       total  =         %-9.2f |\n", sum);
        pr.println("|-----------------------------------------------------------------|");
        pr.flush();
        pr.close();
    }
}
