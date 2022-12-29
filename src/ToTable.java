import java.util.Arrays;

public class ToTable {

    int[] data;
    int x;
    int y;


    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    int[][] resize() {
        int[][] res = new int[x][y];
        int k = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                res[i][j] = data[k++];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ToTable toTable = new ToTable(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 3, 3);
        System.out.println(Arrays.deepToString(toTable.resize()));



    }
}

 /*   Класс ToTable

        Этот класс должен превращать одномерный массив чисел в таблицу (двумерный массив чисел x на y).

        В этом классе реализуйте:

        поле data (одномерный массив);
        поле x ( число);
        поле y (число);
        конструктор, инициализирующий данные поля (data, x, y);
        метод resize(), возвращающий двумерный список x на y.
        Пример:

        ToTable a = new ToTable(new int[] {1, 2, 3, 4, 5, 6}, 3, 2);
        int[][] arr = a.resize();
        В поле arr должен попасть массив вида: [[1, 2], [3, 4], [5, 6]].

  */