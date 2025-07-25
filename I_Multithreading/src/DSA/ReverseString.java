package DSA;

public class ReverseString {
    public static void main(String[] args) {
        String name = "ADIABU";
        System.out.println(getReverseString(name));

    }


    public static String getReverseString(String string){
        String reversed = "";
        for (int i = string.length()-1; i >= 0 ; i--){
            reversed += string.charAt(i);
        }
        return reversed;
    }
}
