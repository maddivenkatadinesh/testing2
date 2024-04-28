import java.util.Scanner;

public class SwitchArthimaticOptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp1 = sc.nextInt();
        int inp2 = sc.nextInt();
        char oper = sc.next().charAt(0);

        switch (oper) {
            case '+' :
                System.out.println(inp1+inp2);
                break;
            case '-' :
                System.out.println(inp1-inp2);
                break;
            case '*' :
                System.out.println(inp1*inp2);
                break;
            case '/' :
                System.out.println(inp1/inp2);
                break;
            default:
                System.out.println("please enter a valid operator like +,-,*,/");
        }
    }
}
