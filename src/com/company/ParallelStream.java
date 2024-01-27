package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class ParallelStream {

    // Main driver method
    public static void main(String[] args) throws IOException {

        // Creating a File object
        File fileName = new File("M:\\Documents\\Textfile.txt");

        // Create a Stream of string type
        // using the lines() method to
        // read one line at a time from the text file
        try{
            Stream<String> text = Files.lines(fileName.toPath());

            // Creating parallel streams using parallel() method
            // later using forEach() to print on console
            text.parallel().forEach(System.out::println);

            // Closing the Stream
            // using close() method
            text.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

}
