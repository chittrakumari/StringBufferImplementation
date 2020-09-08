/*
To show the length and capacity function implementation of String Buffer class.
 */

import java.util.Scanner;
public class lengthAndCapacityFunction {


        public static void main(String args[]){
            StringBuffer sb=new StringBuffer();//an object is created of size 6
            StringBuffer sb1=new StringBuffer(20);//an object is created having capacity as 20.
            Scanner obj=new Scanner(System.in);
            String s=obj.nextLine();
            StringBuffer sb3=new StringBuffer(s);


            System.out.println("length of sb ------>"+sb.length()+"Capacity of sb -------->"+sb.capacity());
            System.out.println("length of sb ------>"+sb1.length()+"Capacity of sb -------->"+sb1.capacity());
            System.out.println("length of sb ------>"+sb3.length()+"Capacity of sb -------->"+sb3.capacity());
        }
    }


