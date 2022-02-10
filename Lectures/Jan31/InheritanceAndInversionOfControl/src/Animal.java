public abstract class Animal {
    // protected means that only this class and subclasses can see it
    protected String name;

    // abstract methods only have a signature (or, specification);
    // there is no body (or, implementation);
    // subclasses MUST provide an implementation of this method
    public abstract void introduceYourself();

    public abstract void introduceYourself(StringBuilder sb);

    public abstract String introduceYourselfValue();

    public static void main(String[] args) {
        // make an array of Animals
        Animal[] animals = new Animal[4];

        // add some Lion's and Mouse's
        animals[0] = new Lion("Simba", true);
        animals[1] = new Lion("Nala", false);
        animals[2] = new Mouse("Mickey", 90);

        // have all Animals introduce themselves; Animals print
        for (int i=0; i<3; i++) {
            animals[i].introduceYourself();
        }

        // In this version, the introductions return Strings; main code does the printing
        String introductions1 = "";
        for (int i=0; i<3; i++) {
            introductions1 = introductions1 + animals[i].introduceYourselfValue();
        }
        System.out.println(introductions1);

        // a different approach, where Animals add their introduction to a StringBuilder
        // This style of programming is called "inversion of control". Rather than this
        // main application code adding a String to the StringBuilder, each Animal does it.
        StringBuilder introductions2 = new StringBuilder();
        for (int i=0; i<3; i++) {
            animals[i].introduceYourself(introductions2);
        }
        System.out.println(introductions2);
    }
}
