import java.util.List;

public class Add_to_nested_array extends init_nested_array {
    public Add_to_nested_array(int rows,int cols){
        super(rows,cols);
    }
    public static void main(String[] args)
    {
        System.out.print("Enter the number of rows");
        int rows = init_nested_array.get_user_input();
        System.out.print("Enter the number of cols");
        int cols = init_nested_array.get_user_input();
        Add_to_nested_array object = new Add_to_nested_array(rows,cols);
        List<List<Integer>> array = object.get_array();
        System.out.print(array + " this is from the child class");
    }
}
