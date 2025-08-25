import java.util.Scanner;

import static java.sql.Types.NULL;

public class arrayMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] array1 = {45, 78, 22, 96, 53, 41, 11, 88};

        System.out.println("Sum of the even numbers from the array => " + evenNumberSum.sum(array1));

        System.out.println("Numbers greater then 50 are => ");
        for(int i: array1){
            if(greaterThen50.number(i) != NULL)
                System.out.print(i + " ");
        }

        System.out.println("Number of the number which are divisible by 3 => " + divisibleBy3.count(array1));
    }
}
