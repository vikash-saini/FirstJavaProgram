package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class RecursionExample {

    static int rvalue=0;
    static void reverse(int n){

        if(n==0){
            return;
        }
        int reminder = n%10;
        rvalue=rvalue *10 +reminder;
        reverse(n/10);
    }

    public static void main(String[] args) {

//     Q1 Fibonacci number of 4
      int k=  fibo(8);
        System.out.println(k);

        System.out.println("print 5 number in descending order:5,4,3,2,1");

        print(5);

//        recursion in binary search
        int[] arr ={2,5,8,15,20};
        int target = 30;
        int endposition = arr.length-1;
        int startposition =0;

//        System.out.format("position of /ne")
        System.out.println("position in array: "+search(arr,target,startposition,endposition));

//        recursion in factorial number
        int fn = fact(4);
        System.out.println("factorial:"+fn);

//        System.out.println(8765%10);

        int ans=sum(4365);
        System.out.println(ans);
        System.out.println("multiply: "+multiply(34));

        //        reverse number
        int n =45678;
        String s = Integer.toString(n);
        System.out.println(s);
        String[] ar= s.split("");

        System.out.println(s);
        System.out.println(ar[0]);
        reverse1(n,ar[0]);
        System.out.println("");
//        System.out.println(1%10);

        reverse(6543);
        System.out.println("reverse number: "+rvalue);

//        count zero
      int c=  countZero(3406050);
        System.out.println("total zeros: "+c);

        int st = steps(45);
        System.out.println("no. of steps: "+st);

        int[] arrr = {2,4,18,10,10};
        System.out.println(checksorted(arrr,0));

        System.out.println("linear search: "+linearSearch(arrr,10,0));

        System.out.println("findlastIndex: "+findlastIndex(arrr,10, arrr.length-1));

        ArrayList<Integer> indextList = findallIndex(arrr,10,0,new ArrayList());
        System.out.println("indextList: "+indextList);

        System.out.println("withpassing list: "+findallIndex2(arrr,10,0));

        StringBuffer stt = removeChar("aadfgajka",'a',0,new StringBuffer());
        System.out.println(stt);

        String newStr = removeChar2("aadfdag",new String());
        System.out.println(newStr);

        System.out.println(removeApple("iwantapplegive",new String()));
        System.out.println(removeAppNotApple("iappwantapplegive",new String()));

        subSeq("abc","");

        subSeqAscii("abc","");

    }

    static int fibo(int n){
//        preknown concept
//        fibo(0)=0;
//        fibo(1)=1;
//        0,1,1,2,3,5,8,13,21,34....

//        base condition
        if (n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);


    }

    static void print(int n){


//    recusrion should have a base condition of stop the execution
        if (n<1){
            return;
        }
        System.out.println(n);


//    this is called tail recursion,because this is the last function to be called
        print(n-1);
    }

    static int search(int[] arr,int target,int s,int e){

        if (s>e){
            return -1;
        }

//      divide and calculate mid position
        int m = s+(e-s)/2;

        if (arr[m] == target){
            return m;
        }

        if (target <arr[m]){
            return search(arr,target,s,m-1);
        }

        return search(arr,target,m+1,e);

    }

//    factorial of n
    static int fact(int n){

        if (n==0){
            return 1;
        }

        return n*fact(n-1);
    }

    static int sum(int n){

        if(n%10==n){
            return n;
        }

        return n%10 + sum(n/10);
    }

    static int multiply(int n){
        if(n%10==n){
            return n;
        }

        return n%10 * sum(n/10);
    }

    static void reverse1(int n,String f){
        System.out.print(n%10);
        if(n%10==Integer.parseInt(f)){
            return;
        }

        reverse1(n/10,f);
    }

//    Palindromic number-are number which remain same when it's digits are reverse. ex- 10001,3663,2442,

//    count zeros in a number
    static int countZero(int n){
        return helperCount(n,0);
    }

    static int helperCount(int n, int c){

        if (n==0){
            return c;
        }

        if (n%10 ==0){
           return helperCount(n/10,c+1);
        }

        return helperCount(n/10,c);
    }

//    count number of steps to reduce a number to zero

    static int steps(int n){
        return helperReduce(n,0);
    }

    static int helperReduce(int n,int steps){

        if (n==0){
            return steps;
        }

        if (n%2 == 0){
            return helperReduce(n/2,steps+1);
        }

        return helperReduce(n-1,steps+1);
    }

//    check if array is sorted
    static boolean checksorted(int[] arrr, int index){

       if (index == arrr.length -1){
           return true;
       }
       return arrr[index]<arrr[index+1] && checksorted(arrr,index+1);
    }

//    linearSearch in array
    static int linearSearch(int[] arr,int target,int startIndex){
        if(startIndex >= arr.length){
            return -1;
        }
        if (arr[startIndex] == target){
            return startIndex;
        }

        return linearSearch(arr,target,startIndex+1);
    }

    static int findlastIndex(int[] arr,int target,int endIndex){
        if(endIndex >= arr.length){
            return -1;
        }
        if (arr[endIndex] == target){
            return endIndex;
        }

        return linearSearch(arr,target,endIndex-1);
    }


    static ArrayList<Integer> findallIndex(int[] arr, int target, int index, ArrayList list){
        if(index >= arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }

        return findallIndex(arr,target,index+1,list);
    }

    //    without passing list argument
    static ArrayList<Integer> findallIndex2(int[] arr, int target, int index){
        ArrayList list=new ArrayList();
        if(index >= arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansfrombelowcalls = findallIndex2(arr,target,index+1);

        list.addAll(ansfrombelowcalls);
        return list;
    }

//    remove a character from string
    static StringBuffer removeChar(String org,char ch,int index,StringBuffer newStr ){

        if(index >= org.length()){
            return newStr;
        }

        if (org.charAt(index)=='a'){
            org = org.substring(1);
          return  removeChar(org,ch,index+1,newStr);
        }
        newStr.append(org.charAt(index));
        removeChar(org,ch,index+1,newStr);
        return newStr;
    }

    static String removeChar2(String org,String p){
        if (org.isEmpty()){
            return p;
        }
        char ch = org.charAt(0);
        if(ch=='a'){
            return removeChar2(org.substring(1),p);
        }
        return  removeChar2(org.substring(1),p+ch);
    }

//    remove 'apple' from string if exist
    static String removeApple(String org, String p){
        if (org.isEmpty()){
            return p;
        }
        char ch = org.charAt(0);
        if(org.startsWith("apple")){
            return removeApple(org.substring(5),p);
        }
        return  removeApple(org.substring(1),p+ch);
    }

    //    remove 'app' if without 'apple' from string if exist
    static String removeAppNotApple(String org, String p){
        if (org.isEmpty()){
            return p;
        }
        char ch = org.charAt(0);
        if(org.startsWith("app") && !org.startsWith("apple")){
            return removeAppNotApple(org.substring(3),p);
        }
        return  removeAppNotApple(org.substring(1),p+ch);
    }

//    subsequence
    static void subSeq(String org, String p){
        if (org.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = org.charAt(0);
        subSeq(org.substring(1),p+ch);
        subSeq(org.substring(1),p);
    }

    //    subsequence with Ascii value
    static void subSeqAscii(String org, String p){
        if (org.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = org.charAt(0);
        subSeqAscii(org.substring(1),p+ch);
        subSeqAscii(org.substring(1),p);
        subSeqAscii(org.substring(1),p+(ch+0));
    }


}
