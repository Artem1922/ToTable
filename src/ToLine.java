import java.util.Arrays;

public class ToLine {
    int[][] data;

    public ToLine(int[][] data) {
        this.data = data;
    }

    int[] resize() {
        int[] result = new int[data.length * data[0].length];
        int k = 0;
        for (int i = 0; i < data.length; i++ ) {
        for (int j = 0; j < data[i].length; j++){
            result[k++] = data[i][j];
        }
        }
        return result;
    }

    public static void main(String[] args) {
        ToLine toLine = new ToLine(new  int[][]{{1, 2}, {3, 4}, {5, 6}});
        System.out.println(Arrays.toString(toLine.resize()));
    }
}

/*    Класс ToLine

    Этот класс работает наоборот, то есть из двумерного массива делает одномерный.

        В этом классе реализуйте:

        поле data (двумерный массив);
        конструктор, инициализирующий данное поле (data);
        метод resize(), возвращающий одномерный список.
        Пример:

        ToLine a = new ToLine(new int[][] {{1, 2}, {3, 4}, {5, 6}});
        int[] arr = a.resize();
        В поле arr должен попасть массив вида: [1, 2, 3, 4, 5, 6]. */