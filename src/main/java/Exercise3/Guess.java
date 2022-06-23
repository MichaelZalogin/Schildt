package Exercise3;

import java.io.IOException;

public class Guess {
    public static void main(String[] args)
            throws IOException {
        char ch;
        char answer = 'K';
        System.out.println("Задумана буква в диапазоне от A до Z.");
        System.out.print("Попытайтесь угадать: ");

        ch = (char) System.in.read();// Ввод символа
        if (ch == answer)
            System.out.println("Правильно!");
        else {
            System.out.print("...Извините, нужная буква находится ");
            if (ch < answer) {
                System.out.println("ближе к концу алфавита");
            } else {
                System.out.println("ближе к началу алфавита");
            }
        }
    }
}