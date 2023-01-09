package Billing_System;

import java.util.Scanner;
import static Billing_System.DATABASE.customer_product_list;

public abstract class Administration {
    static int code = 0;
    public static int administration(){
        int ch ;

            System.out.println("-----------------------------------");
            System.out.println("|______1) Add the product _________|");
            System.out.println("|______2) Modify the product ______|");
            System.out.println("|______3) Delete the product ______|");
            System.out.println("|______4) View Product ____________|");
            System.out.println("|______5) Back to Main Menu🏬 _____|");
            System.out.print("|______ Enter your choice ");
             ch = new Scanner(System.in).nextInt();
             return ch;

    }
    public static void add(){
        int q;
        do {
            System.out.print("Enter Product Name: ");
            String product_name = new Scanner(System.in).nextLine();
//            System.out.print("⚠️Enter Product Code (Number): ");
            int product_code = ++code;
            System.out.print("Enter Product Price: ");
            double product_price = new Scanner(System.in).nextDouble();
            System.out.print("Enter QTY: ");
            float QTY = new Scanner(System.in).nextFloat();
            System.out.print("Discount for this Product: ");
            byte product_discount = new  Scanner(System.in).nextByte();

            System.out.print("Don't add More(0): ");
            q = new Scanner(System.in).nextInt();

            double total= 0;
            if (product_discount > 0 && product_discount < 100){
                double total_tk = (double) QTY * product_price;
                total = (total_tk -((total_tk/100)*product_discount));
            }else {
                total = QTY * product_price;
            }
            customer_product_list.add(new Add_Product(product_name,product_code,product_price,QTY,product_discount,total));
        }while (q!=0);
    }

    public static void edit(int pCode){
        for (Add_Product Product : customer_product_list) {
            if (Product.getProduct_code() == pCode) {
                System.out.print("Update Product Name: ");
                String name = new Scanner(System.in).nextLine();
                System.out.print("Update Product Price: ");
                double price = new Scanner(System.in).nextDouble();
                System.out.print("Update QTY: ");
                float qty = new Scanner(System.in).nextFloat();
                System.out.print("Update discount for this product: ");
                byte discount = new Scanner(System.in).nextByte();
                Product.setProduct_name(name);
                Product.setProduct_price(price);
                Product.setQTY(qty);
                Product.setProduct_discount(discount);
                Product.setTotal(price*qty);
                System.out.println("Modify successful 🫡");
                break;
            }
        }
    }
    public static void edit(String pName){
        for (int i=0; i< customer_product_list.size(); i++){
            if (customer_product_list.get(i).getProduct_name().equals(pName)){
                System.out.print("New Product Name: ");
                String name = new Scanner(System.in).nextLine();
                System.out.print("New Product Price: ");
                double price = new Scanner(System.in).nextDouble();
                System.out.print("New QTY: ");
                float qty = new Scanner(System.in).nextFloat();
                System.out.print("New discount for this product: ");
                byte discount = new Scanner(System.in).nextByte();
                customer_product_list.get(i).setProduct_name(name);
                customer_product_list.get(i).setProduct_price(price);
                customer_product_list.get(i).setQTY(qty);
                customer_product_list.get(i).setProduct_discount(discount);
                customer_product_list.get(i).setTotal(price*qty);
                System.out.println("Modify successful 🫡");
                break;
            }
        }
    }
    public static void delete(int pCode){
        for(int i=0; i<customer_product_list.size(); i++){
            if (customer_product_list.get(i).getProduct_code()==pCode){
                customer_product_list.remove(customer_product_list.get(i));
                System.out.println("Remove Done! 🫡");
                break;
            }
        }
    }
    public static void delete(String pName){
        for(Add_Product Product: customer_product_list){
            if (Product.getProduct_name().equals(pName)){
                customer_product_list.remove(Product);
                System.out.println("Remove Done! 🫡");
            }
        }
    }

    public  static void display(){
        System.out.println("|-----------------------------------------------------------------|");
        System.out.println("|                         🛍️Smart Shop🛒                          |");
        System.out.println("|-----------------------------------------------------------------|");
        System.out.println("|       Name      |   Code  |  Price  |  QTY  | Discount |  Total |");
        System.out.println("|-----------------------------------------------------------------|");
        for (int i = 0; i<customer_product_list.size(); i++){
            System.out.printf("| %-15s | %-7d | %-7.2f | %-5.2f | %-8d | %-4.2f |\n",
                    customer_product_list.get(i).getProduct_name(),
                    customer_product_list.get(i).getProduct_code(),
                    customer_product_list.get(i).getProduct_price(),
                    customer_product_list.get(i).getQTY(),
                    customer_product_list.get(i).getProduct_discount(),
                    customer_product_list.get(i).getTotal());
        }
        double sum = 0;
        for (int i=0; i<customer_product_list.size(); i++){
            sum = sum + customer_product_list.get(i).getTotal();
        }
        System.out.println("|-----------------------------------------------------------------|");
        System.out.printf("|                                         total  =      %-9.2f |\n",sum);
    }

}
