package Abstract_Method_FactoryPattern;

public class BenzCarStore extends CarStore {
private static final String NAME="벤츠차대리점";

    public BenzCarStore() {
        super(NAME);
    }

    public Car order(){
        System.out.println(name+"에서 자동차를 주문받음");
        Car car=factory.createCar();
        System.out.println(factory.getName()+"으로 부터 "+car.getName()+"이 출고되었습니다.");
        return car;
    }
}
