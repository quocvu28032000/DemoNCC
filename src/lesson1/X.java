package lesson1;

//đc hiểu là lớp nền, mọi thứ do LTV xây dựng trên nền móng có sẵn.
//interface là một kiểu tham chiếu trong Java.
public interface X {
    //mặc định có public static final
    public static final int n = 10;

    //mặc định phương thức là public abstract
    public abstract void doSomeThinh();

    //giống với abstract class:vẻ
    //chứa abstract method.
    //k tạo đc đối tượng.
    //dùng cho các lớp khác extends hoặc implements.
    //khác nhau:
          //Abstract class:
    //Có thể kế thừa từ một lớp và thực hiện nhiều interface
    //Có thể có các phương thức hoàn thiện
    //override, mô tả đối tượng
    //Có hàm tạo, hàm hủy
         //Interface:
    //K thể kế thừa từ lớp nào cả, có thể thực hiện nhiều interface
    //Tất cả các phương thức đều k có nội dung
    //Not override, mô tả hành động
    //Không thể có hàm tạo, hàm hủy
}

interface Drawable {
    void Draw(); //vẽ

    void Arase(); //tẩy xóa
}

interface Movable {
    void up(); //di chuyển lên

    void down(); //di chuyển xuống
}

//một interface có thể kế thừa từ 1 hoặc nhiều interface khác qua keyword extends.
interface ShapeDrawer extends Drawable, Movable {
    void moveIn(); //di chuyển vào

    void moveOut(); //di chuyển ra
}

//Một lớp chỉ có thể extends 1 lớp cha trực tiếp của nó
// nhưng có thể implements một hoặc nhiều interface.
// nhưng phải override lại các phương thức trong interface đó.
class Move implements Drawable, Movable {

    @Override
    public void Draw() {

    }

    @Override
    public void Arase() {

    }

    @Override
    public void up() {

    }

    @Override
    public void down() {

    }
}

//Các lớp khi implements interface có 2 lựa chọn:
//Hoặc là thực thi tất cả các phương thức của interface.
//Hoặc là thực thi một phần các phương thức của interface và trở thành abstract class.
abstract class Shape implements Drawable {
    @Override
    public void Draw() {
        System.out.println("abcd");
    }
}
