public class Interface_AbstractClass {

}

class animal {
    //thuoc tinh
    private String name;

    //phuong thuc
    public animal() {

    }
}

interface student {
    //k sử dụng phạm vi truy cập nào
    //có auto matic property
    //cac thuoc tinh la hang so
    public final static String name = "nguyễn quốc vũ";

    //phương thức
    public void study();
    //muốn thừa kế phương thưc này phải implement
}

abstract class person {
    //phuong thuc
    private String name;

    //thuoc tinh
    public abstract void move();
}
