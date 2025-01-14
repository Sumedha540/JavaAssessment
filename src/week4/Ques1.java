package week4;

class Animal1 {
    String name;
    int age;

    public Animal1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Dog1 extends Animal1 {
    String breed;

    public Dog1(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
}

public class Ques1 {
    public static void main(String[] args) {
        Animal1 a = new Animal1("Jack", 6);
        Dog1 d = new Dog1("Rocky", 2, "Cocker Spaniel");
        System.out.println("Animal's name is:" + a.name);
        System.out.println("Animal's age is:" + a.age);
        System.out.println("Dog's name is:" + d.name);
        System.out.println("Dog's age is:" + d.age);
        System.out.println("Dog's breed is:" + d.breed);
    }
}



