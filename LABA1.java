import java.io.PrintStream;
import java.util.Scanner;
public class LABA1 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        out.println("Введите сколько кг бананов есть в наличии:"); // Выводим на экран фразу для ввода с клавиатуры
        int X = in.nextInt(); // Присваеваем целочисленной переменной X введенное с клавиатуры значение
        out.println("Введите сколько кг бананов хочет преобрести 1 покупатель:"); // Выводим на экран фразу для ввода с клавиатуры
        int A = in.nextInt(); // Присваеваем целочисленной переменной A введенное с клавиатуры значение
        out.println("Введите сколько кг бананов хочет преобрести 2 покупатель:"); // Выводим на экран фразу для ввода с клавиатуры
        int B = in.nextInt(); // Присваеваем целочисленной переменной B введенное с клавиатуры значение
        out.println("Введите сколько кг бананов хочет преобрести 3 покупатель:"); // Выводим на экран фразу для ввода с клавиатуры
        int C = in.nextInt(); // Присваеваем целочисленной переменной C введенное с клавиатуры значение
        out.println("Введите сколько кг бананов хочет преобрести 4 покупатель:"); // Выводим на экран фразу для ввода с клавиатуры
        int D = in.nextInt(); // Присваеваем целочисленной переменной D введенное с клавиатуры значение
        if (A >= X) { // Создаем условие: Если A (кол-во кг бананов, кот. хочет купить 1 покупатель) не меньше X (кол-во кг бананов, кот. есть в наличии магазина), то:
            out.println("1");
        } // Заканчиваем выполение тела оператора if
        else { //  Иначе
            if (A + B >= X) { // Создаем условие: Если сумма A (кол-во кг бананов, кот. хочет купить 1 покупатель) и B (кол-во кг бананов, кот. хочет купить 2 покупатель) не меньше X (кол-во кг бананов, кот. есть в наличии магазина), то:
                out.println("2"); // Выводим на экран ответ
            } // Заканчиваем выполение тела оператора if
            else { //  Иначе
                if (A + B + C >= X) { // Создаем условие: Если сумма A (кол-во кг бананов, кот. хочет купить 1 покупатель) и B (кол-во кг бананов, кот. хочет купить 2 покупатель) и С (кол-во кг бананов, кот. хочет купить 3 покупатель) не меньше X (кол-во кг бананов, кот. есть в наличии магазина), то:
                    out.println("3"); // Выводим на экран ответ
                } // Заканчиваем выполение тела оператора if
                else { //  Иначе
                    out.println("4"); // Выводим на экран ответ
                } // Заканчиваем выполение тела оператора else
            } // Заканчиваем выполение тела оператора else
        } // Заканчиваем выполение тела оператора else
    } //
} //
