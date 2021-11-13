public class Main {

    public static void main(String[] args) {
        //for
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Döngü bitti.");
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("Çift sayı Döngüsü bitti.");
        for (int i = 1; i < 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("Tek sayı Döngüsü bitti.");
        ///While
        int i=0;
        while(i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("while döngüsü bitti");
        //do-While
        //şart sağlanmasa bile bir kere do çalışır.
        int j=0;
        do {
            System.out.println(j);
            j++;
        }while(j<10);
        System.out.println("do-While döngüsü bitti");
    }
}
