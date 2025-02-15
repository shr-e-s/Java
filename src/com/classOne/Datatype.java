package com.classOne;

//Datatype is used to define the type of data that a variable can hold

import java.sql.SQLOutput;

public class Datatype {
    //Java has 2 types of datatypes

    //Primitive Datatype

    //integer type
    byte b = 50;
    short s = 500;
    int i = 14253678;
    long l = 12345679L;

    //decimal type
    float f = 1.45f;
    double d = 1.2456;

    boolean t = true;
    boolean fa = false;

    char c = 'A';

    //Non-primitive Datatype
    //arrays
    //collections
    //interface
    //class

    //wrapper classes is used to perform actions on datatypes
    public static void main(String[] args) {
        System.out.println(Byte.SIZE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
    }

}
