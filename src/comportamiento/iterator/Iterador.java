package comportamiento.iterator;

public interface Iterador<T> {

    boolean hasMore();

    void reset();

    T next();

}
