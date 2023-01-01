package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String S1="MOM";
        boolean isPalindrome=true;
        for(int i=0;i<S1.length()/2;i++){
            if(S1.charAt(i)!= S1.charAt(S1.length()-1-i)){
                isPalindrome=false;
                break;}
            }
       if(isPalindrome){
       System.out.println(" S1  is palindrome");}
       else{
           System.out.println("S2 is not a palindrome");
       }
    }


    }


