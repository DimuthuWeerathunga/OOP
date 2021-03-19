import pkg1.Class1;

public class TestClass extends Class1 {
    public static void main(String[] args) {
        Class1 obj1 = new Class1();
        proMethod();
        obj1.proMethod();
        TestClass obj2 = new TestClass();
        obj2.proMethod();
    }
}
