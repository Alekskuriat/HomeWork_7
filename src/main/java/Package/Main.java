package Package;

public class Main {
    public static void main(String[] args) {

        Cat catBarsik = new Cat("Барсик");
        Cat catTomas = new Cat("Томас");
        Cat catRichard = new Cat("Ричард");
        Cat catStiven = new Cat("Стив");

        Plate plate = new Plate();

        listAnimals();
        dinner(plate);


    }

    private static void listAnimals() {
        System.out.println("Список животных:");
        for (int i = 0; i < Cat.cats.size(); i++) {
            System.out.println((i + 1) + "." + Cat.cats.get(i).toString());
        }
        System.out.println();
    }


    private static void dinner(Plate plate) {
        int countAdd = 1; //Количество добавлений еды в миску
        System.out.println("Все на обед! В миске " + plate.getFood() + " еды");
        for (int i = 0; i <= countAdd; i++) {
           for (int j = 0; j < Cat.cats.size(); j++) {
               if (!Cat.cats.get(j).isSatiety()) Cat.cats.get(j).eat(plate);
           }
           if (i == countAdd) break;
           if (coutingHungry()) plate.addFood((int) (Math.random() * 50) + 20);
           else System.out.println("\nВсе коты сытые");

       }
    }

    private static boolean coutingHungry() {
        int count=0;
        for (int i = 0; i < Cat.cats.size(); i++) {
            if (!Cat.cats.get(i).isSatiety()) {
                count++;
            }
        }
        return count >= 1;
    }
}
