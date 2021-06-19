package lesson3;

class StringEx {
    //String là không thể thay đổi (immutable), và không cho phép có class con.
    //String là một class, vì vậy nó có thể được tạo ra thông qua toán tử new.
    //String object = new String("Hello World");

    //về tính nguyên thủy: Chúng ta có thể khai báo: String s1 = "Hello word"
    //cũng có thể sử dụng toán tử + để nối 2 string

    String s1 = "Hello";
    String s2 = "Hello";
    String s3 = s1;
    String s4 = new String("Hello");
    String s5 = new String("Hello");

    public static void main(String[] args) {
        StringEx stringEx = new StringEx();
        System.out.println(stringEx.s1.equals(stringEx.s3));
        System.out.println(stringEx.s1.equals(stringEx.s4));
        System.out.println(stringEx.s4.equals(stringEx.s5));
    }
}
