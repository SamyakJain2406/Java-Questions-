
/* Date: 16-10-2023. Write a Java program to identify and print the first unique character in a given string. */

import java.util.Scanner;

public class UniqueChar {
    
    public static char firstUniqueCharacter(String find) {
        int[] charCount = new int[26]; 

        // Count the frequency of each character in the string
        for (int i = 0; i < find.length(); i++) {
            charCount[find.charAt(i) - 'a']++;
        }

        // Iterate through the string to find the first unique character
        for (int i = 0; i < find.length(); i++) {
            if (charCount[find.charAt(i) - 'a'] == 1) {
                return find.charAt(i);
            }
        }


        // If no unique character is found, return a default value
         return 'N' ;
    }

    public static void main(String[] args) {
        System.out.print("Enter any String : ");
        Scanner userinput = new Scanner(System.in);
        String input = userinput.nextLine();
        
        char firstUnique = firstUniqueCharacter(input.replaceAll("\\s+", ""));
         
        userinput.close();

        if (firstUnique != 'N') {
            System.out.println("The first unique character is: " + firstUnique);
        } else {
            System.out.println("No unique character found in the input string.");
        }
    }
}
