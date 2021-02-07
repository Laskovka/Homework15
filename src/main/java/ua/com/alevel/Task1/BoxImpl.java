package ua.com.alevel.Task1;

import java.util.ArrayList;
import java.util.List;

public class BoxImpl {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        Box<String> stringFirstTask = new Box<>(stringList);
        Box<Integer> integerFirstTask = new Box<>(integerList);
        stringFirstTask.add("Hello!");
        integerFirstTask.add(1);
        System.out.println(stringFirstTask.get(0));
        System.out.println(integerFirstTask.get(0));
        System.out.println(integerFirstTask.get(1));
    }
}
