public class Main {

    public static void main(String[] args) {
        int[] sayılar=new int[]{1,2,5,7,9,0};
        int aranacak=4;
        boolean isVar=false;

        for (int say:sayılar){
            if(say==aranacak){
                isVar=true;
                break;
            }
        }
        if(isVar){
            System.out.println("Sayı listede var");
        }else {
            System.out.println("Sayı listede yok");
        }
    }
}
