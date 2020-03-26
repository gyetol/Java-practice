package ObjectOutputStream2;

import ObjectInputOutputStream.ObjectOut;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class FileObject {
    private File file;
    private ObjectInputStream in = null;
    private ObjectOutputStream out = null;

    public FileObject(String fileName) throws Exception {
        this.file = new File(fileName);
        // this.in =new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
        //this.out= new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
    }

    //출력스트림을 생성하는 기능
    //입력스트림을 생성하는 기능
    //출력 스트림을 닫는 기능
    //입력 스트림을 닫는 기능
    private void InOpen() {
        try {
            this.in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void OutOpen() {
        try {
            this.out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void InClose() {
        try {
            in.close();
            in = null;
        } catch (Exception e) {
        }
    }

    private void OutClose() {
        try {
            out.close();
            out = null;
        } catch (Exception e) {
        }
    }


    public synchronized void saveObject(Object obj) throws Exception {

        //입력 스트림 닫음(소멸) (조건: 입력스트림이 생성된 경우)
        //출력 스트림 취득(생성) (조건: 출력스트림이 존재하지 않을 경우)
        if (this.in != null) {
            this.InClose();
        }
        this.OutOpen();

        out.writeObject(obj);
        out.flush();
    }

    public List<Object> getObjects() throws Exception {
        //출력 스트림 닫음(소멸) (조건: 출력스트림이 생성된 경우)
        //입력 스트림 취득(생성) (조건: 입력스트림이 존재하지 않을 경우)


        LinkedList<Object> list = new LinkedList<>();


        synchronized (this) {
            if (this.out != null) {
                this.OutClose();
               this.InOpen();
            }
           else{
                this.OutOpen();
            }


            while (true) {
                try {
                    Object obj = in.readObject();
                    list.add(obj);
                } catch (EOFException e) {
                    break;
                }
            }
        }
        return list;
    }

    /*public synchronized void close(){
        try {
            in.close();
        }catch (Exception e){}

        try{
            out.close(); //이렇게 in과 out을 따로 처리해야한다
        }catch (Exception e){}
    }*/
}
