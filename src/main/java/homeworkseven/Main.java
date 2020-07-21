package homeworkseven;

public class Main {
   static Cat cat;
   static Plate plate;
   static int foodCount;

    public static void catEat(Cat cat){
        if (cat.isHungry()) {
           // System.out.println("The cat is hungry!");
            plate.info();
            //cat.eat(plate);
            if (cat.eat(plate) == true) {
                cat.catHunger(foodCount);
            }else {
                plate.info();
            }
        } else if (!cat.isHungry()) {
            System.out.println("The cat is full!");
            plate.info();
        }
    }
    public static void main(String[] args) {
        int foodCount = plate.increaseFood(120);
        cat = new Cat("Barsik", 5);
        plate = new Plate(foodCount);
        Cat cats[] = new Cat[4];
        cats [0] = new Cat("Mo", 10);
        cats [1] = new Cat("Jo", 7);
        cats [2] = new Cat("Lo", 5);
        cats [3] = new Cat("Po", 3);

        //catEat(cat);
        for (int i = 0; i < cats.length ; i++) {
            catEat(cats[i]);
        }
    }
}
