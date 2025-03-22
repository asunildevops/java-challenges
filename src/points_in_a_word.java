import java.util.*;

public class points_in_a_word {
    

    public static void main(String[] args)
    {
        String str ="abcd";
        HashMap<String,Integer> WordValues = CreateHashMap();
        int sum = 0;
        for(char val :str.toCharArray()){
            String key = String.valueOf(val);
            if (WordValues.containsKey(key)){
            sum+=WordValues.get(key);}
            else{System.out.println("The value is not found in the HashMap");}
        }   
        System.out.printf("The total points is %d",sum);
    }

    public static HashMap<String,Integer> CreateHashMap()
    {
        HashMap<String,Integer> WordPoints = new HashMap<>();
        WordPoints.put("a",1);
        WordPoints.put("b",3);
        WordPoints.put("c",4);
        WordPoints.put("d",5);
        WordPoints.put("e",1);
        WordPoints.put("f",6);
        WordPoints.put("g",10);
        return WordPoints;

    }
}

