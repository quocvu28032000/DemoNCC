package lesson11;

import java.util.*;

public class CollectionEx {
    //Một collection(tập hợp) là một đối tượng đại diện cho một nhóm đối tượng.
//Một collections framework là một kiến trúc thống nhất để đại diện và thao tác với các tập hợp.
    // Framework này gồm:
//Các interface: đây là các kiểu dữ liệu trừu tượng đại diện cho các tập hợp.
//Các lớp thực thi interface: đây là các lớp triển khai cụ thể của các interface trong tập hợp.
//Các thuật toán.
    //Collection: cung cấp các cách thức cho phép làm việc với một nhóm các đối tượng.
//List: kế thừa Collection và đối tượng của List dùng để lưu trữ danh sách các phần tử có thứ tự.
//Set: kế thừa Collection, dùng để chứa tập hợp các phần tử không trùng nhau.
//SortedSet: kế thừa Set, cung cấp một tập hợp các phần tử đơn nhất và được sắp xếp theo thứ tự nhất định.
//NavigableSet: kế thừa SortedSet, cung cấp các kết quả tìm kiếm phù hợp nhất cho các mục tiêu tìm kiếm nhất định.
//Queue: một tập hợp hàng đợi dùng để lưu trữ các phần tử trước khi xử lý theo thứ tự vào trước ra trước.
//DeQueue: kế thừa Queue, hàng đợi này cho phép thực hiện các thao tác thêm mới và loại bỏ phần tử từ cả hai chiều(đầu và cuối).
//Map: biểu thị dữ liệu dạng cặp key-value.
//SortedMap: kế thừa từ Map, cung cấp một map với các key được sắp xếp theo thứ tự tăng dần.
//Iterator: cung cấp khả năng duyệt, loại bỏ các phần tử trong tập hợp.
//ListIterator: kế thừa Iterator, cho phép duyệt và thực hiện các thao tác sửa đổi tập hợp theo cả hai hướng: đầu-cuối hoặc ngược lại.
//RandomAccess: là một interface đánh dấu nhằm chỉ ra rằng một tập hợp thực thi nó có hỗ trợ truy cập ngẫu nhiên(truy cập bằng chỉ số phần tử).

    //Một số lớp và mục đích sử dụng:
    //ArrayList: tập hợp các phần tử dạng mảng có thể tự thay đổi kích thước
//để phù hợp với số phần tử hiện tại đang chứa. Thường truy cập bằng chỉ số phần tử.
    //LinkedList: một tập hợp có thứ tự được sử dụng hiệu quả trong trường hợp chèn,
//xóa phần tử tại bất kì vị trí nào.
    //ArrayDeque: một hàng đợi hai chiều cho phép thực hiện các hành động thêm,
//xóa phần tử ở hai đầu của nó.
    //HashSet: tập hợp không có thứ tự của các phần tử và không cho phép trùng lặp phần tử.
    //TreeSet: một tập hợp có thứ tự của các phần tử.
    //EnumSet: một tập hợp của các giá trị kiểu liệt kê được.
    //LinkedHashSet: một tập hợp ghi nhớ thứ tự mà các phần tử đã được thêm vào.
    //PriorityQueue: hàng đợi ưu tiên cho phép loại bỏ các phần tử theo mức độ ưu tiên.
    //HashMap: một cấu trúc dữ liệu lưu trữ dữ liệu dạng key-value.
    //TreeMap: là một map trong đó các key được sắp xếp theo thứ tự.
    //EnumMap: là một map trong đó các key thuộc về một kiểu liệt kê.
    //LinkedHashMap: một map ghi nhớ thứ tự các phần tử đã được thêm vào.
    //WeakHashMap: một map với các giá trị có thể bị thu hồi bởi trình dọn dẹp
//nếu nó không được sử dụng ở đâu cả.
    //IdentityHashMap: một map với các key được so sánh bởi == không dùng equals().

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        System.out.println("Các phần tử của ArrayList");
        System.out.println(arrayList);

        List<String> linkedList = new LinkedList<String>();
        linkedList.add("PHP");
        linkedList.add("Python");
        linkedList.add("Java");
        linkedList.add("C++");
        System.out.println("Các phần tử của LinkedList");
        System.out.println(linkedList);

        Set<String> hashSet = new HashSet<String>();
        hashSet.add("PHP");
        hashSet.add("Python");
        hashSet.add("Java");
        hashSet.add("Java");
        hashSet.add("C++");
        System.out.println("Các phần tử của Set");
        System.out.print("\t" + hashSet + "\n");

        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("one", "1");
        hashMap.put("two", "2");
        hashMap.put("three", "ba");
        hashMap.put("four", "bốn");
        System.out.println("Các phần tử của Map");
        System.out.println(hashMap);
    }
}
