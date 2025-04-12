package Coding_lab;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("旺财", 3, "秋田犬"),
                new Cat("小黑", 2, "白色"),
                new Dog("来财", 4, "哈士奇"),
                new Cat("得意",3,"白色")
        };

        for(int i = 0;i < animals.length; i++ ){
            animals[i].makeSound();

            if(animals[i] instanceof Trainable){
                ((Trainable)animals[i]).train();
            }

            if (animals[i] instanceof Swimmable){
                ((Swimmable)animals[i]).swim();
            }

            System.out.println();
        }
    }
}
