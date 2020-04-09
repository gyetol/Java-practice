package p1;

import java.util.ArrayList;
import java.util.List;

public class Part { //자바빈 또는 모델이라고 한다.
    private String code;
    private String name;
    private ArrayList<Article> articles;

    public Part(){
        articles = new ArrayList<>();
    } //java bean

    public Part(String code, String name) {
        this();
        this.code = code;
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArticles(List<Article> articles) {
        this.articles =(ArrayList<Article>)articles;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public List<Article> getArticles() {
        return articles;
    }
}
