package Command_practice;

public class RemoteController {
    private Command[] onCmds;
    private Command[] offCmds;
    private Command undoCmd;

    public RemoteController(int num) {
        onCmds = new Command[num];
        offCmds = new Command[num];
    }

    public void setCommand(int index, Command onCmd, Command offCmd) {
        try {
            onCmds[index] = onCmd;
            offCmds[index] = offCmd;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("잘못된 슬롯번호입니다");
            System.out.println("현재 사용가능한 슬롯번호는 0번부터" + (onCmds.length - 1) + "번 까지입니다.");
        }
    }

    public void onButtonClick(int index) {
        try {
            onCmds[index].execute();
            System.out.println(onCmds[index].getDescript());
            undoCmd=offCmds[index];
        } catch (NullPointerException e) {
            System.out.println("해당 슬롯에 할당된 명령이 없습니다.");
            for (int i = 0; i < onCmds.length; i++) {
                if (onCmds[i] == null) {
                    System.out.println(i + ": 비어있음");
                } else {
                    System.out.println(i + ": " + onCmds.getClass().getName());
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("잘못된 슬롯번호입니다.");
            System.out.println("현재 사용가능한 슬롯번호는 0번부터" + (onCmds.length - 1) + "번 까지입니다.");
        }

    }

    public void offButtonClick(int index) {
        try {
            offCmds[index].execute();
            System.out.println(offCmds[index].getDescript());
            undoCmd=onCmds[index];
        }
        catch (NullPointerException e) {
            System.out.println("해당 슬롯에 할당된 명령이 없습니다.");
            for (int i = 0; i < offCmds.length; i++) {
                if (offCmds[i] == null) {
                    System.out.println(i + ": 비어있음");
                } else {
                    System.out.println(i + ": " + offCmds.getClass().getName());
                }
            }
        } catch (
                ArrayIndexOutOfBoundsException e) {
            System.out.println("잘못된 슬롯번호입니다.");
            System.out.println("현재 사용가능한 슬롯번호는 0번부터" + (offCmds.length - 1) + "번 까지입니다.");
        }

    }

    public void undoButtonClick() {
        undoCmd.execute();
        System.out.println(undoCmd.getDescript());
    }
}
