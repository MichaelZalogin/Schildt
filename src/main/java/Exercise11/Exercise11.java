package Exercise11;

public class Exercise11 {
    public static void main(String[] args) {
        String msg = "Это просто текст";
        String encmsg = "";
        String decmsg = "";
        int key = 88;

        System.out.println("Исходное сообщение");
        System.out.println(msg);

        // Шифрование
        for (int i = 0; i < msg.length(); i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ 88);
        }
        System.out.println("Шифровка:");
        System.out.println(encmsg);

        // Дешифровка
        for (int i = 0; i < msg.length(); i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);
        }
        System.out.println("Расшифровка:");
        System.out.println(decmsg);
    }
}