package calendar;

import java.util.Calendar;

public class AppStart {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance(); //캘린더는 자기 자식 타입을 만들어서 자기 타입으로 반환함
        StringBuilder sb= new StringBuilder();
        sb.append(cal.get(Calendar.YEAR)).append("년")
                .append(cal.get(Calendar.MONTH)+1).append("월")
                .append(cal.get(Calendar.DAY_OF_MONTH)).append("일")
                .append(cal.get(Calendar.HOUR)).append("시")
                .append(cal.get(Calendar.MINUTE)).append("분")
                .append(cal.get(Calendar.SECOND)).append("초");
        System.out.println("현재시간은"+sb);


        cal.set(Calendar.HOUR,cal.get(Calendar.HOUR)+500); //오늘로부터 500시간 후
        sb= new StringBuilder();
        sb.append(cal.get(Calendar.YEAR)).append("년")
                .append(cal.get(Calendar.MONTH)+1).append("월")
                .append(cal.get(Calendar.DAY_OF_MONTH)).append("일")
                .append(cal.get(Calendar.HOUR)).append("시")
                .append(cal.get(Calendar.MINUTE)).append("분")
                .append(cal.get(Calendar.SECOND)).append("초");
        System.out.println("현재시간은"+sb);

        cal.set(Calendar.DAY_OF_MONTH,cal.get(Calendar.DAY_OF_MONTH)+1000);
        sb= new StringBuilder();
        sb.append(cal.get(Calendar.YEAR)).append("년")
                .append(cal.get(Calendar.MONTH)+1).append("월")
                .append(cal.get(Calendar.DAY_OF_MONTH)).append("일")
                .append(cal.get(Calendar.HOUR)).append("시")
                .append(cal.get(Calendar.MINUTE)).append("분")
                .append(cal.get(Calendar.SECOND)).append("초");
        System.out.println("현재시간은"+sb);
    }
}
