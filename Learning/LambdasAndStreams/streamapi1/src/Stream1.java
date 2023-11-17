import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5);
        final String[] output = {""};

//        for (int i = 0; i < nums.size(); i++)
//            output += nums.get(i) + " ";
        System.out.println(output[0]);

        nums.forEach(num -> output[0] += num + " ");
        System.out.println(output[0]);

        List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");

          Stream<String> limit =  strings.stream().limit(4);
//        long result = limit.count();
//        System.out.println(result);

        //List<String> resultList = limit.collect(Collectors.toList());
        List<String> resultList = strings.stream()
                                         .limit(4)
                                          .collect(Collectors.toList());
        System.out.println("result = " + resultList);

        List<String> resultListSorted = strings.stream()
                .sorted() //natural sorting. Use overloaded Comparator for explicit sort
                .limit(4)
                .collect(Collectors.toList());
        System.out.println("resultSorted = " + resultListSorted);

        List<String> resultListExplicitSorted = strings.stream()
                .sorted((s1, s2) -> s1.compareToIgnoreCase(s2)) // overloaded Comparator for explicit sort
                .limit(4)
                .collect(Collectors.toList());
        System.out.println("resultExplicitSorted = " + resultListExplicitSorted);

        List<String> resultSkipSome = strings.stream()
                .sorted((s1, s2) -> s1.compareToIgnoreCase(s2)) // overloaded Comparator for explicit sort
                .skip(2) // skip first 2 elements in the sorted list
                .limit(4)
                .collect(Collectors.toList());
        System.out.println("resultSkipSome = " + resultSkipSome);

    }
}
