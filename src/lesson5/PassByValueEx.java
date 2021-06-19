package lesson5;

public class PassByValueEx {
    //truyền theo giá trị
    //Pass-by-value được hiểu là khi thay đổi biến trong hàm
    //thì ngoài hàm sẽ không bị ảnh hưởng.
    //Nó giống như copy giá trị của biến vào biến khác rồi truyền vào hàm.

    public static class Main {
        public static void modify(Foo x, Foo y) {
            x.num += 1;
            y = new Foo(1);
            y.num++;
        }
        public static void main(String[] args) {
            Foo x = new Foo(1);
            Foo y = new Foo(1);
            modify(x, y);
            System.out.println("X: " + x.num); // 2
            System.out.println("Y: " + y.num); // 1
        }
    }
    static class Foo {
        public int num;
        public Foo(int num) {
            this.num = num;
        }
    }
}
