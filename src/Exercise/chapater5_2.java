package Exercise;

import java.util.Scanner;

//1. รับค่า รัศมีวงกลม (r)
//2. หาพื้นที่วงกลม (PI * r *r)
//3. หาเส้นรอง (2 * PI * r)
//4.หาปริมาตรวงกลม (4/3 * PI *r*r*r)
public class chapater5_2 {
    public static final double PT = 3.141;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // รับค่า รัศงมีวงกลม r
        System.out.println("ระบุรัศมีวงลกม (r): ");
        double r = scanner.nextDouble();


        //หาพื้นที่วงกลม
        double area = PT * r * r;
        System.out.println("พื้นที่วงกลม: "+area);

        double x = 2 * PT * r;
        System.out.println("พื้นที่รอบวง:"+x);

        double k = 4/2*PT*r*r*r;
        System.out.println("ปริมาตรสุทธิ"+k);


    }//main

}//
