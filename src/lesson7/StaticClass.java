package lesson7;

//public class StaticClass {
//}

class JavaExample{
    private static String str = "BeginnersBook";

    //+ Static class: 1 class chỉ có thể static nếu nó là một class nồng nhau.
    //-static class k cần tham chiếu của lớp bên ngoài.
    //-một static class k thể truy cập các thành viên non-static của lớp ngoài.

    //Static class
    static class MyNestedClass{
        //non-static method
        public void disp() {

            /* Nếu tạo biến str của lớp ngoài non-static
            thì sẽ gặp lỗi biên dịch bởi vì: một lớp tĩnh lồng nhau
            không thể truy cập các thành viên tĩnh của lớp ngoài.
             */
            System.out.println(str);
        }

    }

    public static void main(String args[])
    {
        /* Để tạo phiên bản của lớp lồng nhau,
        không cần cá thể lớp nhưng đối với một lớp lồng nhau thông thường,
        sẽ cần để tạo một thể hiện của lớp bên ngoài trước tiên.
         */
        JavaExample.MyNestedClass obj = new JavaExample.MyNestedClass();
        obj.disp();
    }
}
