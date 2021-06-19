package lesson9;

public class AsynchronizeEx {
//Việc đồng bộ hóa chủ yếu được sử dụng để:
//Để tránh sự can thiệp của luồng khác.
//Để đảm bảo vấn đề nhất quán của chương trình.
    static class Table {
        void printTable(int n) {// method không synchronized
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

    public static class TestSynchronization1 {
        public static void main(String args[]) {
            Table obj = new Table();// tao mot object
            MyThread1 t1 = new MyThread1(obj);
            MyThread2 t2 = new MyThread2(obj);
            t1.start();
            t2.start();
        }
    }
}
