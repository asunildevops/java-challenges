import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class init_nested_array {
    private List<List<Integer>> array;
    public init_nested_array(int rows,int cols)
    {
        this.array = Nested_List_INIT(rows,cols);
    }
    public List<List<Integer>> get_array(){
        return array;
    }
    public static void main(String[] args)
    {
        System.out.print("Enter the number of rows");
        int rows = get_user_input();
        System.out.print("Enter the number of cols");
        int cols = get_user_input();
        init_nested_array object = new init_nested_array(rows, cols);
        System.out.println(object.get_array());
    }

    public static List<List<Integer>> Nested_List_INIT(int rows , int cols)
    {
        List<List<Integer>> test_list = new ArrayList<>();

        for(int i = 0;i<rows;i++)
        {
            List<Integer> row_list = new ArrayList<>();
            for(int j = 0;j<cols;j++)
            {
                row_list.add(0);
            }
            test_list.add(row_list);
        }
        return test_list;
}
    public static int get_user_input()
    {
        Scanner object = new Scanner(System.in);
        int value = object.nextInt();

        return value;
    }
}
