package core;

public class ConditionalStatement {
    public static void main(String[]args){
        int[] arrayOfInteger = {1,2,3,4,5};

        for (int i = 0; i < arrayOfInteger.length ; i++){
            System.out.println(arrayOfInteger[2]);

            for(int k = 0; k < 5; k++){
                System.out.print("inner loop");
            }
        }
    }
}
