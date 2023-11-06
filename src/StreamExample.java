import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = List.of("Bret", "Lian", "Shilad", "Joslenne");
        Stream<String> myStream = names.stream();
        List<String> sortedNames = myStream.sorted().collect(Collectors.toList());
        sortedNames.stream().filter(d -> d.equals("Bret")).collect(Collectors.toList());
        sortedNames.forEach(System.out::println);
    }
}
