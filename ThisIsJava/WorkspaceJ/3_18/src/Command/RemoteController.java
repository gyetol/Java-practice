package Command;

public class RemoteController {
    private Command[] coms;

    public RemoteController(){
        coms=new Command[4];
    }
    public void setCommand(int index,Command cmd){
        try{
            coms[index]=cmd;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println("잘못된 슬롯번호입니다.");
            System.err.println("사용가능한 번호는 0번~"+(coms.length-1)+"번까지입니다.");
        }
    }
    public void buttonPressed(int index){
        try{
            coms[index].execute();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println("잘못된 슬롯번호입니다.");
            System.err.println("사용가능한 번호는 0번~"+(coms.length-1)+"번까지입니다.");
        }
        catch (NullPointerException e){
            System.out.println("해당 슬롯에 할당된 명령이 없습니다.");
            for(int i=0;i<coms.length;i++){
                if(coms[i]==null){
                    System.err.println(i+": 비어있음");
                }
                else{
                    System.err.println(i+":"+coms[i].getClass().getName());
                }
            }
        }
    }
}
