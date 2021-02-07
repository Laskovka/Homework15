package ua.com.alevel.Task7;

import java.util.ArrayList;
import java.util.List;

public class Quiz {

    public static void main(String[] args) {
        System.out.println(wildcardsTest(new ArrayList<>()));
    }

    //Можем получить только Object, не int
    public static Object wildcardsTest(List<? super Integer> numbers) {
        numbers.add(10);
        return numbers.get(0);
    }
}

