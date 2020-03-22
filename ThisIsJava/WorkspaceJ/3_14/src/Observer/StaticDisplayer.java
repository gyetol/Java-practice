package Observer;

public class StaticDisplayer extends Observer{
    WeatherData wd;

    public StaticDisplayer(WeatherData wd){
        this.wd=wd;
    }


    public void update(){
        int temp=wd.getTemp();
        int humi= wd.getHumi();
        int pres=wd.getPres();

        System.out.println("--------------");
        System.out.println("온도 : "+temp+"도");
        System.out.println("습도 : "+humi+"%");
        System.out.println("기압 : "+pres+"밀리바");
        System.out.println("--------------------");

    }

}
