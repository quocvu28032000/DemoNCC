package lesson12;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        Student s1 = new Student("s1","nam");
        Student s2 = new Student("s2","long");
        Student s3 = new Student("s3","mai");
        Student s4 = new Student("s4","vu");

        LinkedList<Student> studentLinkedListEx = new LinkedList<>();
        studentLinkedListEx.add(s1);
        studentLinkedListEx.addLast(s4);
        studentLinkedListEx.addFirst(s2);

        for (var e: studentLinkedListEx) {
            System.out.println(e);
        }
    }
}
