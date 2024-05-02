public class MaxNumFromArray {
    public static void main(String[] args) {
        int[] arr = {30,50,60,90,10, 100,999};

        int max = arr[0];

        for (int i : arr){
            if (i>max){
                max=i;
            }
        }
        System.out.println(max);
    }
}
