import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.Person;

class BetterMain {
    static String peopleToString(List<Person> people) {
        return String.join("\n", people.stream()
                .map(p -> p.toString())
                .collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        int n = 15;
        List<Person> people = Stream.generate(Person::randomGenerate)
                .limit(n)
                .collect(Collectors.toList());
        
        System.out.println("*** People sorted by height ***");
        List<Person> sortedPeople = people.stream()
                .sorted(Comparator.comparing(Person::getHeight).reversed())
                .collect(Collectors.toList());
        System.out.println(peopleToString(sortedPeople));

        System.out.println("\n*** People under 60kg ***");
        List<Person> under60kgPeople = people.stream()
                .filter(p -> p.getWeight() < 60)
                .collect(Collectors.toList());
        System.out.println(peopleToString(under60kgPeople));

        System.out.println("\n*** People BMI ***");
        List<Double> bmis = people.stream()
                .map(p -> p.calcBmi())
                .collect(Collectors.toList());
        System.out.println(bmis.stream()
                .map(b -> String.format("%.2f", b))
                .collect(Collectors.toList()));
    }
}