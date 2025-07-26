package opps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Andrew", "Charlie", "Amanda");

        // Print all names
        System.out.println("All names:");
        names.forEach(System.out::println);

        // Filter names starting with "A"
        List<String> namesStartingWithA = names.stream()
                                               .filter(s -> s.startsWith("A"))
                                               .collect(Collectors.toList());
        System.out.println("\nNames starting with \"A\":");
        namesStartingWithA.forEach(System.out::println);

        // Sort names alphabetically
        List<String> sortedNames = names.stream()
                                        .sorted()
                                        .collect(Collectors.toList());
        System.out.println("\nNames sorted alphabetically:");
        sortedNames.forEach(System.out::println);
    }
}
