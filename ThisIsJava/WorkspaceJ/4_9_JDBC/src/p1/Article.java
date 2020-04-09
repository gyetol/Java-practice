package p1;

public class Article { //자바빈 또는 모델이라고 한다.
    private int id;
    private String code;
    private String writer;
    private String title;
    private String content;
    private String regdate;
    private Part part;

    public Article() {
        part=null;
    }

    public Article(int id, String code, String writer, String title, String content, String regdate) {
        this();
        this.id = id;
        this.code = code;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.regdate = regdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }
}
