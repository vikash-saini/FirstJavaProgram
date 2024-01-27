package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class practiceSet3 {
    public static void main(String[] args) {
//        ex 1: write a multiplication table

        int i =19;
        String table  = "";
        for (int j = 0; j < 10; j++) {

            table += i+"X"+(j+1)+"="+i*(j+1);
            table +="\n";

        }

        try {
            FileWriter myFile = new FileWriter("multiplication.txt");
            myFile.write(table);
            myFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
