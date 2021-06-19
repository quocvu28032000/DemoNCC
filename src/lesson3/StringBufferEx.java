package lesson3;

public class StringBufferEx {


    //StringBuffer, StringBuilder có thể thay đổi (mutable)

    public static void main(String[] args) {
        //StringBuilder hiệu quả hơn StringBuffer.

        StringBuffer stringBuffer = new StringBuffer("vu");
        // không thể có 2 luồng cùng truy cập phương thức của lớp StringBuffer đồng thời.

        StringBuilder stringBuilder = new StringBuilder("nguyen");
        // có 2 luồng cùng truy cập phương thức của lớp StringBuilder đồng thời.

        stringBuffer.append("quoc");
        System.out.println(stringBuffer);

        stringBuilder.append("nam");
        System.out.println(stringBuilder);

        stringBuffer.delete(2,3);
        System.out.println(stringBuffer);

        stringBuilder.insert(6,4);
        System.out.println(stringBuilder);
    }
}