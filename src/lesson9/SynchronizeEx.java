package lesson9;

public class SynchronizeEx {
//Phương thúc đồng bộ được sử dụng để khóa một đối tượng cho bất kỳ tài nguyên được chia sẻ.
//Khi một luồng gọi một phương thức đồng bộ, nó sẽ tự động khóa cho đối tượng đó
// và giải phóng nó khi luồng hoàn thành nhiệm vụ.
    static class Table {
        synchronized void printTable(int n) { // synchronized method
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
            }
        }
    }

    static class MyThread1 extends Thread {
        Table t;

        MyThread1(Table t) {
            this.t = t;
        }

        public void run() {
            t.printTable(5);
        }
    }

    static class MyThread2 extends Thread {
        Table t;

        MyThread2(Table t) {
            this.t = t;
        }

        public void run() {
            t.printTable(100);
        }
    }

    public static class TestSynchronization2 {
        public static void main(String args[]) {
            Table obj = new Table();// tao mot object
            MyThread1 t1 = new MyThread1(obj);
            MyThread2 t2 = new MyThread2(obj);
            t1.start();
            t2.start();
        }
    }
}
