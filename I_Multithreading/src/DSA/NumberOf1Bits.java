package DSA;

public class NumberOf1Bits {
    public static void main(String[] args) {
        System.out.println(hammingWeight(2147483645));
    }



    public static int hammingWeight(int n ){
        String s = getIntoBytes(n);
        int count = 0;
        for (int i=0; i<s.length(); i++){
            int x = Character.getNumericValue(s.charAt(i));
            if (x == 0){
                continue;
            }
            count++;
        }
        return count;

    }
    public static String getIntoBytes(int x){
        String result = "";
        while (x >  0 ){
            int mod  = x % 2;
            result = mod + result;
            x = x / 2;

        }
        return result;
    }
}
