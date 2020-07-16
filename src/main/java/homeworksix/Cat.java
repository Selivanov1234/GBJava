package homeworksix;

public class Cat extends Animals {
    @Override
    public void jump(double obstacleHeight, double jumpHeight) {
        Intro();
      //  super.jumpHeight = 2.0;
        super.jump(obstacleHeight, jumpHeight);
    }

    @Override
    public void run(int distance, int runAbility) {
        Intro();
     //   super.runAbility = 200;
        super.run(distance, runAbility);
    }

    @Override
    public void swim(int distance, int swimAbility) {
        Intro();
      //  super.swimAbility = 0;
        super.swim(distance, swimAbility);
    }

    @Override
    public void Intro() {
        super.Intro();
    }
}
