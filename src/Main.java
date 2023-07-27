import java.util.Arrays;

class Student{
    String name;
    Student(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }
}

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[]{new Student("John")};

        for (Student m:students){
            System.out.println(m);
        }
    }
}