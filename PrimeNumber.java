public class PrimeNumber {
    public static void main(String[] args) {
        int c=0;
        int num = 12;
        for (int i=2; i<= num; i++){
            if (num%i==0){
                c++;
            }
        }

        if (c==1){
            System.out.println("it is prime");
        }
        else {
            System.out.println("it is not prime");
        }
    }
}
