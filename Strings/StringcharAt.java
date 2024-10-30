import java.util.*;
public class StringcharAt{
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+"");
        }
        System.out.println();

    }
    public static void main(String [] args){
        String firstname="Om";
        String lastname="Nagpure";
        String fullname=firstname + " " + lastname;
        printLetters(fullname);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
    }
}