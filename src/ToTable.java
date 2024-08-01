import java.util.Arrays;

import static java.util.Arrays.copyOfRange;

public class ToTable {
    private int[] data;
    private final int x;
    private final int y;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    int[][] resize() {
        // склеиваем двумерный массив в один при помощи start
        int[][] res = new int[x][y];

        int start = 0;
        for (int i = 0; i < x; i++) {
            for (int j = start; j < start + y; j++) {
                res[i][j - start] = data[j];
            }
            start += y;
        }
        return res;
    }


}

//ToTable a = new ToTable(new int[] {1, 2, 3, 4, 5, 6}, 3, 2);
//int[][] arr = a.resize();
// [[1, 2], [3, 4], [5, 6]]