package Buffered;

import java.io.InputStream;

public class MyBufferedInputStream extends java.io.BufferedInputStream {
    public MyBufferedInputStream(InputStream stream) {
        super(stream);
    }

    public MyBufferedInputStream(InputStream stream, int size) {
        super(stream, size);
    }

    public byte[] getBuffer(){
        return super.buf;
    }

}
