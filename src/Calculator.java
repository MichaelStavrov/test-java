import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    static final String END = "s";
    static boolean isRunning = true;
    static int num1 = getInt();

    public static void main(String[] args) {
        while (isRunning) {
            char operation = getOperation();
            int num2 = getInt();
            int result = calc(num1, num2, operation);
            System.out.println("Результат: " + result);
            num1 = result;
        }
    }

    public static int getInt() {
        System.out.println("Введите число");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        }  else {
            checkEnd();
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        if (scanner.hasNext()) {
            checkEnd();
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int Sum(int operand1, int operand2) {
        return operand1 + operand2;
    }

    public static int Subtraction(int operand1, int operand2) {
        return operand1 - operand2;
    }

    public static int Multi(int operand1, int operand2) {
        return operand1 * operand2;
    }

    public static int Division(int operand1, int operand2) {
        return operand1 / operand2;
    }

    public static int calc(int num1, int num2, char operation) {
        return switch (operation) {
            case '+' -> Sum(num1, num2);
            case '-' -> Subtraction(num1, num2);
            case '*' -> Multi(num1, num2);
            case '/' -> Division(num1, num2);
            default -> {
                System.out.println("Операция не распознана. Повторите ввод.");
                yield calc(num1, num2, getOperation());
            }
        };

    }

    public static void checkEnd() {
        if (scanner.hasNext(END)) {
            System.out.println("Завершено");
            scanner.close();
            isRunning = false;
            System.exit(0);
        }
    }
}