package lesson11;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        //HashMap trong Java là một bảng băm dựa trên việc thực hiện Java's Map interface.
        //Map là một tập hợp các cặp key-value. Nó ánh xạ các key tới các value.
        //HashMap không thể chứa các key trùng lặp.
        //Java HashMap cho phép các giá trị null và key null.
        //HashMap là một tập hợp không có thứ tự.
        //Nó không đảm bảo bất kỳ thứ tự cụ thể của các phần tử.

        //tạo một hashmap
        Map<String, Integer> numberMap = new HashMap<>();

        //thêm giá trị key-value vào HashMap
        numberMap.put("one",1);
        numberMap.put("two",2);
        numberMap.put("three",3);

        // Thêm cặp Key-Value chỉ khi key không tồn tại trong HashMap
        // hoặc được ánh xạ tới null
        numberMap.putIfAbsent("Four", 4);
        System.out.println(numberMap);

        System.out.println("-----");
        //loại bỏ giá trị ở key two
        numberMap.remove("two");
        System.out.println("các giá trị sau remove là: " + numberMap);

        //trả về tất cả các key có trên numberMap.
        System.out.println(numberMap.keySet());

        //trả về tất cả các value có trên numberMap
        System.out.println(numberMap.values());
    }
}
