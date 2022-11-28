import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Пример простого однопоточного приложения");
        MultiplicationTable.Calculation();

        System.out.println();
        System.out.println();

        System.out.println("Пример приложения расчета суммы двух чисел в многопоточном режиме( ввод числе идет с клавиатуры):");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println(Thread.currentThread());
        Thread newThread = new Thread(new Addition(a,b));
        newThread.start();

        System.out.println();
        System.out.println();
        System.out.println("Строковая информация с главной страницы Википедии:");
        Wiki.wikiParser();
    }
}