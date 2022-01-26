package Lectures;

public class Jan24 {

    public static void main(String[] args) {
        System.out.println(MyMethod(10, 20));
    }

    static int MyMethod(int h, int k) {
        int total = 0;
        for (int i = 0; i < h; i++) {
            total += k;
        }
        return total;
    }
}


    //THINK IT'S B, PRINT 10

    // To display all webpages with the word herky and print them to the screen in alphabetical order.
    // Find all webpages and store them in a list
    // Sort the list alphabetically
    // Display

    //Think it will print 100. Lists are mutable, they do not need to be reassigned.
