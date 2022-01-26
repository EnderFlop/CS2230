package KnowledgeChecks;

public class KnowledgeCheck1 {
    public static void main(String[] args) {

        int b = 0;

        int x = 0;

        while (b < 3) {
            System.out.println(x);
            x += 8;

            x += bar(x);

            b += 1;

        }

        System.out.println(x);

    }

    public static int bar(int b) {

        return b + b;

    }

    public static int foo(int b) {

        return b * 4;

    }
}
