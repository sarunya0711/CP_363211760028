package Leb2;

public class MyVariable {

    public static void main(String[] args) {

     //integer
      int x; // ประกาศตัวแปร     ป  สำหรับเก็บข้อมูลจำนวนเต็ม
        x=10;
      System.out.println(x); // แสดงผลค่าตัวแปร x
        int y = 20;
        int z = x+y;
        System.out.println(x+y); // output ?
        System.out.println(z);// output ?
        //real number (จำนวนจริง)
        //float
        float a =10.10f;
        double b = 20;
        System.out.println(a);
        System.out.println(b);


        //character
        char c= '#';
        System.out.println(c);

        //boolean
        boolean w = true;
        boolean r = false;
        System.out.println(w);
        System.out.println(r);


        //String ตัวแปรชนิด String จะเป๋น class ในภาษา Java
       String msg = "Hello World";
       int len = msg.length();
       System.out.println(len);
       System.out.println(msg.length());
       System.out.println(msg.toUpperCase());

      String u ="RUTS";
      String con = msg + u; // + คือการต่อข้อความ
      System.out.println(con);
      System.out.println(msg.concat(u));// concat () เป็นเมธอดสำหรับการต่อข้อความ



    }//main

}//class
