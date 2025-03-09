import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Fibonacci {
    
    public static void main(String[] args)
    {
        Scanner read_user_inp = new Scanner(System.in);
        System.out.print("Enter the position of number needed in the fib sequence: ");
        int number = read_user_inp.nextInt();
        read_user_inp.close();
        int value = fetch_nth_element(fibonacci_generator(number),number);
        System.out.println(value);
    }
    public static List<Integer> fibonacci_generator(int number)
    {
        List<Integer> fib_seq = new ArrayList<>(List.of(0,1));
        if (number ==1) 
        {
            return new ArrayList<>(List.of(0));
        }
        for(int i = 0;i<number-2;i++)
        {   
            fib_seq.add(fib_seq.get(fib_seq.size()-1) + fib_seq.get(fib_seq.size()-2));
        }
        return fib_seq;
    }
    public static int fetch_nth_element(List<Integer> number,int position)
    {
        int value = number.get(position-1);
        return value;
    }
}

