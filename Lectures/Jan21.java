package Lectures;

public class Jan21 {
    public static void main(String[] args) {
        //void=no return, String[] is the type, args are what you pass in (must be Strings)
        int x0 = 1;
        int x4 = 10;
        float Dx = 0.1f;

        float sum = 0;
        float x = x0;
        while (x <= x4) {
            sum += square(x) * Dx;
            x += Dx;
        }

        System.out.println(sum);
    }
    public static float square(float a){
        return a*a;
    }
    //            ^^^ Declares output type
}
