package FileTest;

import java.io.File;

public class AppStart2 {


    public static  void search(File dir) {

       // dir = new File("C:/temp/");
        File[] list = dir.listFiles();
        for (File f : list) {
            System.out.printf("%s %10s\n", (f.isDirectory() ? "DIR" : "FILE"), f.getAbsolutePath());
            //  System.out.printf("%s %5d %s %10s\n",(f.isDirectory()?"DIR":"FILE"),f.length(),f.lastModified(),f.getName());
            if (f.isDirectory() && f.canRead() && f.canExecute()) { //읽기가 가능해야 하고 실행이 가능해야 한다
                search(f);
            }
        }
    }
    public static void main(String[] args) {
        search(new File("C:/temp"));
    }
}
