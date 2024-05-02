import java.util.Scanner;

public class printAllMarks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.of.subjects");
        int n = sc.nextInt();
        int marks[] = new int[n];
        for (int i=0; i < marks.length ; i++){
            System.out.println("enter"+(i+1)+"subject marks");
            marks[i]=sc.nextInt();
        }
        System.out.println("marks you enterded are :");
        for (int i=0; i< marks.length; i++){
            System.out.println(marks[i]);
        }
    }

}
