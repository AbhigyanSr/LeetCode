package String;

import javax.management.remote.JMXServerErrorException;
import java.util.Arrays;

public class MergeStringsAlt1768 {
    public static String mergeAlternately(String word1,String word2){
        if(word1==null) return word2;
        if(word2==null) return word1;
        char[] firstword =word1.toCharArray();
        char[] secondword = word2.toCharArray();
        char[] formedword = new char[firstword.length+secondword.length];
        int i=0,j=0,k=0;
        while(i<firstword.length && j<secondword.length){
            formedword[k++]=firstword[i++];
            formedword[k++]=secondword[j++];
        }
        while (i < firstword.length) {
            formedword[k++] = firstword[i++];
        }
        while (j < secondword.length) {
            formedword[k++] = secondword[j++];
        }
        return Arrays.toString(formedword);
    }

    public static void main(String[] args) {
        String word1="Hello";
        String word2="heyy";
        String word3=mergeAlternately(word1,word2);
        System.out.println(word3);
    }
}
