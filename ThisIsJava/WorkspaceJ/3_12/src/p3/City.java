package p3;

public enum City {
    SEOUL(0),DAEJEON(105),GWANGU(200),BUSAN(450),JEJU(600);
    private int km;

    private City(int km){
        this.km=km;
    }

    public int getKm() {
        return km;
    }
}
