import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import model.Person;

public class Main {
    public static void main(String[] args) {
        int n = 15;
        Random random = new Random();

        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int height = random.nextInt(50) + 140;
            int weight = random.nextInt(80) + 40;
            boolean gender = random.nextBoolean();
            people.add(new Person(height, weight, gender));
        }

        System.out.println("*** People sorted by height ***");
        for (int i = 0; i < people.size(); i++) {
            for (int j = i + 1; j < people.size(); j++) {
                if (people.get(i).getHeight() < people.get(j).getHeight()) {
                    Collections.swap(people, i, j);
                }
            }
        }
        
        for (int i = 0; i < people.size(); i++) {
            Person p = people.get(i);
            System.out.printf("Person: %d, %d, %b\n", p.getHeight(), p.getWeight(), p.getGender());
        }

        System.out.println("\n*** People under 60kg ***");
        for (Person p: people) {
            if (p.getWeight() <= 60 ) {
                System.out.printf("Person: %d, %d, %b\n", p.getHeight(), p.getWeight(), p.getGender());
            }
        }

        System.out.println("\n*** People BMI ***");
        for (Person p: people) {
            double squaredHeight = (p.getHeight() / 100.0) * (p.getHeight() / 100.0);
            System.out.printf("%.2f\n", p.getWeight() / squaredHeight);
        }
    }
}
