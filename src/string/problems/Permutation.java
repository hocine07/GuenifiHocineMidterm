package string.problems;

import java.util.ArrayList;

import java.util.List;

public class Permutation {

    public static void main(String[] args) {
        //Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
        //write a java program to compute all permutation of a String

        String s = "ABC";
        List<String> permutations = getPermutations(s);
        System.out.println("The permutations of " + s + " are: " + permutations);
    }

    public static List<String> getPermutations(String s) {
        List<String> permutations = new ArrayList<>();
        if (s.length() == 1) {
            permutations.add(s);
            return permutations;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String rest = s.substring(0, i) + s.substring(i+1);
            List<String> subPermutations = getPermutations(rest);
            for (String subPermutation : subPermutations) {
                permutations.add(c + subPermutation);
            }
        }

        return permutations;
    }


    }












