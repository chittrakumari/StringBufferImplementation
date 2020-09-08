/*
Demonstrates the append function and also displays the length and capacity after each character is appended.
 */
import java.util.Scanner;
public class appendFunction {
    public static void main(String args[]){

        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        StringBuffer sb=new StringBuffer();

        /*
        It will show the size and capacity after each character is appended.
         */
        for (int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            System.out.println("length of sb ------>"+sb.length()+"Capacity of sb -------->"+sb.capacity());
        }

        //Output:
        System.out.println("Output -------->"+sb);

    }
}




