//2. Создать приложение, которое отображает в окне консоли аргументы командной строки метода main()
// в обратном порядке.

package lab1;

import java.util.Arrays;

public class Lab1_1_2 {
    public static void main(String[] args) {
        printArgsReverse(args);
    }

    public static void printArgsReverse(String[] args) {
        String[] newArgs = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            newArgs[i] = args[args.length - 1 - i];
        }
        System.out.println(Arrays.toString(newArgs));
    }
}
