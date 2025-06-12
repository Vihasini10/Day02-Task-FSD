package basicpackage.java;
import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many contacts do you want to add? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] names = new String[n];
        String[] phones = new String[n];

        // Input contacts using for loop
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for contact #" + (i + 1));
            System.out.print("Name: ");
            names[i] = scanner.nextLine();
            System.out.print("Phone: ");
            phones[i] = scanner.nextLine();
        }

        // Display contacts
        System.out.println("\n--- Your Contacts ---");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + names[i] + " - " + phones[i]);
            /*System.out.println((i + 1) + ". " + names[i]);
        	System.out.println("   " + phones[i]);
        	System.out.println("   " + email[i]);*/
        	System.out.println((i + 1) + ". " + names[i] + "\n" + phones[i] + "\n" + email[i]);
        }

        scanner.close();
    }
}
