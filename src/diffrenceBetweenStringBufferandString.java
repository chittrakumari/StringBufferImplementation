/*
To demonstrate  the difference between String and StringBuffer class.
 */
import java.util.Scanner;
public class diffrenceBetweenStringBufferandString {
    public static void main(String args[]) {

        StringBuffer obj1 = new StringBuffer("Chittra");
        StringBuffer obj2=obj1;
        String obj3=new String("Chittra");
        String obj4=obj3;

        System.out.println("Intial Output:");
        System.out.println("obj1---------> "+obj1);
        System.out.println("obj2----------> "+obj2);
        System.out.println("obj3---------->"+obj3);
        System.out.println("obj4----------->"+obj4);

        //we are making changes in the objects made of string and string buffer class.

        obj3=obj3.replace("t","z");
        obj1=obj1.replace(3,5,"z");

        /*
     We will see that if we are making changes in the object of string buffer i.e obj1 it is also reflected
     in obj2 as we equalized obj2 and obj1 ,as we know String Buffer class is mutable whereas
     if we are making changes in the object of string i.e obj3 it is not reflected in obj4 as String class
     is immutable.
         */
        System.out.println();
        System.out.println("Output to see have the changes have occured or not:");
        System.out.println("obj1---------> "+obj1);
        System.out.println("obj2----------> "+obj2);
        System.out.println("obj3---------->"+obj3);
        System.out.println("obj4----------->"+obj4);


    }
}
