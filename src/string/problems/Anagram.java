package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String s1 = "CAT";
        String s2 = "ACT";


        if (s1.length() != s2.length()) {
            System.out.println("not anagram");
        } else {

            char String1ToArray[] = s1.toCharArray();
            char String2ToArray[] = s2.toCharArray();

            Arrays.sort(String1ToArray);
            Arrays.sort(String2ToArray);
            if (Arrays.equals(String1ToArray, String2ToArray)) {
                System.out.println("Anagram");
            } else {

                System.out.println("Not Anagram");
            }


        }

    }


}



