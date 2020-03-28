package StatePattern;

public class SlotMachine {
    boolean inCoin;
    boolean lever;

    public SlotMachine(){
        inCoin=false;
        lever=false;
    }
    public void coinInput(){
        if(inCoin){
            System.out.println("코인은 한번에 하나만 투입이 가능합니다.");
            return;
        }
        System.out.println("코인이 투입되었습니다.");
        inCoin=true;
        lever=false;
    }
    public void leverPull(){
        if(!inCoin){
            System.out.println("우선 코인을 넣어주세요");
            return;
        }
        if(lever){
            System.out.println("레버가 당겨진 상태입니다.");
            return;
        }
        System.out.println("레버를 당깁니다.");
        lever=true;
        try{
            Thread.sleep(1000);
        }catch (Exception e){}
        inCoin=false;
        lever=false;
    }
}
