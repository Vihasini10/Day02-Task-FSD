package basicpackage.java;
import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vowels = 0, consonants = 0;

        System.out.println("Enter the name:");
        String name = sc.nextLine().toLowerCase();

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            		if (Character.isAlphabetic(ch)) {
             
                switch (ch) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                   
                        vowels++;
                        break;
                    default:
                        consonants++;
                        break;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}

