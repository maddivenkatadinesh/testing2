package May04.Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        for(int i=s1.length()-1; i>=0 ;i--){
            System.out.print(s1.charAt(i));
        }
    }
}
