package homeworksix;

public class Main {
    public static void main(String[] args) {

        Animals Dog1 = new Dog();
        Dog1.jump(0.4, 0.5);
        Dog1.run(450, 500);
        Dog1.swim(11, 10);

        Animals Hasky = new Dog();
        Hasky.jump(0.8, 0.9);

        Animals cat1 = new Cat();
        cat1.jump(1.9, 2.0);
        cat1.swim(7, 0);
        cat1.run(300, 200);

        Animals Brit = new Cat();
        Brit.run(100,500);

        Animals Persi = new Cat();
        Persi.jump(2.5, 3.0);

        Animals Bengy = new Cat();
        Bengy.swim(100, 0);

    }
}
