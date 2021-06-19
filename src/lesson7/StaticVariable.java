package lesson7;

//public class StaticVariable {
//}

//Java Program to demonstrate the use of static variable
//class Student {
//    int rollno;//instance variable
//    String name;
//    static String college = "IT";//static variable
//
//    //constructor
//    Student(int r, String n) {
//        rollno = r;
//        name = n;
//    }
//
//    //method to display the values
//    void display() {
//        System.out.println(rollno + " " + name + " " + college);
//    }
//}
//
////Test class to show the values of objects
//public class StaticVariable {
//    public static void main(String args[]) {
//        Student s1 = new Student(111, "Karan");
//        Student s2 = new Student(222, "Aryan");
//        //we can change the college of all objects by the single line of code
//        //Student.college="BBDIT";
//        s1.display();
//        s2.display();
//    }
//}

// Java program demonstrate execution of static blocks and variables

import java.util.*;

public class StaticVariable
{
    // static variable: : Biến static có thể được sử dụng để tham chiếu
    // đến thuộc tính chung của tất cả các đối tượng
    static int j = n();

    // static block
    static {
        System.out.println("Inside the static block");
    }

    // static method: Một static method có thể được truy cập
    // mà không cần tạo một đối tượng của lớp trước.
    static int n() {
        System.out.println("from n ");
        return 20;
    }

    // static method(main !!)
    public static void main(String[] args)
    {
//        StaticVariable staticVariable = new StaticVariable();
//        staticVariable.n();
        System.out.println("Value of j : "+j);
        System.out.println("Inside main method");
    }
}
