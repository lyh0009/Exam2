package Coding_lab;

public class Dog extends Animal implements Trainable, Swimmable {
    private String breed;   //品种

    //重写makeSound()方法
    @Override
    public void makeSound() {
        System.out.println("汪");
    }

    //重写train()方法
    @Override
    public void train() {
        System.out.println("可以被训练");
    }

    //重写swim()方法
    @Override
    public void swim() {
        System.out.println("可以游泳");
    }


    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
