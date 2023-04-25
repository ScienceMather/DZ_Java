import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class DZJ_4 {
    public static void main(String[] args) {
        apiPrint();
    }
    public static void apiPrint() {
        try (Scanner sc = new Scanner(System.in)) {
            List<String> storage = new ArrayList<>();
            root: while (true) {
                String input = sc.nextLine();
                if ("q".equals(input) || "exit".equals(input)) {
                    break;
                }
                if ("print".equals(input)) {
                    Collections.reverse(storage);
                    boolean cucle = true;
                    while (cucle) {
                        System.out.println(storage);
                        Collections.reverse(storage);
                        continue root;
                    }
                    throw new IndexOutOfBoundsException();
                } else {
                    if ("revert".equals(input)) {
                        Collections.reverse(storage);
                        boolean cucle = true;
                        while (cucle) {
                            storage.remove(0);
                            Collections.reverse(storage);
                            continue root;
                        }
                        throw new IndexOutOfBoundsException();
                    } else {
                        boolean cucle = true;
                        while (cucle) {
                            storage.add(input);
                            continue root;
                        }
                    }
                }
            }
        }
    }
}
