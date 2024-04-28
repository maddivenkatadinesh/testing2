import java.util.Scanner;

public class CharVowelConsonent {
    public static void main(String args[]){
        String a ;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();

        if (a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("u") || a.equals("A") || a.equals("E") || a.equals("I") || a.equals("O") || a.equals("U") ){
            System.out.println("it was vowel");
        }else {
            System.out.println("it was consonent");
        }

    }
}
