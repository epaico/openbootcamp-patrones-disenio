package comportamiento;

public interface Iterador<T> {

    boolean hasMore();

    void reset();

    T next();

}
