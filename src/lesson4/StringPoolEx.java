package lesson4;

public class StringPoolEx {
    //String pool là một vùng nhớ đặc biệt nằm trong vùng nhớ Heap (Heap memory),
    //dùng để lưu trữ các biến được khai báo theo kiểu String.
    String st1 = "abc";
    String st2 = "abc";
    String st3 = new String("abc");
//khai báo biến thì sẽ lưu lại ở trong pool ->trả về true
//khai báo đối tượng thì sẽ lưu ở vùng nhớ khác ->trả về falde

    public static void main(String[] args) {
        StringPoolEx stringPoolEx = new StringPoolEx();
        System.out.println(stringPoolEx.st1 == stringPoolEx.st2);
        System.out.println(stringPoolEx.st1 == stringPoolEx.st3);
    }

}
