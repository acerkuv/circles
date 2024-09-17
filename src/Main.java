

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        out.println("введите последовательно координаты цетров окружности x,у и радиусы");

        out.println("Окружность #1");
        int x = scanner.nextInt(); int y = scanner.nextInt(); int r = scanner.nextInt();

        out.println("Окружность #2");
        int x1 = scanner.nextInt(); int y1 = scanner.nextInt(); int r1 = scanner.nextInt();

        // Вывод результата проверки пересечения окружностей
        out.println(checkAcross(x, y, r, x1, y1, r1));
    }
    public static boolean checkAcross( int x, int y, int r, int x1, int y1, int r1){
        // Растояние между центрами окрудностей
        double a = Math.sqrt( Math.pow(x-x1, 2) + Math.pow( y - y1, 2));
        // Если оружность меньшего радиуса внутри большей окружности
        if ( a < r & a < r1) return false;
        // Если не пересекаются
        else if (r + r1 < a) {
            return false;
        }
        // Пересекаются
        else return true;
    }
}