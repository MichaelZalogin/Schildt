package Exercise5;

import java.io.IOException;

public class ForLoop {
    public static void main(String[] args) throws IOException {
        char ignore;
        System.out.println("Для остановки цикла нажмите клавишу S");
        for (int i = 0; (char) System.in.read() != 'S'; i++) {
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            System.out.println("Проход № " + i);
        }
    }
}