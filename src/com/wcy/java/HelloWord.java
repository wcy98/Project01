package com.wcy.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class HelloWord {
    public static void main(String[] args) {

        System.out.println("HelloWord");
        ArrayList list1 = new ArrayList();
        list1.add(0, 123);
        Date date = new Date();

    }

    public void method() {
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
