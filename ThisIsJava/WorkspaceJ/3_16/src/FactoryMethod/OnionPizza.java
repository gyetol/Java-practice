package FactoryMethod;

public class OnionPizza extends Pizza {
    public static final String NAME=" 어니언";

    public OnionPizza(){
        super(NAME);
    }

    @Override
    public String getDescript() {
        return name;
    }
}

// 신메뉴가 추가되면 피자헛팩토리를 뜯어고치는 것이 아니라 새로운 피자헛팩토리를 만들면 된다
