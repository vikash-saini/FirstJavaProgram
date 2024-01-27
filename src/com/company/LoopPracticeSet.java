package com.company;

public class LoopPracticeSet {

    // Function to return the string after
// reversing the alternate k characters
    static String revAlternateK(String s, int k, int len)
    {
        for (int i = 0; i < s.length();)
        {

            // If there are less than k characters
            // starting from the current position
            if (i + k > len)
                break;

            // Reverse first k characters
            s = s.substring(0, i) + new String(new StringBuilder(
                    s.substring(i, i + k)).reverse()) +
                    s.substring(i + k);

            // Skip the next k characters
            i += 1 * k;
        }
        return s;
    }

    public static void main(String[] args) {
//        print * pattern

        for (int i=4; i>0; i--){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

//        sum of even number
        int sum=0;
        int count = 3;
        for(int i=0; i<count; i++){
            sum = sum+(2*i);
        }
        System.out.print("sum of even number is :");
        System.out.println(sum);

//        print a table
        int r =5;
        for (int i=1; i<=10;i++){
            System.out.printf("%d x %d = %d\n",r,i,r*i);
        }

        int i=44;
        float f =98.42f;
        double d=103.67;
        f = (float) i;
        d = (double) f;
        i =(int) d;
        System.out.println("i="+i);
        System.out.println("f="+f);
        System.out.println("d="+d);

        int a = 43-26+71 / 3;
        int b = 12-4*2%3-21;
        if(++a > 71 && --b < 20){
            System.out.println("a="+a+"b="+b);
        }
        if (b-- == -97 || a-- <100){
            System.out.println("a="+a+"b="+b);
        }

        int x=20;
        int y = 25;
        if(++x <(y=y-=4) || (x=x+=4)>y){
            System.out.println(x+","+y);
        }

        int array_variable[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum1 = 0;
        for (int a1=0;a1<3;++a1)
            for (int b1 =0;b1<3;++b1)
                sum1 = sum1+ array_variable[a1][b1];
        System.out.println(sum1/5);


        int arr[][]=new int[3][];
        arr[0]=new int[1];
        arr[1]=new int[2];
        arr[2]=new int[3];
        int sum2=0;
        for(int k=0; k<3; ++k)
            for(int j=0;j<k+1;++j)
                arr[k][j]=j+1;
        for(int k=0;k<3;++k)
            for (int j=0;j<k+1;++j)
                sum2 += arr[k][j];
        System.out.println(sum2);

        String s = "ethnus";
        int len = s.length();
        int k = 2;
        System.out.println(revAlternateK(s, k, len));

    }
}
