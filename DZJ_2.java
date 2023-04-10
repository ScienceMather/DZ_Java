import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class DZJ_2 {

    public static void main(String[] args) throws IOException {

        System.out.println(buildString(10,'a','b'));
        writerInFile("TEXT ");
        

        

    }

    static StringBuilder buildString(int n, char c1, char c2) {
        StringBuilder str_Builder = new StringBuilder();
        for (int i = 0; i < n-1; i++) {
            if (str_Builder.length() == 0) str_Builder.append(c1);
            if (str_Builder.charAt(i) == c2) {
                str_Builder.append(c1);
            } else {
                if (str_Builder.charAt(i) == c1) {
                    str_Builder.append(c2);
                }
            }
        }
        return str_Builder;
        // Дано четное число N (>0) и символы c1 и c2.
        // Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
        // (n = 6, c1='a', c2='b') -> "ababab"
        // (n = 10, c1='f', c2='s') -> "fsfsfsfsfs"
    }

    public static Path createPath () throws IOException {
        Path path_dz = Path.of("file.txt");
        if (Files.notExists(path_dz)) Files.createFile(path_dz);
        return path_dz;
    }

    static void writerInFile (String text) throws IOException {
        String text_dz = "";
        for (int i = 0; i < 100; i++) {
            text_dz += text;
        }
        text_dz += "\n";
        Path path = createPath ();
        byte[] bytes = text_dz.getBytes();
        OutputStream outputStream = Files.newOutputStream(path);
        outputStream.write(bytes);
        //  Создать файл file.txt
        //  Если файл уже создан, ничего делать не надо
        //  Записать в файл слово TEXT 100 раз: TEXTTEXTTEXTTEXTTEXTTEXT...
        }
        

}

