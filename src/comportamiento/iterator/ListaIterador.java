package comportamiento.iterator;

import java.util.ArrayList;
import java.util.List;

public class ListaIterador<T> implements Iterador<T> {

    List<T> list = new ArrayList<>();
    private int index = 0;

    public void add(T data) {
        list.add(data);
    }

    @Override
    public boolean hasMore() {
        return index < list.size();
    }

    @Override
    public void reset() {
        index = 0;
    }

    @Override
    public T next() {
       T data =  list.get(index);
       index++;
       return data;
    }
}
