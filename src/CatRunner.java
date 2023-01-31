import java.util.ArrayList;

public class CatRunner {
    public static void main(String args[]) {
    ArrayList<Cat> cats = new ArrayList<>();
    Cat bob = new Cat("bob");
    Cat jane = new Cat("jane");
    Cat doe = new Cat("doe");
    cats.add(bob);
        cats.add(jane);
        cats.add(doe);
        System.out.println(cats);
    Cat cat4 = new Cat("Jessica");
    Cat catVar = cats.get(2);
    cats.set(2,cat4);
        System.out.println(cats);
        cat4.setName(cat4.getName() + " Meow");
        System.out.println(cats);
        for (int i = 0; i < cats.size(); i++){
            String catName = cats.get(i).getName().toUpperCase();
            cats.get(i).setName(catName);

        }
        System.out.println(cats);
    }
}
