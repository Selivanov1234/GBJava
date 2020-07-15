package homeworksix;

public class Animals {
    public void jump (double obstacleHeight, double jumpHeight) {
        if (jumpHeight < obstacleHeight) {
            System.out.println("The obstacle is too high!");
        }else {
            System.out.println("Hooray! It jumped over!");
        }
    }
    public void run (int distance, int runAbility) {
        if (runAbility < distance) {
            System.out.println("Too long to run!");
        }else {
            System.out.println("Distance covered! Well done!");
        }
    }
    public void swim (int distance, int swimAbility) {
        if (swimAbility < distance) {
            System.out.println(" Too long to swim!");
        }else {
            System.out.println("Well done! It is on the other side!");
        }
    }
}
