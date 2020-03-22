package Observer;

public class WeatherData extends Subject{

    Observer[] observer;
    private int count;
    private int temp;
    private int humi;
    private int pres;

    public WeatherData(){
        observer= new Observer[10];
    }
    public void addObserver(Observer o){
        if (count<observer.length){
            observer[count++]=o;
        }
    }
    public void notifyObserver(){
        for(int i=0; i<count;i++){
            observer[i].update();
        }
    }

    public void setHumi(int humi) {
        this.humi = humi;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public void setPres(int pres) {
        this.pres = pres;
    }

    public int getHumi() {
        return humi;
    }

    public int getPres() {
        return pres;
    }

    public int getTemp() {
        return temp;
    }
}
