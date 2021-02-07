package ua.com.alevel.Task2;

public class StaticMethodImpl {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] strings = new String[]{"1с", "2с", "3с", "4с", "5с", "6с", "7с", "8с", "9с", "0с"};
        Character[] chars = new Character[] {'f', '$'};
        System.out.println(StaticMethod.printArray(integers));
        System.out.println(StaticMethod.printArray(strings));
        System.out.println(StaticMethod.printArray(chars));
    }
}
