import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class DZJ_5 {
    public static void main(String[] args) {
        System.out.println(isCorrectParentheses("()")); // true
        System.out.println(isCorrectParentheses("(")); // false
        System.out.println(isCorrectParentheses("())")); // false
        System.out.println(isCorrectParentheses("((()))")); // true
        System.out.println(isCorrectParentheses("()[]{}<>")); // true
        System.out.println(isCorrectParentheses("([)]")); // false
        System.out.println(isCorrectParentheses("][]")); // false
        System.out.println(isCorrectParentheses("[]{<()[]<>>}")); // true
        System.out.println(isCorrectParentheses("[{<()][<>>}]")); // false

    }
    // Дана последовательность скобочек. Проверить, что она является корректной.

    static boolean isCorrectParentheses(String string) {
        Map<Character,String> map = new HashMap<>();
        map.put('(', "");
        map.put(')', "(");
        map.put('[', "]");
        map.put(']', "[");
        map.put('<', ">");
        map.put('>', "<");
        map.put('{', "}");
        map.put('}', "{");

        Deque<String> deque =new LinkedList<>();
        char[] chars = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            char c1 =chars[i];
            if (deque.contains(map.get(c1))){
                deque.removeLast();
            } else {
                deque.add(String.valueOf(c1));
            }
        }
        if (!deque.isEmpty())
            return false;
        return true;     
    }
}
