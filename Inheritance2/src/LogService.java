public class LogService {
    public void log(int logType){
        if(logType==1){
            System.out.println("db loglandı");
        }else if(logType==2){
            System.out.println("email loglandı");
        }else{
            System.out.println("file loglandı");
        }
    }
}
