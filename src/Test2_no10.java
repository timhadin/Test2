import java.util.Random;
import java.util.Scanner;
public class Test2_no10 {
    public static int evaluateExpression(String expression) {
        String[] tokens = expression.split(" ");
        int result = Integer.parseInt(tokens[0]);

        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            int number = Integer.parseInt(tokens[i + 1]);

            if (operator.equals("+")) {
                result += number;
            } else if (operator.equals("-")) {
                result -= number;
            }
        }
        return result;
    }

    public static void checkResult(String expression, int correctResult, int calculatedResult) {
        if (calculatedResult == correctResult) {
            System.out.println("정답입니다!");
        } else {
            System.out.println("틀렸습니다! \n" + expression + " = " + calculatedResult);
        }
    }

    public static boolean retry(Scanner scanner) {
        System.out.print("다시 한 번?(Yes_1/No_0): ");
        int retry = scanner.nextInt();
        scanner.nextLine();
        return retry == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            int x = random.nextInt(900) + 100; // 100부터 999까지의 랜덤 숫자 대입
            int y = random.nextInt(900) + 100;
            int z = random.nextInt(900) + 100;

            String[] expressions = {
                    x + " + " + y + " + " + z, // 4가지 수식 저장(배열의 요소마다 수식을 저장한다고 보면 된다.)
                    x + " + " + y + " - " + z,
                    x + " - " + y + " + " + z,
                    x + " - " + y + " - " + z
            };

            String expression = expressions[random.nextInt(expressions.length)]; // 수식이 저장된 배열 expressions에서
            // 랜덤으로 수식을 꺼내 expression에 대입
            int calculatedResult = evaluateExpression(expression);

            System.out.println(expression + " = ?");

            System.out.print("정답을 입력하세요: ");
            int correctResult = scanner.nextInt();

            checkResult(expression, correctResult, calculatedResult);

            if (!retry(scanner)) {
                break;
            }
        }
        scanner.close();
    }
}
