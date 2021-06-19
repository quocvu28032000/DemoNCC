package lesson8;

public class TryCatch {

    public static class Main {

        //Câu lệnh try cho phép xác định một khối mã được kiểm tra lỗi
        // trong khi nó đang được thực thi.

        // Câu lệnh catch cho phép xác định một khối mã sẽ được thực thi,
        // nếu có lỗi xảy ra trong khối try.
        public static void main(String[] args) {
            try {
                int[] myNumbers = {1, 2, 3};
                System.out.println(myNumbers[10]);
            } catch (Exception e) {
                System.out.println("đã xảy ra lỗi.");
            }
        }
    }
}
