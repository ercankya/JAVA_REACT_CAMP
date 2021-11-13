public class Main {

    public static void main(String[] args) {
        char grade = 'A';


        switch (grade) {
            case 'A':
                System.out.println("Mükemmel: Geçtiniz");
                break;
            case 'B':
                System.out.println("Iyi: Geçtiniz");
                break;
            case 'C':
                System.out.println("Fena Değil: Geçtiniz");
                break;
            case 'D':
                System.out.println("Malesef: Kaldınız");
                break;
            case 'F':
                System.out.println("Kötü: Kaldınız");
                break;
        }
    }
}
