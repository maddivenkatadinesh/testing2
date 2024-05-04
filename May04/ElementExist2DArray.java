package May04;

public class ElementExist2DArray {
    public static void main(String[] args) {
        int array[][]={{1,2,3},{4,5,6},{7,8,9}};
        int a =0;
        for(int[] i: array){
            for (int j : i){
                if (j==8){
                    a=1;
                }
            }
        }
        if (a==1){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
