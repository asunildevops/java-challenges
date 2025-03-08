public class first_vowel_index {
    public static void main(String[] args)
    {
        String[] testcases = {"rhythmics","hello","bhilms","task","","rhythm"};  //more test cases can be added
        for(String test: testcases){
            int value = findFirstVowel(test);
            System.out.println("First vowel in"+ " "+ test +" "+ "is at index" + value);  
        }
        
    }
    public static int findFirstVowel(String str) {
        char[] new_array = str.toCharArray();
        char[] vowel_ref = { 'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};

        for (int index = 0; index < new_array.length; index++) {
            for (int vow_index = 0; vow_index < vowel_ref.length; vow_index++) {
                if (new_array[index] == vowel_ref[vow_index]) {
                    return index;
                }
            }
        }
        return -1;  //failed to find the vowels 
    }
}

