package May04.Strings;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first string");
        String s1 = sc.next();
        System.out.println("enter second string");
        String s2 = sc.next();
        if(s1.equals(s2)){
            System.out.println("both strings shouldn't be same");
            System.exit(0);
        }
        int c=0;
        for (int i=0; i<s1.length();i++){
            for (int j=0; j<s2.length(); j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    c++;
                    break;
                }
            }
        }
        if (c==s1.length()){
            System.out.println("Anagram");
        }
        else {
            System.out.println("not Anagram");
        }
    }
}
