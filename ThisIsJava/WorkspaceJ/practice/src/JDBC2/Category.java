package JDBC2;

import java.util.ArrayList;

public class Category {
    private String code;
    private String name;
    private ArrayList<Comic> comics;

    public Category(){
        this.comics=new ArrayList<>();
    }

    public Category(String code, String name) {
        this();
        this.code = code;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setComics(ArrayList<Comic> comics) {
        this.comics = comics;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public ArrayList<Comic> getComics() {
        return comics;
    }

    public void addComic(Comic comic){
        this.comics.add(comic);
    }
}