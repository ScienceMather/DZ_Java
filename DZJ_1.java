import java.util.Arrays;
public class DZJ_1 {

    public static void main(String[] args) {

        System.out.println(isSumBetween10And20(5, 15)); //false
        System.out.println(isSumBetween10And20(2, 15)); //true
        System.out.println(isSumBetween10And20(2, 5)); //false
        
        System.out.println(isPositive(5)); //true
        System.out.println(isPositive(-3)); //false

        printString("Whatsapp?", 5); // Whatsapp?Whatsapp?Whatsapp?Whatsapp?Whatsapp?

        System.out.println(isLeapYear(2024)); //true
        System.out.println(isLeapYear(2023)); //false
        System.out.println(isLeapYear(1908)); //true

        System.out.println(Arrays.toString(createArray(8,202))); //[202, 202, 202, 202, 202, 202, 202, 202]

        int[] zero_one_array = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(reverse_zero_one(zero_one_array))); //[0, 0, 1, 1, 0, 1, 0, 0, 1, 1]

        int[] less_six = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; //[2, 10, 6, 4, 11, 8, 10, 4, 8, 8, 9, 2]
        System.out.println(Arrays.toString(num_less_six(less_six)));

        System.out.println(Arrays.deepToString(square_arr(5)));
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */

    private static boolean isSumBetween10And20(int a, int b) {
        if (a + b > 10 && a + b < 20) return true;
        else return false;
        // проверить, что сумма a и b лежит между 10 и 20
    }

    private static boolean isPositive(int x) {
        if (x > 0) return true;
        else return false;
        // проверить, что х положительное
    }

    private static void printString(String source, int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.print(source);
        }
        System.out.print("\n");
        // напечатать строку source repeat раз
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0 | (year % 100 != 0 & year % 400 == 0)) return true;
        else return false;
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
        
    }

    private static int[] createArray(int len, int initialValue) {           //[202, 202, 202, 202, 202, 202, 202, 202]
        int[] array = new int[len]; 
        Arrays.fill(array,initialValue);
        return array;
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        
    }

    private static int[] reverse_zero_one(int[] array) {            //[0, 0, 1, 1, 0, 1, 0, 0, 1, 1]
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) array[i] = 1;
            else {
                if (array[i] == 1) array[i] = 0;
            }
        }
        return array;
        // Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    }

    private static int[] num_less_six(int[] array) {            //[2, 10, 6, 4, 11, 8, 10, 4, 8, 8, 9, 2]
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) array[i] *= 2;
        }
        return array;
        // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;    
    }

    private static int[][] square_arr(int side) {                                //side = 5 [1, 0, 0, 0, 2]     side = 4 [1, 0, 0, 2]
        int[][] array = new int[side][side];                                     //         [0, 1, 0, 2, 0]              [0, 1, 2, 0]
        for (int i = 0; i < array.length; i++) {                                 //         [0, 0, 2, 0, 0]              [0, 2, 1, 0]
            for (int j = 0; j < array[0].length; j++) {                          //         [0, 2, 0, 1, 0]              [2, 0, 0, 1]
                if (i == j) array[i][j] = 1;                                     //         [2, 0, 0, 0, 1]     
                if (array.length -1-j == i) array[array.length -1-j][j] = 2;     
            }
        }
        return array;
        // Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
        // Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        // Также заполнить элементы побочной диагонали
    }
}