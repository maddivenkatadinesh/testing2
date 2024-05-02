import java.util.Scanner;

public class doubleArray {
    public static void main(String[] args) {
        System.out.println("how many numbers do you want to enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numbers[] = new int[n];
        int newnum[] = new int[n];
        int num ;
        for (int i=0; i < numbers.length ; i++){
            System.out.println("enter number"+(i+1));
            num=sc.nextInt();
            numbers[i]=num*2;
            newnum[i]=numbers[i];
        }

        for (int i:newnum){
            System.out.print(i);
        }

    }
}
