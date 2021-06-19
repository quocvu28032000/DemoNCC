package lesson2;

public class Overload {
    //Nạp chồng là kĩ thuật trong Java cho phép 2 hoặc nhiều phương thức có cùng tên
    // nhưng khác tham số(về kiểu, số lượng, thứ tự).

    //phương thức overload với tham số là int
    public static int add(int a, int b) {
        return a + b;
    }

    //phương thức overload với tham số là long
    public static long add(long a, long b) {
        return a + b;
    }

    //phương thức overload với tham số là double
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        //sử dụng phương thức overload
        double sumDouble = add(1.25, 3.45);
        long sumLong = add(12345L, 56789L);
        int sumInt = add(123, 456);
    }
}
