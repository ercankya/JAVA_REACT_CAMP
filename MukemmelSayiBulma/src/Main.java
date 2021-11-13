public class Main {

    public static void main(String[] args) {
        int number = 28;
        int max = 1000;
        int count=0;
        for (int j = 2; j < max; j++) {
            int total = 0;
            for (int i = 1; i < j; i++) {
                if (j % i == 0) {
                    total = total + i;
                }
            }
            if (total == j) {
                System.out.println("Mükemmel sayıdır.");
                count++;
            } else {
                System.out.println("Mükemmel sayı değildir.");
            }
        }
        System.out.println(count);
    }
}
