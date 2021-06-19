package lesson7;

//public class StaticMethod {
//}
//Các phương thức được khai báo là static có thể có các hạn chế sau:
//Họ chỉ có thể gọi trực tiếp các static method khác.
//Họ có thể truy cập dữ liệu static trực tiếp.

//+ static method có thể được gọi mà không cần tạo đối tượng.
//+ public methods phải được gọi bằng cách tạo các đối tượng.
public class StaticMethod {
    //static method
    static void myStaticMethod() {
        System.out.println("static method can be called without creating objects");
    }

    //public method
    public void myPublicMethod() {
        System.out.println("public methods must be called by creating objects");
    }

    //main method
    public static void main(String[] args) {
        System.out.println("-------------");

        myStaticMethod(); // call the static method
        // myPublicMethod(); :this would output an error

        System.out.println("-------------");

        StaticMethod staticMethod = new StaticMethod();
        staticMethod.myPublicMethod(); // call the public method

        System.out.println("-------------");
    }
}





