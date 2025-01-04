import java.util.Arrays;
import java.util.function.UnaryOperator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Object {
    public static void main(String[] args) {

        Animal animal = new Animal("ABC", "Small");

        System.out.println(animal);

        Dog dog = new Dog();

        System.out.println(dog);

        final int number = 10;

        System.out.println("Number = " + number);

        int result = calculator((a,b) -> a + b, 5, 2);
        var result1 = calculator((a,b) -> a / b, 10.0, 2.5);
        var result2 = calculator((a,b) -> a + " " + b, "abc", "def");

        System.out.println("-".repeat(30));

        String[] strings = new String[10];
        Arrays.setAll(strings, (i) -> "" + (i + 1) + ". "
                + switch (i) {
                    case 0 -> "one";
                    case 1 -> "two";
                    default -> "";
                }
            );

        System.out.println(Arrays.toString(strings));

        UnaryOperator<String> words = s -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i = 0; i < s.length(); i++) {
                if( i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }

            return returnVal.toString();
        };

        System.out.println(words.apply("1234567890"));
    }

    public static <T> T calculator(LambdaFunctions<T> function, T value1, T value2 ) {
        T result = function.operate(value1, value2);
        System.out.println("Result of operation: " + result);

        return result;
    }
}