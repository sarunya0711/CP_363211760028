package Leb2;

import java.util.Scanner;

public class Basiclnput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter you name ?;");
        String name = scanner.nextLine();

        System.out.println("your name is " + name);

        System.out.println("อายุเท่่าไร ?: ");
        int age = scanner.nextInt();

        System.out.println("Enter you naick name ?: ");
        String nickName = scanner.nextLine();
        System.out.println("Your naick name is "+name);


    }//main

}//class
