package class_this;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("张三", 20);
        Person student = new Student("李四", 18, "2023001");

        person.introduce();
        student.introduce();
    }
}
