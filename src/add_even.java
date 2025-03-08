public class add_even {

public static int add_even_numbers(int n)
{
    int sum = 0;
    for (int i = 2;i<=n;i++)
    {
        if(i%2==0)
        {
            sum+=i;
        }
    }
    return sum;
}
public static void main(String[] args)
{
   int sum = add_even_numbers(10);
   System.out.println(sum);
}
}