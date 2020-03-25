package FileTest;

import java.io.File;
import java.io.IOException;

public class AppStart {
    public static void main(String[] args) {
        File dir = null;
        File file=null;
        dir = new File("C:/temp/backup");
        file= new File("C/temp/backup/result.txt");
        if (!dir.exists()) {
            dir.mkdirs();
            if (!file.exists()) {
                try {
                    System.out.println(file.createNewFile());
                } catch (IOException e) {
                }
            } else {
                System.out.println("log파일이 이미 존재");
            }
        }else{
            System.out.println("경로가 이미존재");}








   /*
        File file=null;
    try {
        //file = new File("C:/Temp/data.txt");
        file=File.createTempFile("temp_",".tmp",new File("/home/kigee/temp"));
        System.out.println(file.getAbsolutePath()+"를 생성하였습니다.");
        file.deleteOnExit();



       *//* if (file.exists()) {
            System.out.println("파일이 존재합니다.");
        } else {
            System.out.println("파일이 존재하지 않습니다.");
            file.createNewFile();
            System.out.println(file.getName()+"을 생성하였습니다.");
        }
    }catch(IOException e){
        e.printStackTrace();
    }*//*
    //file.deleteOnExit(); //프로그램이 종료되면 자동삭제
  //  file.delete();
*/
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
        }
    }

