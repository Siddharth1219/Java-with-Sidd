// Input and Output in Java

//input and output is a process of taking input from the user and displaying output to the user.
//  In Java, we can take input from the user using the Scanner class and display output using System.out.println() method.




import java.util.Scanner; // Import the Scanner class
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object

        // Taking input from the user
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // Read user input

        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // Read user input

        // Displaying output to the user
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        sc.close(); // Close the scanner
    }
}





// java garbage collector- is a process by which the Java Virtual Machine (JVM) automatically manages memory by reclaiming memory occupied by objects that are no longer in use.
//  The garbage collector identifies and removes objects that are no longer reachable from the program, freeing up memory for new objects.
//  This helps prevent memory leaks and ensures efficient memory usage in Java applications.



// next class- is a class in Java that is used to read input from the user. It is part of the java.util package and provides methods to read different types of data, such as strings, integers, and floating-point numbers.
