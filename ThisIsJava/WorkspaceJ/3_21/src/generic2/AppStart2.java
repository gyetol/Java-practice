/*
package generic2;

import java.util.Arrays;

public class AppStart2 {


    public static void showListPerson(Course<?> course){
        Arrays.toString(course.getStudents());

    }

    public static void showListStudent(Course<? extends Student>course){
        Arrays.toString(course.getStudents());
    }

    public static void showListCollegeStudent(Course<? super CollegeStudent>course){
        Arrays.toString(course.getStudents());
    }

    public static void showListWorker(Course<? super Worker>course){
        Arrays.toString(course.getStudents());
    }
   public static void main(String[] args) {
        Course<Person> personCourse = new Course<>("전체과정",10);
        Course<Student> studentCourse = new Course<>("학생과정",10);
        Course<CollegeStudent> collegeStudentCourse=new CollegeStudent<>("대학생과정",10);
        Course<Worker> workerCourse =new Course<>("직장인과정",10);

        showListPerson(personCourse);
        showListPerson(workerCourse);
        showListPerson(studentCourse);
        showListPerson(collegeStudentCourse);

        showListStudent(personCourse);
        showListStudent(workerCourse);
        showListStudent(studentCourse);
        showListStudent(collegeStudentCourse);


    }
}
*/
