package ua.com.alevel.Task2;

public class StaticMethod {
    public static <T> String printArray(T[] array) {
        String finalString = "";
        for (int i = 0; i < array.length; i++) {
            finalString += array[i] + ", ";
        }
        finalString = finalString.substring(0, finalString.length()-2);
        return finalString;
    }
}
