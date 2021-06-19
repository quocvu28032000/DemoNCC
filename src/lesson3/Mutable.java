package lesson3;

public class Mutable {
    //để tạo một lớp có thể thay đổi: Phương pháp sửa đổi các giá trị
    // trường Getters và Setters của các đối tượng
    private String name;

    public Mutable() {
    }

    public Mutable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Mutable mutable = new Mutable("vu");
        System.out.println(mutable.getName());

        mutable.setName("nam");
        System.out.println(mutable.getName());
    }
}
