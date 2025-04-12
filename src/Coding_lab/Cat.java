package Coding_lab;

public class Cat extends Animal implements Trainable{
    private String furColor;    //毛发颜色

    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    // 重写makeSound()
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    // 重写train()
    @Override
    public void train() {
        System.out.println("Training cat...");
    }

    // 获取毛发颜色
    public String getfurColor(){
        return this.furColor;
    }
}
