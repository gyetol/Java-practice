package Pattern_ObjectInOutstream;

import java.util.Set;
public interface Accessable {
    void saveSchool(School school,String fileName) throws Exception;
    void restoreSchool(School school,String fileName) throws Exception;
}
