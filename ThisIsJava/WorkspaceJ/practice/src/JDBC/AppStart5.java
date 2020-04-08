package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import JDBC.DAO.*;
public class AppStart5 {


    public static void main(String[] args) {
        MyConnection con=null;
        ArrayList<Category> categories =CategoryDAO.getCategory();
        for(Category category:categories){
           category.setComics(ComicDAO.getComic(category));
        }
        System.out.println("프로그램 종료");
    }
}
