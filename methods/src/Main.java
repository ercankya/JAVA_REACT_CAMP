public class Main {

    public static void main(String[] args) {
        sayiBulma(3);
    }

    public static void sayiBulma(int aranacak) {
        int[] sayılar = new int[]{1, 2, 5, 7, 9, 0};
        boolean isVar = false;

        for (int say : sayılar) {
            if (say == aranacak) {
                isVar = true;
                break;
            }
        }
        mesajVer(isVar, aranacak);

    }

    public static void mesajVer(boolean isVar, int aranacak) {
        if (isVar) {
            System.out.println(aranacak + " Sayısı listede var");
        } else {
            System.out.println(aranacak + " Sayısı listede yok");
        }
    }
}
