
import java.util.Scanner;
import java.math.BigInteger;

public class factorial extends init_nested_array {

    public factorial(int rows,int cols){
        super(rows,cols);
    }
    public static void main(String[] args)
    {
        System.out.println("Enter a value to find the factorial upto that number");
        int value = init_nested_array.get_user_input();
        loop_through_factorial(value);
    }
    public static BigInteger find_factorial(int num){
        if (num<1){BigInteger final_num = new BigInteger("-1");return final_num;}  //handle negative numbers
        if (num!=1){
        BigInteger new_num = BigInteger.valueOf(num).multiply(find_factorial(num-1));
        return new_num;}
        else{BigInteger final_num = new BigInteger("1");return final_num;}
    }
    public static void loop_through_factorial(int number){
        for (int i = 1;i<=number;i++)
        {
            System.out.printf("The factorial of %d is %d%n",i,find_factorial(i));
        }
    }
}
