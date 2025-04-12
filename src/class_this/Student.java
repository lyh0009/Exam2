package class_this;

public class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public void introduce() {
        System.out.println("我叫" + super.getName() + "，今年" + super.getAge() + "岁，我的学号是" + studentId + "。");
    }
}

