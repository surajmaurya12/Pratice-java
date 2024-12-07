
public class IIB {
// Creating IIB Block IIB(Instance Initialization Block)
// IIB Means Instance Initialization Block to create an instance of a class IIB use to  { }.

    {
        int i = 10;
        int j = 20;
        int k = i + j;
        System.out.println(k);
    }

    public static void main(String[] args) {
        IIB obj1 = new IIB(); // Creating an object of IIB class
        IIB obj2 = new IIB(); // Creating an object of IIB class
        IIB obj3 = new IIB(); // Creating an object of IIB class
    }
}
