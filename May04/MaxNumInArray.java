package May04;

public class MaxNumInArray {
    public static void main(String[] args) {
        int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
        int max = Integer.MIN_VALUE;
        for (int[] i : arr){
            for (int j : i){
                if(j > max){
                    max = j;
                }
            }
        }
        System.out.println(max);
    }
}
