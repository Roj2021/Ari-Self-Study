package class_20;

import class20.JavaTeacher;

public class University {

    public static void main(String[] args) {


       JavaTeacher jt =new JavaTeacher();

       jt.homework();
        //jt.grade(); // protected not available in different package
        //jt.scholarship(); //default not available in different package
        //jt.extraPoint() //private not visible
    }

}
