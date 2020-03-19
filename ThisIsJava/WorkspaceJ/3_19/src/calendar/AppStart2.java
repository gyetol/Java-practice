package calendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AppStart2 {
    public static void main(String[] args) {

        SimpleDateFormat sdf= new SimpleDateFormat("[yyyy년 MM월 dd일 HH시 mm분 ss초 SSS]:메시지");
        for(int i=0;i<10;i++)
        {
            Calendar cal = Calendar.getInstance(); //생성될 때의 시간을 가지고 있다.
            String date = sdf.format(cal.getTime());
            System.out.println(date);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){

            }

        }

    }
}
