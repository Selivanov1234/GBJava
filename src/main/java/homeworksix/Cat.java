package homeworksix;

public class Cat extends Animals {
    @Override
    public void jump(double obstacleHeight, double jumpHeight) {
        super.jump(obstacleHeight, 2.0);
    }

    @Override
    public void run(int distance, int runAbility) {
        super.run(distance, 200);
    }

    @Override
    public void swim(int distance, int swimAbility) {
        super.swim(distance, 0);
        System.out.println("Cats can't swim!");
    }
}
