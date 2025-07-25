package DSA;

public class FindSecondHighestValue {

    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 12, 7};

        System.out.println(getHeightValue(arr));

    }

//    public static int getSecondHeightValue(int[] arr) {
//
//
//
//
//        int secondHighest = 0;
//        for(int i = 0; i < arr.length; i++){
//
//        }
//        return 0;
//    }

    public static int getHeightValue(int[] arr) {
        int highestValue = 0;

        for(int i = 0; i < arr.length; i++){
            if ( arr[i] > highestValue){
                highestValue = arr[i];
            }

        }
        return  highestValue;
    }
}
