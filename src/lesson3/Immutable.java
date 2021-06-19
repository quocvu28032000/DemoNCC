package lesson3;

public class Immutable {
    //để tạo một lớp không thay đổi: final được khai báo là lớp không thể được mở rộng.
    private final String name;

    public Immutable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Immutable immutable = new Immutable("VU");
        System.out.println(immutable.getName());

        //k có setters của đối tươg, k thể thay đổi
        //Nó chỉ hỗ trợ phương thức get () để truyền giá trị của đối tượng.
    }
}
