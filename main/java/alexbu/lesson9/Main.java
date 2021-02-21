package alexbu.lesson9;

public class Main {
    public static void main(String[] arg) throws MyArrayDataException {
        int size = 4;
        Object[][] arr = {{5,8,4,3},{7,8,3,6}};
        int sum = 0;
        try {
            arrayCheck(size, size);
        } catch (Exception e) {
            System.err.println(e);
            return;
        }
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += (int) arr[i][j];
                } catch (Exception e) {
                    throw new MyArrayDataException("в ячейке с координатами "+ i + "," + j + " неверный тип данных");
                }
            }
        System.out.println("Сумма: " + sum);
    }

    public static void arrayCheck(int row, int col) throws MyArraySizeException {
        if (row != 4 || col != 4) {
            throw new MyArraySizeException("Массив другого размера! Необходим 4х4");
        }
    }
}
