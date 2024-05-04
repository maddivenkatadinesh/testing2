package May04;

public class TransposeArray {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int row = arr.length;
        int column = arr[0].length;
        int arr2[][] = new int[row][column];
        for (int i=0; i< row; i++){
            for (int j=0; j<column; j++){
                arr2[j][i]=arr[i][j];
            }
        }
        for (int[] i : arr2){
            for (int j : i){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
