package lesson8;

public class ThrowExceptionEx {
    static void checkAge(int age) {

        //Từ khóa throw được sử dụng để tạo lỗi tùy chỉnh.
        try {
            if (age < 18) {
                throw new tuoiException();
            }
        } catch (tuoiException e) {
            System.out.println("chưa đủ 18 tuổi! ");
        }
    }

    public static void main(String[] args) {
        checkAge(15);
    }
}
