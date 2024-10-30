import java.util.*;

public class Substring {
    public static String substring(String str, int si, int ei) {
        String substr = ""; // Initialize substr as an empty string
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i); // Append characters to substr
        }
        return substr; // Return the constructed substring
    }

    public static void main(String args[]) {
        String str = "Hello World";
        System.out.println(substring(str, 0, 6)); 
}
}
