package com.company;

import java.io.*;

public class Serialization {
   public String filename = "test.txt";
    public static void main(String[] args) {
        MySerializationClass obj = new MySerializationClass(1, "vikas");
        Serialization n = new Serialization();
        try {

            FileOutputStream file = new FileOutputStream(n.filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(obj);
            out.close();
            file.close();
            System.out.println("Object has been Seriallized");
        }catch (IOException ex){
            System.out.println("error: "+ex);
        }
        n.deSerialize();

    }

    public void deSerialize(){

        try{
//          /Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

//             Method for deserialization of object
            MySerializationClass  object1 = (MySerializationClass)in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserialized ");
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);

        }catch (IOException ex){
            System.out.println("exception");
        }catch (ClassNotFoundException ex){
            System.out.println("class not found: "+ex);
        }
    }
}

class MySerializationClass implements java.io.Serializable{

    public int a;
    public String b;

    public MySerializationClass(int a,String b){
        this.a = a;
        this.b =b;
    }

}