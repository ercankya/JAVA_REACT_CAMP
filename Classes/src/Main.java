public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager();
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        int say1=10;
        int say2=20;
        say2=say1;
        say1=30;
        System.out.println(say2);

        int[] says1=new int[]{1,2,3};
        int[] says2=new int[]{9,8,7};
        says2=says1;
        says1[0]=10;
        System.out.println(says2[0]);
    }
}
