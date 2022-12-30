package string.problems;


import java.util.HashMap;
import java.util.Set;


public class DuplicateWord {

    public static <set> void main(String[] args) {

        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        String [] words= st.split(" ");
        HashMap<String, Integer> wordCount =new HashMap<String, Integer>();
        for(String word : words){
            if (wordCount.containsKey(word.toLowerCase())) {
                wordCount.put(word.toLowerCase(),wordCount.get(word.toLowerCase()) + 1);
            } else {
                wordCount.put(word.toLowerCase(), 1);
            }
        }
        Set<String> wordsInString=wordCount.keySet();
        for(String word: wordsInString){
            if(wordCount.get(word)>1){
                System.out.println(word+" : " +wordCount.get(word));
            }

        }
        }
    }
