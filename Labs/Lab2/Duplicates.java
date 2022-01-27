package Labs.Lab2;

import java.util.Arrays;

public class Duplicates {

    public static void main(String[] args) {
        System.out.println(NoDuplicates(new int[]{}));
        System.out.println(NoDuplicates(new int[]{-1, 1}));
        System.out.println(NoDuplicates(new int[]{4,22,100,99,1,5,7}));
        System.out.println(NoDuplicates(new int[]{4,22,100,99,22,5,7}));
    }

    public static boolean NoDuplicates(int[] x){
        int[] seenArray = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            int currentElement = x[i];
            if (Arrays.stream(seenArray).anyMatch(z -> z == currentElement)){
                return false;
            }
            seenArray[i] = x[i];
        }
        return true;
    }
}
// To solve this without a bunch of ugly for loops, I knew I had to figure out how to see if a
// value was in a list. I learned how to use the Arrays.stream().anyMatch() by doing some research.
// When the function starts I initialize an array that will store seen variables. Then, as I
// iterate through all the variables, I check if they are already in seenArray. If they are,
// return false immediately. If they aren't, keep checking through the list. Return true if
// never triggered.

// I started by researching how to check if an array contains something, then I wrote out the first try
// of the function I described above. I copied the test cases over and workshopped it until it functioned.
// I struggled with defining a new list and getting the .anyMatch function to work, but I got it in the end.