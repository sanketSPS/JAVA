import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Tester {
    public static void main(String args[]) {
        System.out.println("Predicate Functional Interface");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);

        Predicate<Integer> isEvenNumber = n -> n %2 == 0;
        numbers =  numbers.stream().filter(isEvenNumber).toList();

        System.out.println(numbers);
        System.out.println("Consumer Functional Interface");
        List<Integer> num = Arrays.asList(1,2,3,4);

        Consumer<Integer> consumer = (value) -> System.out.println(value);
        Consumer consumer1 = System.out::println;

        System.out.println("Printing using consumer functional interface as lambda expression");
        num.forEach(consumer);

        System.out.println("Printing using consumer functional interface as method reference");
        num.forEach(consumer1);
        System.out.println("Supplier Functional Interface");
        Supplier<Integer> supplier = () -> (int)(Math.random() * 10);

        List<Integer> randomNumbers = new ArrayList<>();

        // generate 10 random numbers
        for(int i = 0; i< 10; i++) {
            randomNumbers.add(supplier.get());
        }
        System.out.println(randomNumbers);
        System.out.println("Function  Functional Interface");
        List<Integer> numbers1 = Arrays.asList(1,2,3,4,5,6,7,8);

        Function<Integer, Integer> squared = (value) -> value * value;

        List<Integer> squaredNumbers =  numbers1.stream().map(squared).toList();

        System.out.println(squaredNumbers);
    }
}