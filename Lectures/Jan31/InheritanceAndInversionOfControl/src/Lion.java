// extend says that Lion is a subclass of Animal
public class Lion extends Animal {
    private boolean hasMane;

    public Lion(String name, boolean hasMane) {
        this.hasMane = hasMane;

        // a subclass can set the non-private instance variables of parent class
        this.name = name;
    }

    // introduces one's self enthusiastically
    // putting @Override is optional: it asks the compiler to double-check that this method implements
    //           introduceYourself from the parent class
    //         try changing the method signature: it causes a compiler error
    @Override
    public void introduceYourself() {
        System.out.print("I AM " + name.toUpperCase());
        if (hasMane) {
            System.out.println(" AND I HAVE A MANE");
        }
    }

    @Override
    public void introduceYourself(StringBuilder sb) {
        sb.append("I AM " + name.toUpperCase());
        if (hasMane) {
            sb.append(" AND I HAVE A MANE");
        }
    }

    @Override
    public String introduceYourselfValue() {
        String s = "I AM " + name.toUpperCase();
        if (hasMane) {
            s = s + " AND I HAVE A MANE";
        }
        return s;
    }
}
