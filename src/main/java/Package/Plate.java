package Package;

import java.util.Random;

public class Plate {
    protected Random random = new Random();
    private int food = random.nextInt(50) + 50;



    public boolean eatFromBowl(int countFood){
        if (countFood > food) {
            return false;
        }
        else {
            food -= countFood;
            return true;
        }
    }

    public void addFood(int food){
        this.food += food;
        System.out.println("\nВ миску добавлено " + food + " еды");
    }

    public int getFood() {
        return food;
    }
}
