package May04.Strings;

import java.util.Scanner;

public class RemoveDuplicatesString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = "";
        char c;
        for (int i=0; i< s1.length(); i++){
            c=s1.charAt(i);
            if (s2.indexOf(c)==-1){
                s2=s2+c;
            }
        }
        System.out.println(s2);
    }
}
