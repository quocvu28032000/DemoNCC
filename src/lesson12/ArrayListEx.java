package lesson12;

public class ArrayListEx {
    //ArrayList được sử dụng như một mảng động để lưu trữ các phần tử.
//Lớp ArrayList trong java có thể chứa các phần tử trùng lặp.
//Lớp ArrayList duy trì thứ tự của phần tử được thêm vào.
//Lớp ArrayList là không đồng bộ (non-synchronized).
//Lớp ArrayList cho phép truy cập ngẫu nhiên vì nó lưu dữ liệu theo chỉ mục.
//Lớp ArrayList trong java, thao tác chậm vì cần nhiều sự dịch chuyển
//nếu bất kỳ phần tử nào bị xoá khỏi danh sách.

//ArrayList là dùng một mảng động
//(như mảng thường nhưng có thể thay đổi kích thước và các phương thức thêm) để lưu trữ phần tử.

//LinkedList sử dụng danh sách liên kết để lưu trữ phần tử.
// Mỗi phần thử có thể được gọi là 1 node trong danh sách.

    //khác nhau:
//Cách lưu trữ phần tử.

//ArrayList thêm và xóa phần tử chậm hơn LinkedList:
//vì LinkedList chỉ cần thay đổi luồng trỏ của các node trong danh sách nên độ phức tạp là O(1)
//còn ArrayList phải tăng/lùi tất cả những vị trí sau vị trí muốn thêm/xóa nên độ phức tạp là O(n).

//ArrayList truy xuất phần tử nhanh hơn LinkedList:
//ArrayList muốn truy xuất đến phân tử thứ mấy trong danh sách thì chỉ
//cần gọi vị trí đó ra là được nên mất O(1) phức tạp,
//còn LinkedList thi phải duyêt qua các phần tử trước đó thì mới truy xuất được đến phần tử
//cần lấy nên độ phức tạp là O(n).

//ArrayList chỉ có thể hoạt động như 1 list thông thường,
//còn LinkedList có thể hoạt động như ArrayList, stack, queue.

 //ArrayList yêu cầu ít bộ nhớ hơn LinkedList:
 //Vì ngoài lưu trữ giá trị thì các node trong LinkedList còn phải chứa các tham chiếu
    // đến phần tử trước, sau của nó nữa.
}
