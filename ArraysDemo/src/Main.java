public class Main {

    public static void main(String[] args) {
        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Cemil";
        String ogrenciler2[] = {"Engin", "Derin", "Cemil", "Ceren"};
        System.out.println(ogrenciler2);

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("bitti1");
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
        System.out.println("bitti2");
        for (String ogrenci : ogrenciler2) {
            System.out.println(ogrenci);
        }
        System.out.println("bitti3");
    }
}
