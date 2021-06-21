package lesson11;

import java.util.HashSet;

public class HashSetEx {
    //Lớp HashSet trong java là một lớp kế thừa lớp AbstractSet.
    //HashSet được sử dụng để tạo một bộ sưu tập sử dụng bảng băm để lưu trữ.
    //HashSet chỉ chứa các phần tử duy nhất.
    //HashSet lưu trữ các phần tử bằng cách sử dụng một cơ chế được gọi là băm (hash table).
    public static void main(String[] args) {
        HashSet<String> setA = new HashSet<String>();
        setA.add("Java");
        setA.add("Python");
        setA.add("Java");
        setA.add("PHP");
        setA.add("PHP");
        System.out.println("Số phần tử của setA: " + setA.size());
        System.out.println("Các phần tử của setA: " + setA);
        System.out.println("setA có chứa Java không? " + setA.contains("Java"));
        System.out.println("setA có chứa C++ không? " + setA.contains("C++"));

        System.out.println("Các phần tử của setA sau khi xóa: ");
        setA.remove("PHP");
        for (String e : setA) {
            System.out.println(e);
        }
    }
}
