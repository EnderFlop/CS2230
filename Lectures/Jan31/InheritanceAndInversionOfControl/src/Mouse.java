// extend says that Mouse is a subclass of Animal
public class Mouse extends Animal {
    private int age;

    public Mouse(String name, int age) {
        this.age = age;

        // a subclass can set the non-private instance variables of parent class
        this.name = name;
    }

    // introduces one's self timidly
    // putting @Override is optional: it asks the compiler to double-check that this method implements
    //           introduceYourself from the parent class
    //         try changing the method signature: it causes a compiler error
    @Override
    public void introduceYourself() {
        System.out.println("i am " + name.toLowerCase() + " and I am " + age + " years old");
    }

    @Override
    public void introduceYourself(StringBuilder sb) {
        sb.append("i am " + name.toLowerCase() + " and I am " + age + " years old");
    }

    @Override
    public String introduceYourselfValue() {
        return "i am " + name.toLowerCase() + " and I am " + age + " years old";
    }

}
