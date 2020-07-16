package homeworksix;

public class Dog extends Animals {
    @Override
    public void jump(double obstacleHeight, double jumpHeight) {
       // super.jumpHeight = 0.5;
        Intro();
        super.jump(obstacleHeight, jumpHeight);
    }

    @Override
    public void run(int distance, int runAbility) {
        Intro();
     //   super.runAbility = 500;
        super.run(distance, runAbility);
    }

    @Override
    public void swim(int distance, int swimAbility) {
        Intro();
      //  super.swimAbility = 10;
        super.swim(distance, swimAbility);
    }

    @Override
    public void Intro() {
        super.Intro();
    }
}
