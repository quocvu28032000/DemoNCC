package lesson1;

public abstract class Person {
    //là một lớp cha cho tất cả các lớp con
    // cùng bản chất (kiểu, loại, nhiệm vụ của lớp) kế thừa
    public String name;
    public int age;
    public String address;

    //chứa ít nhất 1 phương thức abtract (là phương thức chỉ khai báo,
    //k chứa nội dung bên trong), và phải để public hoặc protected
    // để các lớp con kế thừa.

    //hanh dong kiem tien cua nguoi noi chung
    protected abstract void earnMoney();

    public abstract void move();

}

//lớp con kế thừa abtract class bắt buộc phải hiện thực
// các phương thức abstract của lớp cha
class Student extends Person {
    private String id;
    private float avgGrade;

    //implement method
    @Override
    public void earnMoney() {
        System.out.println("sinh viên kiếm tiền bằng cách đi làm thêm! ");
    }

    @Override
    public void move() {
        System.out.println("sinh viên di chuyển bằng xe máy! ");
    }
}

class Teacher extends Person {
    private int level;
    private double salary;

    @Override
    protected void earnMoney() {
        System.out.println("giáo viên kiếm tiền bằng cách đi dạy học! ");
    }

    @Override
    public void move() {
        System.out.println("giáo viên di chuyển bằng ô tô! ");
    }


    public static void main(String[] args) {
        Person per = new Person() {
            //k thể tạo ra các đối tượng từ abtract class
            //muốn tạo đối tượng phải override (implement)
            @Override
            protected void earnMoney() {
            }

            @Override
            public void move() {
            }
        };

        Person nam = new Student();
        nam.earnMoney();
        System.out.println("----------------");
        Person son = new Teacher();
        son.earnMoney();
    }
}
