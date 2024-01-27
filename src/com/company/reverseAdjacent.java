package com.company;

public class reverseAdjacent {

        static String swapAdjcent(String s, int k, int len)
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

            String s = "ethnus";
            int len = s.length();
            int k = 2;
            System.out.println(swapAdjcent(s, k, len));

        }

}
