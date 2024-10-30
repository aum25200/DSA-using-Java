import java.util.*;
public class StringBuilder {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder(); // Create a StringBuilder object
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch); // Append each character to the StringBuilder
        }
        System.out.println(sb); // Print the resulting string
    }
}
