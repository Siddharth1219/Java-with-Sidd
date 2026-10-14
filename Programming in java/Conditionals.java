// Conditonals in java are used to perform different actions based on different conditions. The most common conditional statements in Java are if, else if, and else statements.

// 1. If statement
// 2. If Else statement
// 3. if Else if ladder
// 4. Nested if else statement
// 5.Ternary operator
// 6. Switch statement



// If statement: The if statement is used to test a condition. If the condition is true, the block of code inside the if statement is executed. If the condition is false, the block of code is skipped.

public class Conditionals {
    public static void main(String[] args) {
        int number = 10;


        // If statement
        if (number > 0) {
            System.out.println("The number is positive.");
        }




        // If Else statement
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }






        // If Else if ladder
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }





        // Nested if else statement
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("The number is positive and even.");
            } else {
                System.out.println("The number is positive and odd.");
            }
        } else {
            System.out.println("The number is not positive.");
        }






        // Ternary operator
        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println("The number is " + result + ".");





        
        // Switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}