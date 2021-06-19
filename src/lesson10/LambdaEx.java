package lesson10;

public class LambdaEx {
    //sử dụng biểu thức lambda k tham số.
    //Biểu thức lamda thường dùng đi kèm với functional interface.
    interface myFuntionalInterface {
        void message();
    }

    interface mathCalculator {

    }

    public static void main(String[] args) {
        myFuntionalInterface fi = () ->
                System.out.println("quoc vu");
        fi.message();
    }
}
