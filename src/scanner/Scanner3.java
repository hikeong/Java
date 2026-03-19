package scanner;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세용: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세영: ");
        int num2 = scanner.nextInt();

        if(num1 < num2) {
            System.out.println("아! 알았어요 둘 중 더 큰 수는... " + num2);
        } else if (num1 > num2) {
            System.out.println("아! 알았어요 둘 중 더 큰 수는... " + num1);
        } else {
            System.out.println("두 수의 크기가 같네요~");
        }

    }
}
