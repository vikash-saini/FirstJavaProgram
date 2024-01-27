package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileClass {
   static final String basePath="C:/Users/vikash.saini/Desktop/Practice";
    public static void main(String[] args) {
//        code to create file
        String destinationPath = getBasePath();
        System.out.println(destinationPath);

        File dirpath = new File(destinationPath);
        File myfile = new File(dirpath+"/test.txt");

        if (!dirpath.exists()){
            dirpath.mkdir();
            System.out.println("directory created");
            try {
                myfile.createNewFile();
                System.out.println(myfile.getAbsoluteFile());
                System.out.println("file created successfully");
            } catch (IOException e) {
                System.out.println(e.getMessage());
                System.out.println("Unable to create file");
            }
        }else{
            try {
                myfile.createNewFile();
                System.out.println(myfile.getAbsoluteFile());
                System.out.println("file created successfully");
                if (myfile.exists()){
                    FileWriter fw = new FileWriter(myfile.getAbsoluteFile());
                    fw.write("This is first heading");
                    fw.close();
                    System.out.println("written success");
                }

            } catch (IOException e) {
                System.out.println(e.getMessage());
                System.out.println("Unable to create file");
            }
        }



//      code to write to a file
        /*
        try{
            FileWriter fw = new FileWriter("test.txt");
            fw.write("This is our first file\n Ok by now");
            fw.close();
            System.out.println("written success");
        }catch (Exception e){
            System.out.println("unable to write");
        }
        */

//        Code to Read a file
        /*
        File myfile1 = new File("test.txt");
        try {
//            will read the file with thge help of scanner class
            Scanner sc = new Scanner(myfile1);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
*/
//        code to delete file
//        File myFile2 = new File("test.txt");
//        if (myFile2.delete()){
//            System.out.println("Hurray , i have deleted the file");
//        }else{
//            System.out.println("UInable to file file");
//        }


    }

    public static String getBasePath(){
        return basePath.concat("/files");
    }
}
