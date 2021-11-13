public class Main {

    public static void main(String[] args) {
        double[] myList = {4.2, 5.2, 88.3, 6.3, 7.1, 2.9, 3.3, 9.1};
        double total=0;
        double max=0;
        for (double say:myList){
            if(max<say){
                max=say;
            }
            total=total+say;
            System.out.println(say);
        }
        System.out.println("Max Sayısı: "+max);
        System.out.println("Toplam :"+total);
    }
}
