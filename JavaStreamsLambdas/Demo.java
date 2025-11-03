import java.util.*;
import java.util.stream.*;

public class Demo
{
    public static void main(String[] args){
      List<Integer> num=Arrays.asList(1,2,3,4,5,6);

      //filter even numbers and prints
      num.stream()
      .filter(n->n%2==0)
      .forEach(System.out::println);

      //map(square each)
      List<Integer> sqrs=num.stream()
      .map(n->n*n)
      .collect(Collectors.toList());
      System.out.println("squares: "+sqrs);

      //Reduce (sumAll)
      int sum=num.stream().reduce(0,(a,b)-> a+b);
      System.out.println("Sum:"+sum);
    }

}