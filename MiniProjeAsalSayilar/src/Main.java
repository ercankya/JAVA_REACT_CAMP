public class Main {

    public static void main(String[] args) {
        int number = 25;

        int reminder = number % 2;
        boolean isPrime = true;
        if(number<1){
            System.out.println("Gecersiz Sayı");
            return;
        }
        if(number==1){
            System.out.println("Sayı asal değildir");
            return;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime){
            System.out.println("Sayı asaldır");
        }else{
            System.out.println("Sayı asal değildir.");
        }
    }
}
