import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("массив 1");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println("массив 2");
        double[] numberTwo = {1.57, 7.654, 9.986};
        System.out.println(numberTwo[0]);
        System.out.println(numberTwo[1]);
        System.out.println(numberTwo[2]);
        System.out.println("массив 3");
        double[] numberRandom = {3.33, 2.2222, 23442, 25.1, 4.56};
        System.out.println(numberRandom[0]);
        System.out.println(numberRandom[1]);
        System.out.println(numberRandom[2]);
        System.out.println(numberRandom[3]);
        System.out.println(numberRandom[4]);
        System.out.println("Задача 1 конец");
        System.out.println("массив 1");
        System.out.print(number[0] + ", ");
        System.out.print(number[1] + ", ");
        System.out.println(number[2]);
        System.out.println("массив 2");
        System.out.print(numberTwo[0] + ", ");
        System.out.print(numberTwo[1] + ", ");
        System.out.println(numberTwo[2]);
        System.out.println("массив 3");
        System.out.print(numberRandom[0] + ", ");
        System.out.print(numberRandom[1] + ", ");
        System.out.print(numberRandom[2] + ", ");
        System.out.print(numberRandom[3] + ", ");
        System.out.println(numberRandom[4]);
        System.out.println("Задача 2 конец");
        System.out.println("массив 1");
        System.out.print(number[2] + ", ");
        System.out.print(number[1] + ", ");
        System.out.println(number[0]);
        System.out.println("массив 2");
        System.out.print(numberTwo[2] + ", ");
        System.out.print(numberTwo[1] + ", ");
        System.out.println(numberTwo[0]);
        System.out.println("массив 3");
        System.out.print(numberRandom[4] + ", ");
        System.out.print(numberRandom[3] + ", ");
        System.out.print(numberRandom[2] + ", ");
        System.out.print(numberRandom[1] + ", ");
        System.out.println(numberRandom[0]);
        System.out.println("Задача 3 конец");
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                number[i]++;
            }
        }
        System.out.println(Arrays.toString(number));
        System.out.println("Задача 4 конец");
    }
}