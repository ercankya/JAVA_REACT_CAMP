public class Main {

    public static void main(String[] args) {
        int toplam = topla(1, 5, 8, 9);
        System.out.println(toplam);
    }

    public static void ekle() {
        System.out.println("eklendi.");
    }

    public static void sil() {
        System.out.println("silindi.");
    }

    public static void guncelle() {
        System.out.println("güncellendi.");
    }

    public static int topla(int say1, int say2) {
        return say1 + say2;
    }

    public static int topla(int... sayilar) {
        int toplam = 0;
        for (int say : sayilar) {
            toplam += say;
        }
        return toplam;
    }

    public static String sehirVer() {
        return "Ankara";
    }

}
