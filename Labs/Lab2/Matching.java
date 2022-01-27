package Labs.Lab2;

public class Matching {

    public static void main(String[] args) {
        System.out.println(find("", ""));
        System.out.println(find("", "a"));
        System.out.println(find("Hello World", "World"));
        System.out.println(find("World", "Hello World"));
        System.out.println(find("Hello World", "lo W"));
    }

    public static int find(String str, String sub){
        for (int i = 0; i < str.length() - sub.length() + 1; i++) {
            String currentSection = str.substring(i, i + sub.length());
            //System.out.println(currentSection);
            if (currentSection.equals(sub)){
                return i;
            }
        }
        return -1;
    }
}
