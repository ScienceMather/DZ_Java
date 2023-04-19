import java.util.ArrayList;
import java.util.List;

public class DZJ_3 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        strings.add("Work");
        strings.add("11");
        strings.add("102");
        strings.add("program");
        strings.add("Integer");
        strings.add("-26");
        strings.add("-9");
        strings.add("17");

        // removeEvenNumber(strings);
        removeIntegers(strings);
    }

    static void removeEvenNumber(List<String> numbers) {
        String temp;
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            temp = numbers.get(i);
            try {
                Integer num = Integer.parseInt(temp);
                if (num % 2 == 1 | num % 2 == -1) strings.add(num.toString()); // [-5, 11, -9, 17]
            } catch (NumberFormatException e) {
                strings.add(temp); // [string, -5, my_string, Work, 11, program, Integer, -9, 17]
            }
        }
        System.out.println(strings);

        // Удалить все четные элементы из списка
    }

    static void removeIntegers(List<String> strings) {
        String temp;
        List<String> stringsList = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            temp = strings.get(i);
            try {
                Integer.parseInt(temp);
            } catch (NumberFormatException e) {
                stringsList.add(temp); // [string, -5, my_string, Work, 11, program, Integer, -9, 17]
            }
        }
        System.out.println(stringsList);
        // Удалить строки, которые являются целыми числами
    }

}
