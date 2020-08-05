package Exercise;



import java.util.Scanner;

public class Chapater4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a test 1: ");
        int a = scanner.nextInt();
        System.out.println("Enter b test 2: ");
        int b = scanner.nextInt();
        System.out.println("Enter c test 2: ");
        int c = scanner.nextInt();
        System.out.println("Enter d test 3: ");
        int d = scanner.nextInt();
        System.out.println("Enter f teat 4: ");
        int f = scanner.nextInt();
        System.out.println("Enter e test 5: ");
        int e = scanner.nextInt();
        System.out.println("Enter m test 7: ");
        int m = scanner.nextInt();
        System.out.println("Enter y test 8: ");
        int y = scanner.nextInt();
        System.out.println("Eeter u test 8: ");
        int u = scanner.nextInt();
        System.out.println("Enter k test 10: ");
        int k = scanner.nextInt();


        int total = a+b+c+d+f+e+m+y+u+k;
        int avg = total / 10;
        System.out.println("Total :"+ total);
        System.out.println("Average :" + avg);



    }//main








}//class
