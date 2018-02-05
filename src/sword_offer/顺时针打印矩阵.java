package sword_offer;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by liyahui on 2018/1/18.
 */
public class 顺时针打印矩阵 {

    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        int width = matrix[0].length;
        int height = matrix.length;

        int count = width > height?height/2+height%2:width/2+width%2;
        int value = 0;
        int x =0;
        int y =0;
        for (int i =0;i<count;i++){

            for (int j=0 ; j<width - i*2 ;j++){
                matrix[x][y++] = value++;
            }
            y--;
            x++;
            for (int k=0 ; k<height - 1 - i*2; k++){
                matrix[x++][y] = value++;
            }
            x--;
            y--;
            for (int k=0 ; k<width - 1 - i*2; k++){
                matrix[x][y--] = value++;
            }
            x--;
            y++;
            for (int l=0 ; l<height - 2 - i*2; l++){
                matrix[x--][y] = value++;
            }
            x++;
            y++;
        }
        Arrays.stream(matrix).flatMapToInt(yyy -> Arrays.stream(yyy)).forEach(xx -> System.out.print(xx+" "));
        return null;
    }

    public static void main(String[] a){
        printMatrix(new int[5][5]);
    }
}
