import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        int currentYear = 2022;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {
        String birthYear = System.console().readLine("Hi, what's your birth year? ");
        int age = currentYear - Integer.parseInt(birthYear);

        return "Age is = " + age;
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        String result = "Bad input";
        do {
            flag = true;
            System.out.println("Hi, what's your birth year? ");
            String birthYear = scanner.nextLine();

            int age = currentYear - Integer.parseInt(birthYear);

            if(age < 120 && age > 0) {
                flag = false;
                result = "Age is = " + age;
            }
            System.out.println(age);
        } while (flag);

        return result;
    }
}
