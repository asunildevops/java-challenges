import java.util.Arrays;

public class find_largest {
    public static void main(String[] args)
    {
        int value = findLargest(6499);
        System.out.println(value);
    }

    public static int findLargest(int num) {
        String new_str = Integer.toString(Math.abs(num));
        int[] new_int = new int[new_str.length()];

        for (int i = 0; i < new_str.length(); i++) {
            new_int[i] = new_str.charAt(i) - '0';
        }
        Arrays.sort(new_int);
        for (int i = 0; i < new_int.length / 2; i++) {
            int temp = new_int[i];
            new_int[i] = new_int[new_int.length - i - 1];
            new_int[new_int.length - i - 1] = temp;
        }
        int output = 0;
        for (int i = 0; i < new_int.length; i++) {
            output = output * 10 + new_int[i];
        }
        return output;
    }
}

