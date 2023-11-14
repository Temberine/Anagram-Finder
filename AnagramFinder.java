import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


    public class AnagramFinder {

        private static int CHARACTER_RANGE= 256;

public static boolean isAnagram(String string1, String string2) {
    if (string1.length() != string2.length()) {
        return false;
    }
    int count[] = new int[CHARACTER_RANGE];
    for (int i = 0; i < string1.length(); i++) {
        count[string1.charAt(i)]++;
        count[string2.charAt(i)]--;
    }
    for (int i = 0; i < CHARACTER_RANGE; i++) {
        if (count[i] != 0) {
            return false;
        }
    }
    return true;
}



        public static void main(String[] args) throws Exception {
             
            try{
                Scanner scanner= new Scanner(new File("D:\\School Stuff\\2022-2023 Fall Term\\enable.txt"));
                System.out.println("Enter a word to find anagram of:");
                Scanner input_word=new Scanner(System.in);
                String input=input_word.nextLine();

                while(scanner.hasNext()){
                    String word= scanner.next();
                    word=word.toLowerCase();
                    if(isAnagram(input, word)){
                        System.out.println(word);
                    }
                }

               
            } catch(Exception e){   
                System.out.println(e);
            }
    }

    }


    