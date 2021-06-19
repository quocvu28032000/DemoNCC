package lesson7;

//public class CompareStaticVariable {
//}

//Java Program to illustrate the use of static variable which
//is shared with all objects.
class Counter2 {
     // Biến static có thể được sử dụng để tham chiếu đến thuộc tính chung
     // của tất cả các đối tượng...
// nếu nó được tăng lên, nó sẽ không phản ánh các đối tượng khác.
// Vì vậy mỗi đối tượng sẽ có giá trị 1 trong biến đếm.

    static int count = 0;//will get memory only once and retain its value

    Counter2() {
        count++;//incrementing the value of static variable
        System.out.println(count);
    }

    public static void main(String args[]) {
//creating objects
        Counter2 c1 = new Counter2();
        Counter2 c2 = new Counter2();
        Counter2 c3 = new Counter2();
    }
}

