import java.util.List;

public class PrintConsole implements Printable{

    public PrintConsole(){

    }

    @Override
    public void print(List list) {
        if(list==null){
            System.out.println("출력할 목록을 지정해주세요");
            return ;
        }
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}
