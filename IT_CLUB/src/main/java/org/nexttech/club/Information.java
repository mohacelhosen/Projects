package org.nexttech.club;

import java.util.Scanner;


public class Information extends DataModification{

    public static int show(){
        System.out.println("1. Add 📝");
        System.out.println("2. Display 📋");
        System.out.println("3. Search 🔍");
        System.out.println("4. Delete ☠️");
        System.out.println("5. Update 🫡");
        System.out.println("0. EXIT 🕳️");
        System.out.print("Enter your choice🤖: ");
        return new Scanner(System.in).nextInt();
    }
    public static void Add(){
        System.out.print("Enter your name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Enter your ID: ");
        int id = new Scanner(System.in).nextInt();
        System.out.print("Enter your Department: ");
        String Department = new Scanner(System.in).nextLine();
        sa.add(new Students(name,id,Department));

    }
    public static void Display(){
        String design ="-";
        System.out.println(design.repeat(63));
        for (Students student : sa) {
//            System.out.println(sa.get(i).getName()+"  "+sa.get(i).getId()+"  "+sa.get(i).getDepartment());
            System.out.printf("%-15s %04d %7s\n", student.getName(), student.getId(), student.getDepartment());
        }
        System.out.println(design.repeat(63));
    }
    public static void Search(){
        System.out.print("Enter your ID: ");
        int id = new Scanner(System.in).nextInt();
        String design ="-";
        System.out.println(design.repeat(63));
        if (sa.isEmpty()){
            System.out.println("ID not Found😥");
        }
        for (Students student : sa) {
            if (student.getId() == id) {
                System.out.println(student.getName() + "  " + student.getId() + "  " + student.getDepartment());
            }else {
                System.out.println("ID not Found😥");
            }
        }
        System.out.println(design.repeat(63));
    }
    public static void Delete(){
        System.out.print("Enter your ID: ");
        int id =new Scanner(System.in).nextInt();
        for (int i=0; i<sa.size(); i++){
            if (id==sa.get(i).getId()){
                sa.remove(i);
                System.out.println("☠️ Remove successfully ☠️");
                break;
            }
        }
    }
    public static void Update(){
        System.out.print("Enter your ID: ");
        int id =new Scanner(System.in).nextInt();
        if (sa.isEmpty()){
            System.out.println("ID not Found😥");
        }
        for (int i=0; i<sa.size(); i++){
            if (id==sa.get(i).getId()){
                System.out.print("Enter your New_Name: ");
                String name = new Scanner(System.in).nextLine();
                System.out.print("Enter your NEW_ID: ");
                id = new Scanner(System.in).nextInt();
                System.out.print("Enter your New_Department: ");
                String Department = new Scanner(System.in).nextLine();
                sa.set(i,new Students(name,id,Department));
                System.out.println("Update successful👌");
                break;
            }else {
                System.out.println("ID not Found😥");
            }
        }
    }
}
