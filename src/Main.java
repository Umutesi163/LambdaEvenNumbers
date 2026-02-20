import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = EvenNumberFilter.filterEvenNumbers(numbers);

        System.out.println("Original List: " + numbers);
        System.out.println("Even Numbers List: " + evenNumbers);
        System.out.println();

        List<Integer> emptyList = new ArrayList<>();
        List<Integer> evenFromEmpty = EvenNumberFilter.filterEvenNumbers(emptyList);

        System.out.println("Original List (Empty): " + emptyList);
        System.out.println("Even Numbers List: " + evenFromEmpty);
        System.out.println();

        List<Integer> oddNumbers = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> evenFromOdd = EvenNumberFilter.filterEvenNumbers(oddNumbers);

        System.out.println("Original List (Only Odd): " + oddNumbers);
        System.out.println("Even Numbers List: " + evenFromOdd);
    }
}