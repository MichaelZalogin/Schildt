package Exercise3;

import java.io.IOException;

public class Guess {
    public static void main(String[] args)
            throws IOException {

        char ch;
        char answer = 'K';
        char ignore;

        do {
            System.out.println("Задумана буква в диапазоне от A до Z.");
            System.out.print("Попытайтесь угадать: ");

            ch = (char) System.in.read();// Получение символа от пользователя

            //отбрасывание всех остальных символов во входном буфере
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer)
                System.out.println("Правильно!");
            else {
                System.out.print("...Извините, нужная буква находится ");
                if (ch < answer) {
                    System.out.println("ближе к концу алфавита");
                } else
                    System.out.println("ближе к началу алфавита");
                System.out.println("Попробуйте еще раз!\n");
            }
        }
        while (answer != ch);
    }
}