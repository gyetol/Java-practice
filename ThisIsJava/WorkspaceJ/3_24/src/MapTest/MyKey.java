package MapTest;

public class MyKey {
    private int key;

    public MyKey(int key) {
        this.key = key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }
    @Override
    public boolean equals(Object o) {
        if(o==null){return false;}
        if(!this.getClass().getName().equals(o.getClass().getName())){return false;}
        if(this.key!=((MyKey)o).key){return false;}
        return true;
    }

    @Override
    public int hashCode() {
        final int prime=31;
        int code=1;
        code=prime*code+this.key;
        return code;
    }
}
