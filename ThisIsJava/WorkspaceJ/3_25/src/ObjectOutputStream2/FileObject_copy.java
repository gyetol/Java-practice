/*
package ObjectOutputStream2;

package ObjectOutputStream2;

import ObjectInputOutputStream.ObjectOut;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class FileObject {
    private File file;
    private ObjectInputStream in;
    private ObjectOutputStream out;

    public FileObject(String fileName) throws Exception{
        this.file=new File(fileName);
        // this.in =new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
        this.out= new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
    }

    //출력스트림을 생성하는 기능
    //입력스트림을 생성하는 기능
    //출력 스트림을 닫는 기능
    //입력 스트림을 닫는 기능

    public synchronized void saveObject(Object obj) throws Exception{
        //입력 스트림 닫음(소멸) (조건: 입력스트림이 생성된 경우)
        //출력 스트림 취득(생성) (조건: 출력스트림이 존재하지 않을 경우)
        out.writeObject(obj);
        out.flush();
    }
    public List<Object> getObjects() throws Exception{
        LinkedList<Object> list =new LinkedList<>();
        //출력 스트림 닫음(소멸) (조건: 출력스트림이 생성된 경우)
        //입력 스트림 취득(생성) (조건: 입력스트림이 존재하지 않을 경우)

        synchronized (this) {
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

    public synchronized void close(){
        try {
            in.close();
        }catch (Exception e){}

        try{
            out.close(); //이렇게 in과 out을 따로 처리해야한다
        }catch (Exception e){}
    }
}
*/
