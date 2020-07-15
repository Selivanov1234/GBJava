package homeworksix;

public class Dog extends Animals {
    @Override
    public void jump(double obstacleHeight, double jumpHeight) {
        super.jump(obstacleHeight, 0.5);
    }

    @Override
    public void run(int distance, int runAbility) {
        super.run(distance, 500);
    }

    @Override
    public void swim(int distance, int swimAbility) {
        super.swim(distance, 10);
    }
}
