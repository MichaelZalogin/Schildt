package Exercise2;

/*Необходимо видоизменить программу, чтобы вместо логических значений
true и false отображались значения 0 и 1.*/
public class LogicalOpTable {
    public static void main(String[] args) {
        int p, q;
        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

        p = 0b1;
        q = 0b1;
        System.out.print(p + "\t\t" + q + "\t\t");
        System.out.print((p & q) + "\t\t" + (p | q) + "\t\t");
        System.out.println((p ^ q) + "\t\t" + (p ^ 1) + "\t\t");

        p = 0b1;
        q = 0b0;
        System.out.print(p + "\t\t" + q + "\t\t");
        System.out.print((p & q) + "\t\t" + (p | q) + "\t\t");
        System.out.println((p ^ q) + "\t\t" + (p ^ 1) + "\t\t");

        p = 0b0;
        q = 0b1;
        System.out.print(p + "\t\t" + q + "\t\t");
        System.out.print((p & q) + "\t\t" + (p | q) + "\t\t");
        System.out.println((p ^ q) + "\t\t" + (p ^ 1) + "\t\t");

        p = 0b0;
        q = 0b0;
        System.out.print(p + "\t\t" + q + "\t\t");
        System.out.print((p & q) + "\t\t" + (p | q) + "\t\t");
        System.out.println((p ^ q) + "\t\t" + (p ^ 1) + "\t\t");
    }
}