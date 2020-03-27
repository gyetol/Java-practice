package TeamProject_School;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintPrinter {
    public void print() {
        List<Student> list = new ArrayList<>();
        list.add(new Student("a", "국문",1,80));
        list.add(new Student("a", "영문",2,90));
        list.add(new Student("a", "수학",3,100));

        Socket socket = null;
        PrintWriter sout = null;
        try {
            socket = new Socket("192.168.30.129", 9000);
            System.out.println("프린터 접속 성공!");
            sout = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
            Iterator<Student> it = list.iterator();
            while (it.hasNext()) {
                String sendMessage = it.next().toString();
                sout.println(sendMessage);
                sout.flush();
            }
        }
        catch (Exception e) {}
        finally {
            try {
                socket.close();
            }
            catch (Exception e) {}
        }
    }
}
