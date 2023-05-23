import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1_2_3_4();
    }

    public static void task1_2_3_4() {
        //       System.out.println("задача 1");

        int[] array1 = new int[]{1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        int[] temperatureToday = {10, 7, 9, 17, 23, 22, 22, 15};

        System.out.println("задача 2");
        for (int i = 0; i < array1.length; i++) {
            String comma = (i == array1.length - 1) ? "" : ", ";
            System.out.print(array1[i] + comma);
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            String comma = (i == array2.length - 1) ? "" : ", ";
            System.out.print(array2[i] + comma);
        }
        System.out.println();
        for (int i = 0; i < temperatureToday.length; i++) {
            String comma = (i == temperatureToday.length - 1) ? "" : ", ";
            System.out.print(temperatureToday[i] + comma);
        }
        System.out.println();
        System.out.println("задача 3");
        for (int i = array1.length - 1; i >= 0; i--) {
            String comma = (i == 0) ? "" : ", ";
            System.out.print(array1[i] + comma);
        }
        System.out.println();
        for (int i = array2.length - 1; i >= 0; i--) {
            String comma = (i == 0) ? "" : ", ";
            System.out.print(array2[i] + comma);
        }
        System.out.println();
        for (int i = temperatureToday.length - 1; i >= 0; i--) {
            String comma = (i == 0) ? "" : ", ";
            System.out.print(temperatureToday[i] + comma);
        }
        System.out.println();
        System.out.println("задача 4");
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) array1[i] = array1[i] + 1;
        }
        System.out.print(Arrays.toString(array1));

    }
}