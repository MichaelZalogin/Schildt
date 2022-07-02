package Exercise10;

// Телефонный справочник. Поиск осуществляется передачей аргумента в метод main
public class Phone {
    public static void main(String[] args ) {
        String[] name = {"Tom", "Mary", "John", "Rachel"};
        String[] number = {"555-3322", "555-8976", "555-1037", "555-1400"};
        String[][] contacts = new String[2][];
        contacts[0] = name;
        contacts[1] = number;
        int i;

        if (args.length != 1) {
            System.out.println("Использование: java Phone <имя>");
        } else {
            for (i = 0; i <= contacts.length; i++) {
                if (contacts[i][0].equals(args[0])) {
                    System.out.println(contacts[i][0] + ":" + contacts[i][1]);
                    break;
                }
            }
            if (i == contacts.length) {
                System.out.println("Имя не найдено.");
            }
        }
    }
}