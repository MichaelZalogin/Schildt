package Exercise4;

public class Help {
    public static void main(String[] args)
            throws java.io.IOException {
        System.out.println("Справка:");
        System.out.println("1. If");
        System.out.println("2. Switch");
        System.out.print("Выберите...");

        char choice = (char) System.in.read();

        switch (choice) {
            case '1':
                System.out.println("Инструкция if: \n");
                System.out.println("if (условие) инструкция");
                System.out.println("else инструкция");
                break;
            case '2':
                System.out.println("Инструкция switch: \n");
                System.out.println("switch (выражение)");
                System.out.println("case константа:");
                System.out.println("последовательность инструкций");
                System.out.println("break");
                System.out.println("//...");
                System.out.println("}");
                break;
            default:
                System.out.println("Запрос не найден");
        }
    }
}
