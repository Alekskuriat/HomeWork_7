package Package;

import java.util.ArrayList;
import java.util.Random;

public class Cat {

    protected Random random = new Random();

    private final String name;
    private boolean satiety = false;
    private final int appetite = random.nextInt(90) + 10;

    protected static ArrayList<Cat> cats = new ArrayList<>();



    public Cat(String name) {
        this.name = name;
        cats.add(this);
    }

    public void eat(Plate plate) {
        if (plate.eatFromBowl(appetite)){
            satiety = true;
            System.out.println(name + " наелся");
        } else System.out.println(name + " отказался от еды, маловато");
    }


    public boolean isSatiety() {
        return satiety;
    }

    @Override
    public String toString() {
        return
                "Имя " + name  +
                ", аппетит " + appetite;
    }
}
