import java.io.ObjectOutputStream;

public class PrintFile implements Printable {
    private ObjectOutputStream writer;
    String filename;

    public PrintFile(ObjectOutputStream writer,String filename)
    {
        this.writer=writer;
        this.filename=filename;
    }

    @Override
    public void print() {

    }
}
