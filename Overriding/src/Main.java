public class Main {

    public static void main(String[] args) {
        BaseKrediService[] krediServices = new BaseKrediService[]{new OgretmenKrediService(), new TarimKrediService(),new OgrenciKrediService()};
        for (BaseKrediService krediService:krediServices){
            System.out.println(krediService.hesapla(1000));
        }
    }
}
