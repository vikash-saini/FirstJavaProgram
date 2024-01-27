package com.company;
/**
 * This is the demonstration of Java
* @author Vikash.saini
 * @version  1.0
 * @since 2021
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/GregorianCalendar.html">JavaDocs</a>
 */

class TestClass{
    @Deprecated
    void meth1(){
        System.out.println("THis method is depricated");
    }
}
public class JavaDocs {



    /**
     *
     * @param args These are arguments sipplied to java
     */
    public static void main(String[] args) {
        System.out.println("this is the main method");

        TestClass tc =  new TestClass();
        tc.meth1();
    }

    /**
     * This is the description  line
     * @param a first number
     * @param b second number
     * @return sum of a and b
     * @throws Exception if a=0
     */
    public int add(int a,int b) throws Exception{
        if(a==0){
            throw new Exception();
        }
        return a+b;
    }
}
