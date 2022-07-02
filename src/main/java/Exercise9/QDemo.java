package Exercise9;

public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Использование очереди bigQ для сохранения алфавита");
        //Помещение буквеных символов в очередь bigQ
        for (i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }

        //Извлечение и отображение буквенных символов из очереди bigQ
        System.out.println("Содержимое очереди bigQ ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) {
                System.out.println(ch);
            }
        }
        System.out.println("\n");
        System.out.println("Использование очереди smallQ для генерации ошибок");
        for (i = 0; i < 5; i++) {
            System.out.println("Попытка сохранения " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();

        // Дополнительные ошибки при обращении к очереди smallQ
        System.out.println("Содержимое очереди smallQ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) {
                System.out.println(ch);
            }
        }
    }
}

class Queue {
    char[] q;
    int putlok;//Вставка в очередь
    int getlok;//Извлечение из очереди

    Queue(int size) {
        q = new char[size];//Выделение памяти для очереди
        putlok = getlok = 0;
    }

    void put(char ch) {
        if (putlok == q.length) {
            System.out.println("Очередь заполнена");
            return;
        }
        q[putlok++] = ch;
    }

    char get() {
        if (getlok == putlok) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        return q[getlok++];
    }
}