public class MethodOverloading {
    public static void main(String[] args) {
        doSomething();
        doSomething(1);
        doSomething(2.0);
        doSomething(1,2);
    }

    public static void doSomething() {
        System.out.println("Method signature: doSomething()");
    }

    public static void doSomething(int a) {
        System.out.println("Method signature: doSomething(int)");
    }

    public static void doSomething(double a) {
        System.out.println("Method signature: doSomething(double)");
    }

    public static void doSomething(int a, int b) {
        System.out.println("Method signature: doSomething(int, int)");
    }
}
