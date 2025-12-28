package com.atguigu06.polymorphism.exer2;

/**
 * ClassName: AnimalTest
 * Package: com.atguigu06.polymorphism.exer2
 * Description:
 * 修改com.atguigu06.polymorphism.apply包下的AnimalTest类的方法，
 * 在判断Animal是Dog或Cat时，向下转型，并调用各自特有的方法。
 * @Author pluinyiasnhg
 * @Create 2025/12/28 10:31
 * @Version 1.0
 */
public class AnimalTest {

    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();

        test.adopt(new Dog());
        test.adopt(new Cat());
    }

    public void adopt(Animal animal){
        animal.eat();
        animal.jump();

        if (animal instanceof Cat)
            ((Cat) animal).catchMouse();

        if (animal instanceof Dog)
            ((Dog) animal).watchDoor();
    }
}

class Animal{
    public void eat(){
        System.out.println("动物进食");
    }

    public void jump(){
        System.out.println("动物跳");
    }
}

class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗吃骨头");
    }

    @Override
    public void jump(){
        System.out.println("狗急跳墙");
    }

    public void watchDoor(){
        System.out.println("狗能看家");
    }
}

class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }

    @Override
    public void jump(){
        System.out.println("猫跳~~");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}


