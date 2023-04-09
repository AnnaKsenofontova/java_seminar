// 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы

package lesson1;

public class MainHomework {
    public static void main(String[] args) {
        int [] array = { 22, 4, 92, 1, 5, 35 };
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > array[indexOfMax])
            {
                indexOfMax = i;
            }
            else if (array[i] < array[indexOfMin])
            {
                indexOfMin = i;
            }
        }
        System.out.println(indexOfMax + " " + indexOfMin);
    }
}
