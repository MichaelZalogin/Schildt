package Exercise6;

public class ForVar {
    public static void main(String[] args) {
        int fact = 1;
        int summ = 0;
        for (int i = 1; i <= 5; i++) {
            fact = fact * i;
            summ = summ + i;
        }
        System.out.println(fact);
        System.out.println(summ);
    }
}
