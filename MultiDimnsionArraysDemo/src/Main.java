public class Main {

    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "istanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Gaziantep";
        sehirler[2][2] = "ŞanlıUrfa";
        for (String sehir[] : sehirler) {
            for (String s : sehir) {
                System.out.println(s);
            }
            System.out.println("/////////////");
        }
    }
}