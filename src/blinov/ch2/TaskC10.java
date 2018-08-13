package blinov.ch2;

import blinov.MyUtils;

public class TaskC10 {

    /**
     * Метод ищет максимальные элементы в массиве и создает объект позиции максимального элемента в новом массиве
     *
     * @param array входной массив
     * @return массив позиций максимальных элементов
     */
    private static Position[] maxIndex(int[][] array) {
        Position[] positions = new Position[0];
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == max) {
                    positions = MyUtils.addToArray(positions, new Position(i, j));
                }
            }
        }
        return positions;
    }

    /**
     * Метод удаляет строки и столбцы, к которых имеются максимальные элементы
     *
     * @param array входной массив
     * @return массив без строк и столбцов с максимальными элементами
     */
    private static int[][] delete(int[][] array) {
        Position[] p = maxIndex(array);
        int row = 0;
        int[][] newArray = size(array, p);
        for (int i = 0; i < array.length; i++) {
            int col = 0;
            if (isDeletableRow(p, i)) {
                continue;
            } else {
                for (int j = 0; j < array[i].length; j++) {
                    if (isDeletable(p, i, j)) {
                        continue;
                    } else {
                        newArray[row][col] = array[i][j];
                        col++;
                    }
                }
                row++;
            }
            col = 0;
        }
        return newArray;
    }


    /**
     * Метод проверяет подлежит ли элемент удалению
     *
     * @param positions массив, содержащий в себе объекты позиций максимальных элементов
     * @param row       строка
     * @param col       столбец
     * @return true - удалять, false - нет
     */
    private static boolean isDeletable(Position[] positions, int row, int col) {
        for (int i = 0; i < positions.length; i++) {
            if (positions[i].getRow() == row && positions[i].getCol() == col) {
                return true;
            }
        }
        return false;
    }

    /**
     * Метод проверяет подлежит ли строка удалению
     *
     * @param positions массив, содержащий в себе объекты позиций максимальных элементов
     * @param row       строка
     * @return true, если строка подлежит удалению, false - нет
     */
    private static boolean isDeletableRow(Position[] positions, int row) {
        for (int i = 0; i < positions.length; i++) {
            if (positions[i].getRow() == row) {
                return true;
            }
        }
        return false;
    }

    /**
     * Метод проверяет подлежит ли столбец удалению
     *
     * @param positions массив, содержащий в себе объекты позиций максимальных элементов
     * @param col       столбец
     * @return true, если столбец подлежит удалению, false - нет
     */
    private static boolean isDeletableCol(Position[] positions, int col) {
        for (int i = 0; i < positions.length; i++) {
            if (positions[i].getCol() == col) {
                return true;
            }
        }
        return false;
    }

    /**
     * метод определяет размер возвращаемого массива
     *
     * @param array     входной массив
     * @param positions массив, содержащий в себе объекты позиций максимальных элементов
     * @return пустой массив нужной длины
     */
    private static int[][] size(int[][] array, Position[] positions) {
        int countRow = 0;
        int countCol = 0;
        for (int i = 0; i < array.length; i++) {
            if (isDeletableRow(positions, i)) {
                continue;
            } else {
                countRow++;
            }
        }
        for (int j = 0; j < array[0].length; j++) {
            if (isDeletableCol(positions, j)) {
                continue;
            } else {
                countCol++;
            }
        }
        return new int[countRow][countCol];
    }


    public static void main(String[] args) {
        int[][] arr = MyUtils.reading(0, 10);
        MyUtils.print(arr);
        delete(arr);
    }
}
