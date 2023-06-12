package week15_17_12_2022.method_overriding.task2;


public class Fish extends Animal{

    @Override
    public void move() {
        super.move();
        System.out.println("Fish are swimming");
    }
}