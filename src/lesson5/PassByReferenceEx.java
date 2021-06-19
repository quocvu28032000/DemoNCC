package lesson5;

public class PassByReferenceEx {
    //Pass-by-reference là khi bạn thay đổi biến trong hàm
    //cũng làm ngoài hàm bị ảnh hưởng.
    //Nó giống như bạn truyền đúng địa chỉ của biến đó vào hàm.

    public static class Main {
        public static void modify(int x, int y) {
            x = 100;
            y = 200;
            System.out.println("X - Y from modidy: " + x + " - " + y);
        }
        public static void main(String[] args) {
            int x = 1;
            int y = 2;
            System.out.println("X - Y before modidy: " + x + " - " + y);

            modify(x, y);
            System.out.println("X - Y after modidy: " + x + " - " + y);
        }
    }
}
