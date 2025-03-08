
public class App {
    public static void main(String[] args) throws Exception {

        // forloop();  
        // printarray();
        // allmultiplicationtable(20);
        // String[] samplearray = {"ananthu","java","procoder","verygood"};
        // DisplayArray(samplearray);
        // int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        // sum_of_int_array(ages);
        // lowest_of_int_array(ages);
        // int result = sum(5,10);
        // System.out.println(result);
        MyClass Instance = new MyClass();
        for (String elements : Instance.array){
            System.out.println(elements);
        }

        System.out.println(Instance.x);
        System.out.println(Instance.y);
        object_oriented_programming();

}
    public static void rolldice(){
        int repeat = 50;
        while(repeat>0){
            int Number = (int)(Math.random()*7);
            if(Number<=5){
                System.out.println("No Yatzy");
            }
            else if(Number==6){
                System.out.println("Yatzy Achieved");
            }
            repeat --;
        }

    }
    public static void forloop(){
        for(int i=0;i<11;i+=3){
            System.out.println(i);
        }
    }
    public static void nestedforloop(){
        for (int i=0;i<=10;i++){
            System.out.println("Outer"+ " " + i);
            for (int j=0;j<2;j++){
                System.out.println("Loop"+ " " + j);
            }
        }
    }
    public static void printarray(){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
        System.out.println(i);
        }
    }
    public static void muliplicationtable(int num){
        for (int i=1;i<=10;i++){
            System.out.println(num +"x" + i + " "+ "=" + " "+ (num*i));
        }

    }
    public static void allmultiplicationtable(int num){
        for (int i =1;i<num+1;i++){
            muliplicationtable(i);
            System.out.println("***************************************");
        }
    }
    public static void DisplayArray(String[] Array){
        // for (int i = 0;i<Array.length;i++){
        //     System.out.println(Array[i]);
        for (String i : Array ){
            System.out.println(i);
        }
        }
    public static void sum_of_int_array(int[] Array){
        float sum =0;
        float avg = 0;
        int len_of_arr = Array.length;
        for(int elements : Array){
            sum =sum+elements;            
        }
        avg = sum/len_of_arr;
        System.out.println("The sum of array: " + " " + sum + " "+ "the avg is" + " " + avg);

    } 
    public static void lowest_of_int_array(int[] Array){
        int lowest_number = Array[0];
        for (int element : Array){
            if(lowest_number > element){
                lowest_number = element;
            }
                 
        }
        System.out.println("lowest member in the array is " + " " + lowest_number);
    } 

    public static int sum(int start,int end){

        if (start < end){
            return start + sum(start+1,end);
        }
        else if(start == end){
            return end;
        }
        else{
            return 0;
        }

        }
    public static void object_oriented_programming(){
        MyClass Inst = new MyClass();
        int Result = Inst.x + Inst.y;
        for(String element : Inst.array){
            System.out.println(element);
        }
        System.out.println(Result);
    }
        
    }
    

