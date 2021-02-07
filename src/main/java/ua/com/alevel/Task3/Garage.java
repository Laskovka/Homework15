package ua.com.alevel.Task3;

import java.util.ArrayList;
import java.util.List;


public class Garage<T extends Vehicle> {
    List<T> transport = new ArrayList<>();

    public T get(int i) {
        return transport.get(i);
    }

    public void add(T i) {
        transport.add(i);
    }

    public List<T> getByType(Class classType) {
        List<T> listForReturn = new ArrayList<>();
        for (int i = 0; i < transport.toArray().length; i++) {
            if (transport.get(i).getClass() == classType) {
                listForReturn.add(transport.get(i));
            }
        }
        return listForReturn;
    }
}

