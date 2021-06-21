package lesson12;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        Student s1 = new Student("s1", "nam");
        Student s2 = new Student("s2","long");
        Student s3 = new Student("s3","mai");
        Student s4 = new Student("s4","vu");

//Lớp LinkedList trong java sử dụng cấu trúc danh sách liên kết kép để lưu trữ các phần tử.
        //Lớp LinkedList trong java có thể chứa các phần tử trùng lặp.
        //Lớp LinkedList duy trì thứ tự của phần tử được thêm vào.
        //Lớp LinkedList là không đồng bộ (non-synchronized).
//Trong java lớp LinkList, thao tác nhanh vì không cần phải dịch chuyển nếu bất kỳ phần tử nào bị xoá khỏi danh sách.
//Lớp LinkedList trong java có thể được sử dụng như list (danh sách), stack (ngăn xếp) hoặc queue (hàng đợi).


        LinkedList<Student> studentLinkedListEx = new LinkedList<>();
        studentLinkedListEx.add(s1);
        studentLinkedListEx.add(s3);
        studentLinkedListEx.addLast(s4);
        studentLinkedListEx.addFirst(s2);
        studentLinkedListEx.remove(s2);

        for (var e: studentLinkedListEx) {
            System.out.println(e);
        }
        System.out.println("--------");
        //truy cập phần tử có chỉ số 2
        System.out.println(studentLinkedListEx.get(2));

        System.out.println("--------");
        //kiểm tra xem "ha" có tồn tại trong studentLinkedListEx hay không
        System.out.println(studentLinkedListEx.contains("ha"));

        System.out.println("--------");
        //hiển thị các phần tử có trong danh sách linkedlist
        for (int i = 0; i < studentLinkedListEx.size(); i++) {
            System.out.println("Phần tử tại vị trí " + i + " "
                    + "trong arr là " + studentLinkedListEx.get(i));
        }
    }
}
