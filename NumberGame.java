package Projects;

import java.util.Scanner;
/***
 Author: Md. Mohacel Hosen
 Facebook: <a href="https://www.facebook.com/md.mohacel.hosen.568/">...</a>
 GitHub: <a href="https://github.com/mohacelhosen">...</a>
 ***/
public class NumberGame {
    public static void main(String[] args) {

        int Final = (int)(Math.random()*15d);
        int count = 0;
        int number = 0;
        int Help = (int)'?';
        String name;
        Scanner input = new Scanner(System.in);

        System.out.println("############   Welcome to the Number Guess Games     ###########");
        System.out.print("Enter your Name: ");
        name = input.nextLine();
        System.out.print("Enter your guess number: ");

        while (number != Final){
            if(number==63){
                System.out.println("🤖Hidden Number "+Final);
                System.out.print("Enter again: ");
            }
            number = input.nextInt();
            count++;
            if (number==Final){
                System.out.println("Congratulation 🫡 "+name);
                System.out.println("You have complete with "+count+" attempts");
            }else{
                if(number > Final){
                    System.out.println("Your guess Number is too High");
                }else{
                    System.out.println("Your Guess number is too Low");
                }
                System.out.println("Wrong Guess 😒");
                System.out.print("Enter again: ");
            }
        }
    }
}
