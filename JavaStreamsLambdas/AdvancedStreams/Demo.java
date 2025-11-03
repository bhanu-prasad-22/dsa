import java.util.*;
import java.util.stream.*;

public class Demo
{
    public static void main(String[] args)
    {
        List<String> names=Arrays.asList("Alice","Bob","Charlie","Ava","Brian");

        //filter names start with A
        List<String> A=names.stream()
        .filter(n->n.startsWith("A"))
        .collect(Collectors.toList());
        System.out.println("Starts with A: "+ A);

        //map convert all to uppercase
        List<String> upper=names.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());
        System.out.println("UpperCase: "+ upper);

        //sort by alphabetical order
        List<String> sorted =names.stream()
        .sorted()
        .collect(Collectors.toList());
        System.out.println("Sorted: " +sorted);

        //Grouping by length
        Map<Integer,List<String>> grouped =names.stream()
        .collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped by length: "+ grouped);

        // Flat map example -flatten nested lists
        List<List<Integer>> nested =Arrays.asList(
            Arrays.asList(1,2,3),
            Arrays.asList(4,5),
            Arrays.asList(6,7,8)
        );
        List<Integer> flat =nested.stream()
        .flatMap(List::stream)
        .collect(Collectors.toList());
        System.out.println("Flattened list:"+flat);

        
    }
}