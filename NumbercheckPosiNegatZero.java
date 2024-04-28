import java.util.Scanner;

public class NumbercheckPosiNegatZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check whether it is positive/negative/zero");
        int num = sc.nextInt();
        if (num > 0){
            System.out.println("positive number");
        } else if (num < 0) {
            System.out.println("negative number");
        } else {
            System.out.println("zero");
        }
    }
}
