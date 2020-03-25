package FileTest;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;


public class AppStart3 {
    public static void main(String[] args) {
        //search(new File("C:/temp"));

        //LinkedList<File> queue = new LinkedList<>();


        Queue<File> queue = new LinkedList<>(); //큐타입으로 볼 수 있다. implement했으므로
        queue.add(new File("C:/temp"));
        while(!queue.isEmpty())
        {
            File v =queue.poll();
            System.out.printf("%5s %s",(v.isDirectory()?"DIR":"FILE"),v.getAbsolutePath());
            File[] list = v.listFiles();
            for(File u :list){
                if(u.isDirectory() && u.canExecute() &&u.canRead()){
                    queue.add(u);
                }
                else{
                    System.out.printf("%5s %s",(v.isDirectory()?"DIR":"FILE"),u.getAbsolutePath());
                }
            }
        }

    }
}
