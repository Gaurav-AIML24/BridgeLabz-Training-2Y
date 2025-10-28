package method_references;
import java.util.stream.Stream;

public class NameUpperCase {
    public static void main(String[] args) {
        String[] names = {"alice", "bob", "carol"};
        String[] upper = Stream.of(names).map(String::toUpperCase).toArray(String[]::new);
        for (String name : upper) {
            System.out.println(name);
        }
    }
}
