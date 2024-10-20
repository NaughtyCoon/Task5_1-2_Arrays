import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int ArrayLength;
        while (true) {
            System.out.println("Введите количество чисел:");
            ArrayLength = scanner.nextInt();
            if (ArrayLength>1 && ArrayLength<21) break;
            if (ArrayLength<2) System.out.println("Слишком мало!");
            if (ArrayLength>20) System.out.println("Слишком много!");
        }
        int[] Number = new int[ArrayLength];
        for (int i=0; i<ArrayLength; i++) {
            System.out.println("Введите элемент массива " + i);
            Number[i] = scanner.nextInt();
        }
        System.out.println("Ваш массив: " + Arrays.toString(Number));
        int SumNumber = 0;
        int MaxNumber = Number[0];
        for (int i=0; i<ArrayLength; i++){
            if (Number[i]>MaxNumber) MaxNumber = Number[i];
            SumNumber += Number[i];
        }
        System.out.println("Наибольшее число: " + MaxNumber);
        System.out.println("Сумма всех чисел массива: " + SumNumber);

        scanner.close();
    }
}