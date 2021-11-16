package interfaces;

public class DBLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("DB gönderildi."+message);
    }
}
