package Exercise4;

public class Help {
    public static void main(String[] args)
            throws java.io.IOException {
        char ignore, choice;
        OUT:
        for (; ; ) {
            do {
                System.out.println("Справка:");
                System.out.println("1. If");
                System.out.println("2. Switch");
                System.out.println("3. For");
                System.out.println("4. While");
                System.out.println("5. Do-while\n");
                System.out.println("Выберите пункт..");
                System.out.print("Для выхода из программы нажмите Q");

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            }
            while (choice < '1' || choice > '5' && choice != 'Q');
            if (choice == 'Q') {
                break OUT;
            }

            switch (choice) {
                case '1':
                    System.out.println();
                    System.out.println("Реализация селекта if:");
                    System.out.println("if (условие) {\n инструкция");
                    System.out.println("} else { \n инструкция; \n}");
                    System.out.println("\n");
                    break;
                case '2':
                    System.out.println();
                    System.out.println("Реализация селекта switch:");
                    System.out.println("switch (константа){");
                    System.out.println("case константа:");
                    System.out.println("последовательность инструкций;");
                    System.out.println("break;");
                    System.out.println("default:");
                    System.out.println("последовательность инструкций;");
                    System.out.println("}");
                    System.out.println("\n");
                    break;
                case '3':
                    System.out.println();
                    System.out.println("Реализация цикла for:");
                    System.out.println("for (инициализация; условие; итерация){");
                    System.out.println("последовательность инструкций;");
                    System.out.println("}");
                    System.out.println("\n");
                    break;
                case '4':
                    System.out.println();
                    System.out.println("Реализация цикла while:");
                    System.out.println("while (условие){");
                    System.out.println("последовательность инструкций;");
                    System.out.println("}");
                    System.out.println("\n");
                    break;
                case '5':
                    System.out.println();
                    System.out.println("Реализация цикла do-while:");
                    System.out.println("do {");
                    System.out.println("последовательность инструкций;");
                    System.out.println("} while (условие);");
                    System.out.println("\n");
                    break;
            }
        }
    }
}