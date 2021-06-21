package lesson10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//CollectionStream
public class Student {
    public String name;
    public boolean isMale; // true - male or false female
    public int age;
    public int score;

    public List<String> subjects;

    public Student(String name, boolean isMale, int age, int score, List<String> subjects) {
        this.name = name;
        this.isMale = isMale;
        this.age = age;
        this.score = score;
        this.subjects = subjects;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", isMale=" + isMale +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("A", true, 18, 5, Arrays.asList("Toan", "Ly", "Hoa")),
                new Student("B", false, 15, 8, Arrays.asList("Toan", "Van", "Anh", "Su")),
                new Student("C", false, 12, 9, Arrays.asList("Cong nghe", "Dia ly")),
                new Student("D", true, 10, 3, Arrays.asList("Anh van", "Hoa", "Sinh")),
                new Student("E", false, 18, 10, Arrays.asList()));

        //Stream filter() được dùng để lọc các phần tử theo một điều kiện xác định.
        //lọc các Student có giới tính là nam.
        //forEach: Duyệt các phần tử trong Stream.
        students.stream()
                .filter(s -> s.isMale)
                .forEach(s -> System.out.println(s.toString()));

        //skip(long n) Trả về một Stream lược bỏ n phần tử kể từ vị trí đầu tiên,
        //còn limit(long l) trả về một Stream với số lượng phần tử tối đa là l.
        //lọc các Student là nam, có tuổi trên 10, điểm từ trung bình trở lên.
        students.stream().skip(1).limit(3)
                .filter(s -> s.isMale && s.age > 10 && s.score >= 5)
                .forEach(s -> System.out.println(s.toString()));

        //Stream map() dùng để ánh xạ Stream object sang Stream object khác tương ứng.
        //trích danh sách điểm của tất cả các sinh viên.
        List<Integer> scores = students.stream()
                .map(s -> s.getScore())
                .collect(Collectors.toList());

        //distinct() trả về một Stream với các phần tử không trùng lặp.
        //liệt kê danh sách các môn học của tất cả các sinh viên.
        students.stream()
                .flatMap(s -> s.subjects.stream())
                .distinct()
                .forEach(subject -> System.out.print(subject + " "));
    }
}
