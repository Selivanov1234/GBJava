package homeworkseven;

public class Cat {
    private String name;
    private int appetite;
    private int hunger;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hunger = hunger;
        hunger = appetite;
    }

    public boolean isHungry () {
        if (hunger == 0) {
           // System.out.println("Cat is not hungry! Cat's appetite: " + appetite);
            return false;
        } else {
           // System.out.println("Cat is still hungry! Cat's appetite: " + appetite);
            return true;
        }
    }

    public void catHunger (int foodCount) {
        if (hunger - foodCount <= 0) {
            hunger = 0;
            System.out.println("Cat's hungry! Hunger: " + hunger);
        } else {
            hunger = hunger - foodCount;
            System.out.println("Cat's full: " + hunger + " / " + hunger);
        }

    }
    public boolean eat(Plate plate) {
        if (plate.getFood() < appetite) {
            System.out.println("There is not enough food for the cat!");
            return false;
        }else {
            plate.decreaseFood(appetite);
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
}

