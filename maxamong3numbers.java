public class maxamong3numbers {
    public static void main(String[] args) {
        int a= 30;
        int b= 10;
        int c= 20;
        int q2= 34;
        int q3= 29;
        int x= 10;
        float y= 10;
        double z= 10;

        int max1 = a > b ? a : b;
        int max = max1 > c ? max1 : c;
        System.out.println(max);

        System.out.printf("First question answer is %d in Homework",q2);
        System.out.printf("\nSecond question answer is %d in Homework \n", q3);

        double result =Math.cbrt( Math.pow(x,2) + Math.pow(y,2) - Math.abs(z) );
        System.out.println(result);
    }
}
