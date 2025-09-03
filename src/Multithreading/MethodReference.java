
import java.util.*;
import java.util.Arrays;
import java.util.List;
public class MethodReference {
        public static void main(String args[]) {
            System.out.println("Method Reference for Static Method");
            List<String> names = new ArrayList<>();
            names.add("Ramesh");
            names.add("Naresh");
            names.add("Kalpesh");
            System.out.println("Printing using for each loop");
            // Approach 1: for loop to print all elements
            for (String name: names) { System.out.println(name);  }
            System.out.println("Printing using for each loop with lambda expression");
            // Approach 2: lambda expression to print the elements in for each loop
            names.forEach(s->System.out.println(s));
            System.out.println("Printing using for each loop with method reference" );
            // Approach 3: Method reference to print elements in for each loop
            names.forEach(System.out::println);
            System.out.println("Method Reference for Instance Method");
            List<Integer> numbers = Arrays.asList(1,2,4,9,8,7,3);
            System.out.println("Sorted using lambda expression");
            numbers = numbers.stream().sorted((a,b) -> a.compareTo(b)).toList();
            System.out.println(numbers);
            numbers = Arrays.asList(1,2,4,9,8,7,3);
            System.out.println("Sorted using method reference" );
            numbers = numbers.stream().sorted(Integer::compareTo).toList();
            System.out.println(numbers);
        }
    }

