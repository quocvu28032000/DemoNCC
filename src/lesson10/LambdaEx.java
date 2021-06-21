package lesson10;

public class LambdaEx {
    //Biểu thức Lambda cung cấp một cách rõ ràng và ngắn ngọn
    //để đại diện cho một phương thức interface sử dụng một biểu thức.
    //Biểu thức lamda thường dùng đi kèm với functional interface.
    //Một interface chỉ có MỘT phương thức trừu tượng được gọi là Functional Interface.
    interface myFuntionalInterface {
        void message();
    }

    interface Sayable {
        public String say(String word);
    }

    interface Operation {
        public int add(int a, int b);
    }

    //sử dụng biểu thức lambda
    public static void main(String[] args) {
        myFuntionalInterface fi = () -> {
            System.out.println("quoc vu");
        };
        fi.message();

        Sayable s = (word) -> {
            return word;
        };
        System.out.println(s.say("Meo meo!"));
        // phải sử dụng từ khóa return khi biểu thức lambda chứa nhiều câu lệnh.

        //sử dụng return trog biểu thức
        Operation operation = (a, b) -> {
            return a + b;
        };
        System.out.println("a + b = " + operation.add(10, 20));

        //k sử dụng return
        Operation add1 = (a, b) -> (a + b);
        System.out.println(add1.add(10, 20));
    }
}
