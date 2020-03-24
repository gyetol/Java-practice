package MapTest;

public class MyValue {
    private String value;

    public MyValue(String value) {
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if(o==null){return false;}
        if(!this.getClass().getName().equals(o.getClass().getName())){return false;}
        if(this.value!=((MyValue)o).value){return false;}
        return true;
    }

    @Override
    public int hashCode() {
        final int prime=31;
        int code=1;
        code=prime*code+ Integer.parseInt(this.value); //String을 int로 변환
        return code;
    }
}
